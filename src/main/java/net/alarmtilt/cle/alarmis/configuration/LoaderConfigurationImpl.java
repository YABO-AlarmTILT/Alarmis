package net.alarmtilt.cle.alarmis.configuration;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.alarmtilt.cle.alarmis.model.ServiceConfig;

/**
 * Class for loading configuration (credential, service name) of service
 * 
 * @author Yaakoub
 *
 */
@Service
public class LoaderConfigurationImpl implements LoaderConfigurationService {

	// Logger
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Value("${service.configuration.file.link}")
	private String serviceConfigFileLink;

	private ServiceConfig serviceConfig;

	public ServiceConfig getServiceConfig() {
		return serviceConfig;
	}

	public void setServiceConfig(ServiceConfig serviceConfigList) {
		this.serviceConfig = serviceConfigList;
	}

	@PostConstruct
	public void loadServiceTable() throws IOException {
		// serviceConfigList = new ArrayList<>();
		logger.info("--> link of Routing file : {}", serviceConfigFileLink);
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> request = new HttpEntity<>(getHeaders(MediaType.APPLICATION_JSON));
		ResponseEntity<String> response = restTemplate.exchange(this.serviceConfigFileLink, HttpMethod.GET, request,
				String.class);
		logger.info("--> HTTP response code :{}   returned by : {} ", response.getStatusCodeValue(),
				serviceConfigFileLink);
		String contentFile = response.getBody();
		// --- Start : Parsing the content returned by link of file
		JsonParser parser = new JsonParser();
		JsonObject obj = parser.parse(contentFile.toString()).getAsJsonObject();

		// --- get the content field
		String encodedContent = obj.get("content").getAsString();
		String decodedContent = this.base64Decode(encodedContent);

		Gson gson = new Gson();
		setServiceConfig( gson.fromJson(decodedContent, ServiceConfig.class));
		logger.info(serviceConfig.toString());
	}

	/**
	 * functions used only for purposes of this class
	 * 
	 * @param content
	 * @return
	 */
	private String base64Decode(String content) {
		byte[] decodedBytes = Base64.decodeBase64(content);
		return new String(decodedBytes, Charset.forName("UTF-8"));
	}

	/**
	 * Add HTTP Authorization header, using Basic-Authentication to send
	 * user-credentials.
	 * 
	 * @param mediaType
	 * @return
	 */
	private HttpHeaders getHeaders(MediaType mediaType) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic ");
		headers.setAccept(Arrays.asList(mediaType));
		return headers;
	}

	@Override
	public ServiceConfig getConfigOfService() {

		ServiceConfig sc = new ServiceConfig();
		sc = this.getServiceConfig();

		return sc;
	}

}

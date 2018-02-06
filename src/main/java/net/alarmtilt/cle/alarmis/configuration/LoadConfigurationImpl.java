package net.alarmtilt.cle.alarmis.configuration;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import com.google.gson.reflect.TypeToken;

import net.alarmtilt.cle.alarmis.model.ServiceConfig;

/**
 * Class for loading configuration (credential, service name) of service
 * 
 * @author Yaakoub
 *
 */
@Service
public class LoadConfigurationImpl implements LoaderConfigurationService {

	// Logger
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Value("${service.configuration.file.link}")
	private String serviceConfigFileLink;

	private List<ServiceConfig> serviceConfigList;

	public List<ServiceConfig> getServiceConfigList() {
		return serviceConfigList;
	}

	public void setServiceConfigList(List<ServiceConfig> serviceConfigList) {
		this.serviceConfigList = serviceConfigList;
	}

	@PostConstruct
	public void loadServiceTable() throws IOException {
		serviceConfigList = new ArrayList<>();
		logger.info("--> link of Routing file : " + this.serviceConfigFileLink);
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> request = new HttpEntity<>(getHeaders(MediaType.APPLICATION_JSON));
		ResponseEntity<String> response = restTemplate.exchange(this.serviceConfigFileLink, HttpMethod.GET, request,
				String.class);
		logger.info("--> HTTP response code : " + response.getStatusCodeValue() + " returned by : "
				+ this.serviceConfigFileLink);
		String contentFile = response.getBody();
		// --- Start : Parsing the content returned by link of file
		JsonParser parser = new JsonParser();
		JsonObject obj = parser.parse(contentFile.toString()).getAsJsonObject();

		// --- get the content field
		String encodedContent = obj.get("content").getAsString();
		String decodedContent = this.base64Decode(encodedContent);

		Gson gson = new Gson();
		Type type = new TypeToken<List<ServiceConfig>>() {
		}.getType();
		this.setServiceConfigList(gson.fromJson(decodedContent, type));

		for (ServiceConfig serviceConfig : this.serviceConfigList)
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

	/*
	 * Return credential of Service 
	 * (non-Javadoc)
	 * @see net.alarmtilt.cle.alarmis.configuration.LoaderConfigurationService#getConfigOfService()
	 */
	@Override
	public ServiceConfig getConfigOfService() {

		ServiceConfig sc = new ServiceConfig();
		sc = this.getServiceConfigList().get(0);

		return sc;
	}

}

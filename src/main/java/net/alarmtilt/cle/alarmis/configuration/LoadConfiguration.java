package net.alarmtilt.cle.alarmis.configuration;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONException;
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

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;





/**
 * Class for loading configuration (credential, service name) of service
 * 
 * @author Yaakoub
 *
 */
@Service
public class LoadConfiguration {
	/**
	// Logger
		private final Logger logger = LoggerFactory.getLogger(this.getClass());
		
		@Value("${voice.routing.file.link}")
		private String voiceRoutingFileLink;
		@Value("${voice.routing.file.credentials.user}")
		private String voiceRoutingFileCredentialsUser;
		@Value("${voice.routing.file.credentials.password}")
		private String voiceRoutingFileCredentialsPassword;

	@PostConstruct
	public void loadServiceTable() throws IOException, JSONException {
		logger.info("--> link of Routing file : " + this.voiceRoutingFileLink);
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> request = new HttpEntity<>(getHeaders(MediaType.APPLICATION_JSON));
		ResponseEntity<String> response = restTemplate.exchange(this.voiceRoutingFileLink, HttpMethod.GET, request,
				String.class);
		logger.info("--> HTTP response code : " + response.getStatusCodeValue() + " returned by : "
				+ this.voiceRoutingFileLink);
		String contentFile = response.getBody();
		// --- Start : Parsing the content returned by link of file
		JsonParser parser = new JsonParser();
		JsonObject obj = parser.parse(contentFile.toString()).getAsJsonObject();
		
		// --- get the content field
		String encodedContent = obj.get("content").getAsString();
		String decodedContent = this.base64Decode(encodedContent);

//		Gson gson = new Gson();
//		Type type = new TypeToken<List<VoiceRoute>>() {
//		}.getType();
//		this.setVoiceRoutes(gson.fromJson(decodedContent, type));


		
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
		//String plainCredentials = this.voiceRoutingFileCredentialsUser + ":" + this.voiceRoutingFileCredentialsPassword;
		//String base64Credentials = new String(Base64.encodeBase64(plainCredentials.getBytes()));
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic ");
		headers.setAccept(Arrays.asList(mediaType));
		return headers;
	}
	
	
}

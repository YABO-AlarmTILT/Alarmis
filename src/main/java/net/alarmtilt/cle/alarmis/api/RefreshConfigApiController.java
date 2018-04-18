package net.alarmtilt.cle.alarmis.api;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.alarmtilt.cle.alarmis.configuration.LoaderConfigurationImpl;
import net.alarmtilt.cle.alarmis.model.ServiceConfig;

@Controller
public class RefreshConfigApiController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private LoaderConfigurationImpl loadConfigurationImpl;

	@RequestMapping(value = "/refreshseviceconfig", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> refreshServiceConfig() throws IOException {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		loadConfigurationImpl.loadServiceTable();
		ServiceConfig serviceConfig = loadConfigurationImpl.getServiceConfig();
		String jsonServiceConfig = gson.toJson(serviceConfig);
		logger.info("Service rules configuration: {} ", jsonServiceConfig);
		return new ResponseEntity<>(jsonServiceConfig, HttpStatus.OK);
	}
}

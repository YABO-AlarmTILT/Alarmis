package net.alarmtilt.cle.alarmis.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import net.alarmtilt.cle.alarmis.client.AlarmTILTRestrictedWebService;
import net.alarmtilt.cle.alarmis.client.AuthParam;
import net.alarmtilt.cle.alarmis.client.AuthRoleEnum;
import net.alarmtilt.cle.alarmis.client.AuthType;
import net.alarmtilt.cle.alarmis.client.LaunchProcedureParam;
import net.alarmtilt.cle.alarmis.client.LaunchProcedureResult;
import net.alarmtilt.cle.alarmis.client.LaunchProcedureResultEnum;
import net.alarmtilt.cle.alarmis.client.ProcedureVariable;
import net.alarmtilt.cle.alarmis.client.WsResV3;
import net.alarmtilt.cle.alarmis.model.AlertMessage;
import net.alarmtilt.cle.alarmis.service.BuildObjetMessageFactoryService;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-15T09:40:16.368Z")

@Controller
public class AlarmisEventApiController implements AlarmisEventApi {

	private static final Logger log = LoggerFactory.getLogger(AlarmisEventApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;
	private final BuildObjetMessageFactoryService buildObjetMessageFactoryService;

	private static AuthType AUTH_TYPE = AuthType.BASIC;
	private static String AUTH_DN = "tdevgea@test.fr";
	private static String AUTH_PW = "tdevgeapw";

	private static String PROCEDURE_DEFINITION_NAME = "Alarmis";

	@org.springframework.beans.factory.annotation.Autowired
	public AlarmisEventApiController(ObjectMapper objectMapper, HttpServletRequest request,
			BuildObjetMessageFactoryService buildObjetMessageFactoryService) {
		this.objectMapper = objectMapper;
		this.request = request;
		this.buildObjetMessageFactoryService = buildObjetMessageFactoryService;
	}

	public ResponseEntity<Void> alarmisEventPost(
			@ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody String body) {
		String accept = request.getHeader("Accept");

		WsResV3 service = new WsResV3();
		AlarmTILTRestrictedWebService port = service.getAlarmTILTRestrictedWebServicePort();

		AuthParam authParam = new AuthParam();
		authParam.setAuthDn(AUTH_DN);
		authParam.setAuthPw(AUTH_PW);
		authParam.setAuthType(AUTH_TYPE);
		authParam.setAuthRole(AuthRoleEnum.PROCEDURE_LAUNCHER);

		LaunchProcedureParam launchProcedureParam = new LaunchProcedureParam();
		launchProcedureParam.setProcedureName(PROCEDURE_DEFINITION_NAME);
		

		try {
			log.info(""+body.toString());
			 AlertMessage alertMessage = buildObjetMessageFactoryService.parseXMLFile(body);

			ProcedureVariable variable = null;

			variable = new ProcedureVariable();
			variable.setName("account");
			variable.setValue(alertMessage.getGenericAlert().getAccount().toString());
			launchProcedureParam.getVariables().add(variable);

			variable = new ProcedureVariable();
			variable.setName("event");
			variable.setValue(alertMessage.getGenericAlert().getEvent());
			launchProcedureParam.getVariables().add(variable);

			variable = new ProcedureVariable();
			variable.setName("zone");
			variable.setValue(alertMessage.getGenericAlert().getZone());
			launchProcedureParam.getVariables().add(variable);

			LaunchProcedureResult launchProcedureResult = port.launchProcedure(authParam, launchProcedureParam);

			log.info("launchProcedure result:<" + launchProcedureResult.getResult() + ">");
			if (LaunchProcedureResultEnum.OK.equals(launchProcedureResult.getResult())) {
				log.info("procedure has been successfully launched, procedure instance id=<"
						+ launchProcedureResult.getProcedureInstance().getId() + ">");
			}

			log.info("END.");
		} catch (IOException | SAXException | ParserConfigurationException e) {
			log.error("Error "+e);
			return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
		}
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

}

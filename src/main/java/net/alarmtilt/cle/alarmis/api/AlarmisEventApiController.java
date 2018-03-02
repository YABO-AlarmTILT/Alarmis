package net.alarmtilt.cle.alarmis.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import net.alarmtilt.cle.alarmis.client.AlarmTILTRestrictedWebService;
import net.alarmtilt.cle.alarmis.client.AuthParam;
import net.alarmtilt.cle.alarmis.client.AuthRoleEnum;
import net.alarmtilt.cle.alarmis.client.AuthType;
import net.alarmtilt.cle.alarmis.client.LaunchProcedureParam;
import net.alarmtilt.cle.alarmis.client.LaunchProcedureResult;
import net.alarmtilt.cle.alarmis.client.LaunchProcedureResultEnum;
import net.alarmtilt.cle.alarmis.client.ProcedureVariable;
import net.alarmtilt.cle.alarmis.client.WsResV3;
import net.alarmtilt.cle.alarmis.configuration.LoaderConfigurationService;
import net.alarmtilt.cle.alarmis.model.AlertMessage;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-15T09:40:16.368Z")

@Controller
public class AlarmisEventApiController {

	private static final Logger log = LoggerFactory.getLogger(AlarmisEventApiController.class);
	@Autowired
	private LoaderConfigurationService loaderConfigurationService;

	private static AuthType AUTH_TYPE = AuthType.BASIC;

	public void launchAlert(AlertMessage alertMessage) {
		log.info("***************** START launchProcedure  **************************************** ");
		if (loaderConfigurationService != null) {
			WsResV3 service = new WsResV3();
			AlarmTILTRestrictedWebService port = service.getAlarmTILTRestrictedWebServicePort();

			AuthParam authParam = new AuthParam();

			authParam.setAuthDn(loaderConfigurationService.getConfigOfService().getUidAT().trim());
			log.info("AlarmTILT Credential UID : " + loaderConfigurationService.getConfigOfService().getUidAT().trim());
			authParam.setAuthPw(loaderConfigurationService.getConfigOfService().getPwdAT().trim());
			log.info("AlarmTILT Credential PWD : " + loaderConfigurationService.getConfigOfService().getPwdAT().trim());
			authParam.setAuthType(AUTH_TYPE);
			authParam.setAuthRole(AuthRoleEnum.PROCEDURE_LAUNCHER);

			LaunchProcedureParam launchProcedureParam = new LaunchProcedureParam();
			launchProcedureParam.setProcedureName(
					loaderConfigurationService.getConfigOfService().getService().trim().toLowerCase());
			log.info("PROCEDURE NAME  : "
					+ loaderConfigurationService.getConfigOfService().getService().trim().toLowerCase());

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
		} else {
			log.error("ERROR IN launchProcedure THE CONFIG SERVICE IS NULL  " + loaderConfigurationService);
		}
		log.info("***************** END launchProcedure  **************************************** ");
	}

}

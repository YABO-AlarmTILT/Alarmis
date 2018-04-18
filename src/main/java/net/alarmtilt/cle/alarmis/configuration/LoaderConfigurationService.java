package net.alarmtilt.cle.alarmis.configuration;

import net.alarmtilt.cle.alarmis.model.CredentialClient;
import net.alarmtilt.cle.alarmis.model.ServiceConfig;

public interface LoaderConfigurationService {

	ServiceConfig getConfigOfService();

	CredentialClient getCurrentCredentialClient();

	void setCurrentCredentialClient(CredentialClient currentCredentialClient);

}

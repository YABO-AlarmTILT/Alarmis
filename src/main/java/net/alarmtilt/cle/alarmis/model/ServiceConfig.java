package net.alarmtilt.cle.alarmis.model;

public class ServiceConfig {

	String service;
	Integer portService;
	String ipService;
	Integer timeOut;
	String eclipsVersion;
	CredentialClient credentialClient;
	Integer priority;
	Boolean active;
	String stage;
	
	
	
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public Integer getPortService() {
		return portService;
	}
	public void setPortService(Integer portService) {
		this.portService = portService;
	}
	public String getIpService() {
		return ipService;
	}
	public void setIpService(String ipService) {
		this.ipService = ipService;
	}
	public Integer getTimeOut() {
		return timeOut;
	}
	public void setTimeOut(Integer timeOut) {
		this.timeOut = timeOut;
	}
	public CredentialClient getCredentialClient() {
		return credentialClient;
	}
	public void setCredentialClient(CredentialClient credentialClient) {
		this.credentialClient = credentialClient;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	
	public String getEclipsVersion() {
		return eclipsVersion;
	}
	public void setEclipsVersion(String eclipsVersion) {
		this.eclipsVersion = eclipsVersion;
	}
	@Override
	public String toString() {
		return "ServiceConfig [service=" + service + ", portService=" + portService + ", ipService=" + ipService
				+ ", timeOut=" + timeOut + ", eclipsVersion=" + eclipsVersion + ", credentialClient=" + credentialClient
				+ ", priority=" + priority + ", active=" + active + ", stage=" + stage + "]";
	}

}

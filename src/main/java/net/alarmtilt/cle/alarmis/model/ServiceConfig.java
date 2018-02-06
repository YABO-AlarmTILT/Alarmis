package net.alarmtilt.cle.alarmis.model;

public class ServiceConfig {

	String service;
	String account;
	String accountAT;
	String pwdAT;
	String priority;
	String active;
	String stage;
	String ipService;
	int portService;
	
	


	public String getIpService() {
		return ipService;
	}

	public void setIpService(String ipService) {
		this.ipService = ipService;
	}

	public int getPortService() {
		return portService;
	}

	public void setPortService(int portService) {
		this.portService = portService;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountAT() {
		return accountAT;
	}

	public void setAccountAT(String accountAT) {
		this.accountAT = accountAT;
	}

	public String getPwdAT() {
		return pwdAT;
	}

	public void setPwdAT(String pwdAT) {
		this.pwdAT = pwdAT;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	@Override
	public String toString() {
		return "ServiceConfig [service=" + service + ", account=" + account + ", accountAT=" + accountAT + ", pwdAT="
				+ pwdAT + ", priority=" + priority + ", active=" + active + ", stage=" + stage + ", ipService="
				+ ipService + ", portService=" + portService + "]";
	}



}

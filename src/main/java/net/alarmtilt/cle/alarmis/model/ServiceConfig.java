package net.alarmtilt.cle.alarmis.model;

import java.util.ArrayList;

public class ServiceConfig {

	String service;
	Integer portService;
	Integer timeOut;
	String eclipsVersion;
	ArrayList<CredentialClient> credentialClientlist = new ArrayList<>();
	Integer nbrOfRetry;
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
	public Integer getTimeOut() {
		return timeOut;
	}
	public void setTimeOut(Integer timeOut) {
		this.timeOut = timeOut;
	}
	public String getEclipsVersion() {
		return eclipsVersion;
	}
	public void setEclipsVersion(String eclipsVersion) {
		this.eclipsVersion = eclipsVersion;
	}
	public ArrayList<CredentialClient> getCredentialClientlist() {
		return credentialClientlist;
	}
	public void setCredentialClientlist(ArrayList<CredentialClient> credentialClientlist) {
		this.credentialClientlist = credentialClientlist;
	}
	public Integer getNbrOfRetry() {
		return nbrOfRetry;
	}
	public void setNbrOfRetry(Integer nbrOfRetry) {
		this.nbrOfRetry = nbrOfRetry;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((credentialClientlist == null) ? 0 : credentialClientlist.hashCode());
		result = prime * result + ((eclipsVersion == null) ? 0 : eclipsVersion.hashCode());
		result = prime * result + ((nbrOfRetry == null) ? 0 : nbrOfRetry.hashCode());
		result = prime * result + ((portService == null) ? 0 : portService.hashCode());
		result = prime * result + ((service == null) ? 0 : service.hashCode());
		result = prime * result + ((timeOut == null) ? 0 : timeOut.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServiceConfig other = (ServiceConfig) obj;
		if (credentialClientlist == null) {
			if (other.credentialClientlist != null)
				return false;
		} else if (!credentialClientlist.equals(other.credentialClientlist))
			return false;
		if (eclipsVersion == null) {
			if (other.eclipsVersion != null)
				return false;
		} else if (!eclipsVersion.equals(other.eclipsVersion))
			return false;
		if (nbrOfRetry == null) {
			if (other.nbrOfRetry != null)
				return false;
		} else if (!nbrOfRetry.equals(other.nbrOfRetry))
			return false;
		if (portService == null) {
			if (other.portService != null)
				return false;
		} else if (!portService.equals(other.portService))
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		if (timeOut == null) {
			if (other.timeOut != null)
				return false;
		} else if (!timeOut.equals(other.timeOut))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ServiceConfig [service=" + service + ", portService=" + portService + ", timeOut=" + timeOut
				+ ", eclipsVersion=" + eclipsVersion + ", credentialClientlist=" + credentialClientlist
				+ ", nbrOfRetry=" + nbrOfRetry + "]";
	}
	
	

}

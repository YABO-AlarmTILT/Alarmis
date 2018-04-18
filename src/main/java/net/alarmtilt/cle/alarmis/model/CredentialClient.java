package net.alarmtilt.cle.alarmis.model;

public class CredentialClient {

	String uid;
	String pwd;
	Integer account;
	String zone;
	String event;
	String uidAT;
	String pwdAT;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getAccount() {
		return account;
	}
	public void setAccount(Integer account) {
		this.account = account;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getUidAT() {
		return uidAT;
	}
	public void setUidAT(String uidAT) {
		this.uidAT = uidAT;
	}
	public String getPwdAT() {
		return pwdAT;
	}
	public void setPwdAT(String pwdAT) {
		this.pwdAT = pwdAT;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((pwdAT == null) ? 0 : pwdAT.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		result = prime * result + ((uidAT == null) ? 0 : uidAT.hashCode());
		result = prime * result + ((zone == null) ? 0 : zone.hashCode());
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
		CredentialClient other = (CredentialClient) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (pwdAT == null) {
			if (other.pwdAT != null)
				return false;
		} else if (!pwdAT.equals(other.pwdAT))
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		if (uidAT == null) {
			if (other.uidAT != null)
				return false;
		} else if (!uidAT.equals(other.uidAT))
			return false;
		if (zone == null) {
			if (other.zone != null)
				return false;
		} else if (!zone.equals(other.zone))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CredentialClient [uid=" + uid + ", pwd=" + pwd + ", account=" + account + ", zone=" + zone + ", event="
				+ event + ", uidAT=" + uidAT + ", pwdAT=" + pwdAT + "]";
	}

	
	
	

	
}

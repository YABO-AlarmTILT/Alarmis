package net.alarmtilt.cle.alarmis.model;

public class CredentialClient {

	String uid;
	String pwd;
	Integer account;
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
	@Override
	public String toString() {
		return "CredentialClient [uid=" + uid + ", pwd=" + pwd + ", account=" + account + "]";
		
	}
	
}

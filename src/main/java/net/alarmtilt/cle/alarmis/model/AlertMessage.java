package net.alarmtilt.cle.alarmis.model;


/**
 * alertMessage using for mapping xml node getting from Alarmis server
 * @author Yaakoub
 *
 */
public class AlertMessage {

	String name;
	String uid;
	String pwd;
	String destination;
	String sid;
	GenericAlert genericAlert;
	String responseMessage;
	
	

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public GenericAlert getGenericAlert() {
		return genericAlert;
	}

	public void setGenericAlert(GenericAlert genericAlert) {
		this.genericAlert = genericAlert;
	}

	@Override
	public String toString() {
		return "AlertMessage [name=" + name + ", uid=" + uid + ", pwd=" + pwd + ", destination=" + destination
				+ ", sid=" + sid + ", genericAlert=" + genericAlert + ", responseMessage=" + responseMessage + "]";
	}

}

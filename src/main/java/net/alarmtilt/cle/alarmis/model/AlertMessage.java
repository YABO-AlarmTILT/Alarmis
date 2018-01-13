package net.alarmtilt.cle.alarmis.model;


/**
 * alertMessage using for mapping xml node getting from alarmis serveur
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
				+ ", sid=" + sid + ", genericAlert=" + genericAlert + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((genericAlert == null) ? 0 : genericAlert.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((sid == null) ? 0 : sid.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
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
		AlertMessage other = (AlertMessage) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (genericAlert == null) {
			if (other.genericAlert != null)
				return false;
		} else if (!genericAlert.equals(other.genericAlert))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (sid == null) {
			if (other.sid != null)
				return false;
		} else if (!sid.equals(other.sid))
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}

}

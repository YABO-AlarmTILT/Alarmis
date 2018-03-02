package net.alarmtilt.cle.alarmis.model;

/**
 * genericAlert using for mapping xml node getting from alarmis serveur
 * @author Yaakoub
 *
 */
public class GenericAlert {

	String name;
	Integer account;
	String event;
	String zone;
	String zoneName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getZoneName() {
		return zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	@Override
	public String toString() {
		return "GenericAlert [name=" + name + ", account=" + account + ", event=" + event + ", zone=" + zone
				+ ", zoneName=" + zoneName + "]";
	}

}

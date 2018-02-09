package net.alarmtilt.cle.alarmis.api;

public class RunTEST {

	public static void main(String[] args) {
		String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>";
				str+="<message pwd=\"tdevgeapw\" sid=\"\" uid=\"tdevgea@test.fr\" name=\"generic alert\" destination=\"AlarmTILT\">";
						str+="<generic_alert account=\"8034\" event=\"ZA\" zone= \"11\" />";
								str+="</message";
								System.out.println(str.length());
								String dataLine = "Data-Length: 4555";
								
								
								
								if (dataLine.contains("Data-Length: ")){
									String result =  dataLine.substring(dataLine.lastIndexOf(":")+1);
									System.out.println(result);
								}
								
	}

}

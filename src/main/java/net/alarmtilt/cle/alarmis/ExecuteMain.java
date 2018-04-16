package net.alarmtilt.cle.alarmis;

import org.apache.commons.lang3.StringUtils;

public class ExecuteMain {

	public static void main(String[] args) {

	

	}

	static void replaceFunction(String chaine) {
		
		StringBuilder result = new StringBuilder();
		String regex = "[.,?!;]";
		boolean hasCharSpec = false;
		boolean hasEspace = false;
		char prevouisCar = 0;
		
		
		//1. normalize les espaces
		chaine = StringUtils.normalizeSpace(chaine);

		for (int i = 0; i < chaine.length(); i++) {
			char cursor = chaine.charAt(i);
			
			
			
			
			
			
			
			
			
			// si cursor est un caratere special
			if (Character.toString(cursor).matches(regex)) {
				if (i == 0) {
					continue;
				} else if (i == chaine.length() - 1 && cursor == '.' ) {
					result.append(cursor);
				} else {

					hasCharSpec = true;
					prevouisCar = cursor;
				}
				// si le cursor est espace
			}
			
			
		}

	}

}

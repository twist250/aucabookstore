package com.webpro.bookstore2.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistrictConstants {
	

	public final static Map<String, String> districts = new HashMap<String, String>() {
		{
            put("GASABO", "GASABO");
            put("NYARUGENGE", "NYARUGENGE");
            put("KIREHE", "KIREHE");
            put("RWAMAGANA", "RWAMAGANA");
            put("NGOMA", "NGOMA");
            put("BUGESERA", "BUGESERA");
            put("KAYONZA", "KAYONZA");
            put("MUSANZE", "MUSANZE");
            put("GICUMBI", "GICUMBI");
            put("KICUKIRO", "KICUKIRO");
            put("HUYE", "HUYE");
            put("RUHANGO", "RUHANGO");
		}
	};
	
	public final static List<String> listOfDistrictCode = new ArrayList<>(districts.keySet());

}

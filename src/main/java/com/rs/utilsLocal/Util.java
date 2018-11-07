package com.rs.utilsLocal;

import org.codehaus.jackson.map.ObjectMapper;

public class Util {
	
	public static <T> T getRequestBodyModelFromString(String reqBodyString, Class<T> class1) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		T reqBody = null;
		try {
			reqBody = mapper.readValue(reqBodyString, class1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return reqBody;
	}

}

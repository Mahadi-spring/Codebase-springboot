package com.application.shared.utility;



import org.json.JSONArray;
import org.json.JSONObject;

import io.micrometer.common.util.StringUtils;


public class Def {
	
	static String dateFormat;

	public final static String stringType = "String";
	public final static String longType = "Long";
	public final static String floatType = "Float";
	public final static String doubleType = "Double";
	public final static String intType = "int";
	public final static String integerType = "Integer";
	public final static String stringTypeArray = "StringArray";
	public final static String longTypeArray = "LongArray";
	public final static String floatTypeArray = "FloatArray";
	public final static String doubleTypeArray = "DoubleArray";
	public final static String integerTypeArray = "IntegerArray";
	public final static String intTypeArray = "intArray";
	
	
	public static JSONObject initJSONObject() {
		JSONObject json = new JSONObject();
		return json;
	}
	
	public static String getString(JSONObject json, String key) {
	    return json.optString(key, null);
	}
	
	public static Long getLong(JSONObject json, String key) {
        String value = json.optString(key, null);
        return StringUtils.isNotBlank(value) ? Long.parseLong(value) : null;
    }
	
	public static Integer getInteger(JSONObject json, String key) {
        String value = json.optString(key, null);
        return StringUtils.isNotBlank(value) ? Integer.parseInt(value) : null;
    }

    public static Boolean getBoolean(JSONObject json, String key) {
        String value = json.optString(key, null);
        return StringUtils.isNotBlank(value) ? Boolean.parseBoolean(value) : null;
    }
    
    public static Float getFloat(JSONObject json, String key) {
        String value = json.optString(key, null);
        return StringUtils.isNotBlank(value) ? Float.parseFloat(value) : null;
    }

    public static Double getDouble(JSONObject json, String key) {
        String value = json.optString(key, null);
        return StringUtils.isNotBlank(value) ? Double.parseDouble(value) : null;
    }
    
    public static Object getObject(JSONObject json, String key) {
        return json.opt(key);
    }
    
    public static String getArrayString(JSONObject json, String key) {
        if (json.has(key)) {
            JSONArray jsonArray = json.optJSONArray(key);
            if (jsonArray != null && jsonArray.length() > 0) {
                return jsonArray.toString();
            }
        }
        return null;
    }
    
    public static Object getArrayObj(JSONObject json, String key) {
        if (json.has(key)) {
            JSONArray jsonArray = json.optJSONArray(key);
            if (jsonArray != null && jsonArray.length() > 0) {
                return jsonArray;
            }
        }
        return null;
    }
	

}

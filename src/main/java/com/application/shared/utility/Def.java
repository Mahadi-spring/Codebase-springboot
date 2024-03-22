package com.application.shared.utility;

import org.json.JSONObject;

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

}

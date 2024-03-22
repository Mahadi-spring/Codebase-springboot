package com.application.shared.utility;

import java.util.List;
import java.util.Map;

public class Response {
	
	private boolean success = true;
	private boolean info = false;
	private boolean warning = false;
	private boolean valid = false;
	
	private String messageString;
	
	private int errorCode = 0;
	
	private Long id;
	
	private Map<String, Object> model;
	
	private List listOfItems;
	
	private Object object;
	
	private Integer count;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean isInfo() {
		return info;
	}

	public void setInfo(boolean info) {
		this.info = info;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getMessageString() {
		return messageString;
	}

	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Map<String, Object> getModel() {
		return model;
	}

	public void setModel(Map<String, Object> model) {
		this.model = model;
	}

	public List getListOfItems() {
		return listOfItems;
	}

	public void setListOfItems(List listOfItems) {
		this.listOfItems = listOfItems;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	

}

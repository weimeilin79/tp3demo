package com.redhat;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskInfo implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3290240065083274934L;
	
	@JsonProperty("appid")
	public String appid;
	@JsonProperty("taskResult")
	public String taskResult;
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getTaskResult() {
		return taskResult;
	}
	public void setTaskResult(String taskResult) {
		this.taskResult = taskResult;
	}
	
	
	
}

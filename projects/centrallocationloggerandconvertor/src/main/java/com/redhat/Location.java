package com.redhat;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3797468274974856466L;
	
	@JsonProperty("appid")
	public String appid;
	@JsonProperty("lat")
	public Double lat;
	@JsonProperty("lng")
	public Double lng;
	
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("appid=").append(appid);
        sb.append(", lat=").append(lat);
        sb.append(", lng=").append(lng);
        sb.append('}');
        return sb.toString();
    }
}

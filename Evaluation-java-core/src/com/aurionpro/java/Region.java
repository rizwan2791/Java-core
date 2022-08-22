package com.aurionpro.java;

public class Region {

	private int regionId;
	private String regionName;

	public Region(int regionId, String regionName) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
	}

	public int getRegionId() {
		return regionId;
	}

	@Override
	public String toString() {
		return "Region [regionId=" + regionId + ", regionName=" + regionName + "]";
	}

	public String getRegionName() {
		return regionName;
	}

}
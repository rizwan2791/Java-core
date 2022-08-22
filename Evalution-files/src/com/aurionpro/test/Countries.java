package com.aurionpro.test;

public class Countries {
	private String countryCode;
	private String countryName;
	private String countryRegion;
	public Countries(String countryCode, String countryName, String countryRegion) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.countryRegion = countryRegion;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public String getCountryRegion() {
		return countryRegion;
	}
	@Override
	public String toString() {
		return "Countries [countryCode=" + countryCode + ", countryName=" + countryName + ", countryRegion="
				+ countryRegion + "]";
	}
	


	
}

package com.ccpa.compreqdtls.model;

public class Address {
	

	private String line1;
	private String line2; // Optional.
	private String city;
	private String territoryCode;
	private String postalCode;
	private String countryCode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String line1, String line2, String city, String territoryCode, String postalCode,
			String countryCode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.territoryCode = territoryCode;
		this.postalCode = postalCode;
		this.countryCode = countryCode;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTerritoryCode() {
		return territoryCode;
	}

	public void setTerritoryCode(String territoryCode) {
		this.territoryCode = territoryCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}

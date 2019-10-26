package com.ccpa.compreqdtls.model;

public class TelephoneNumber {
	private String countryCode; // Optional
	private String areaCode;
	private String exchange;
	private String lineNumber;
	private String extension; // optional
	private String type; // optional

	public TelephoneNumber(String countryCode, String areaCode, String exchange, String lineNumber, String extension,
			String type) {
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.exchange = exchange;
		this.lineNumber = lineNumber;
		this.extension = extension;
		this.type = type;
	}

	public TelephoneNumber() {
		// TODO Auto-generated constructor stub
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getExchange() {
		return exchange;
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public String getExtension() {
		return extension;
	}

	public String getType() {
		return type;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

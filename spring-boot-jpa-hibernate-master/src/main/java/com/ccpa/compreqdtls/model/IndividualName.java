package com.ccpa.compreqdtls.model;

public class IndividualName {
	private String givenName;
	private String middleNameInitial; // Optional
	private String familyName;
	private String prefix; // Optional
	private String suffix; // Optional

	public IndividualName(String givenName, String middleNameInitial, String familyName, String prefix, String suffix) {
		this.givenName = givenName;
		this.middleNameInitial = middleNameInitial;
		this.familyName = familyName;
		this.prefix = prefix;
		this.suffix = suffix;
	}

	public IndividualName() {
		// TODO Auto-generated constructor stub
	}

	public String getGivenName() {
		return givenName;
	}

	public String getMiddleNameInitial() {
		return middleNameInitial;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

}

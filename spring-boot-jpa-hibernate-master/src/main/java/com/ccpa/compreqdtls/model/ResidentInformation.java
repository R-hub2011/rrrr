package com.ccpa.compreqdtls.model;

public class ResidentInformation {
	private IndividualName individualName;
	private Address address;
	private TelephoneNumber telephoneNumber;
	private String emailAddress;
	private CharterCustomerStatus charterCustomerStatus;
	private KBAEnrichment lexusNexusEnrichment;

	public ResidentInformation(IndividualName individualName, Address address, TelephoneNumber telephoneNumber,
			String emailAddress, CharterCustomerStatus charterCustomerStatus, KBAEnrichment lexusNexusEnrichment) {
		this.individualName = individualName;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.charterCustomerStatus = charterCustomerStatus;
		this.lexusNexusEnrichment = lexusNexusEnrichment;
	}
	public ResidentInformation() {
		// TODO Auto-generated constructor stub
	}

	public IndividualName getIndividualName() {
		return individualName;
	}

	public void setIndividualName(IndividualName individualName) {
		this.individualName = individualName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setTelephoneNumber(TelephoneNumber telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setCharterCustomerStatus(CharterCustomerStatus charterCustomerStatus) {
		this.charterCustomerStatus = charterCustomerStatus;
	}

	public void setLexusNexusEnrichment(KBAEnrichment lexusNexusEnrichment) {
		this.lexusNexusEnrichment = lexusNexusEnrichment;
	}

	public Address getAddress() {
		return address;
	}

	public TelephoneNumber getTelephoneNumber() {
		return telephoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public CharterCustomerStatus getCharterCustomerStatus() {
		return charterCustomerStatus;
	}

	public KBAEnrichment getLexusNexusEnrichment() {
		 return lexusNexusEnrichment;
    }
}

package com.ccpa.compreqdtls.model;

public class RequestorInformation {
	private IndividualName individualName;
	private Address address;
	private TelephoneNumber telephoneNumber;
	private String emailAddress;
	private String relationshipToResident;

	public RequestorInformation(IndividualName individualName, Address address, TelephoneNumber telephoneNumber,
			String emailAddress, String relationshipToResident) {
		this.individualName = individualName;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.relationshipToResident = relationshipToResident;
	}
	public RequestorInformation() {
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

	public void setRelationshipToResident(String relationshipToResident) {
		this.relationshipToResident = relationshipToResident;
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

	public String getRelationshipToResident() {
		return relationshipToResident;
	}

}

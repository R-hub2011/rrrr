package com.ccpa.compreqdtls.model;

import java.util.ArrayList;
import java.util.List;

public class InternalIDResponse {

	List<SystemIdentifier> systemIDs = new ArrayList<>();
	List<ConsumerDevice> devices = new ArrayList<>();
	List<Address> addresses = new ArrayList<>();
	List<TelephoneNumber> telephoneNumbers = new ArrayList<>();
	List<EMailAddress> eMailAddresses = new ArrayList<>();

	public List<SystemIdentifier> getSystemIDs() {
		return systemIDs;
	}

	public void setSystemIDs(List<SystemIdentifier> systemIDs) {
		this.systemIDs = systemIDs;
	}

	public List<ConsumerDevice> getDevices() {
		return devices;
	}

	public void setDevices(List<ConsumerDevice> devices) {
		this.devices = devices;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<TelephoneNumber> getTelephoneNumbers() {
		return telephoneNumbers;
	}

	public void setTelephoneNumbers(List<TelephoneNumber> telephoneNumbers) {
		this.telephoneNumbers = telephoneNumbers;
	}

	public List<EMailAddress> geteMailAddresses() {
		return eMailAddresses;
	}

	public void seteMailAddresses(List<EMailAddress> eMailAddresses) {
		this.eMailAddresses = eMailAddresses;
	}

}

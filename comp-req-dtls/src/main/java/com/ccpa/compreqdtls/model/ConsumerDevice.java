package com.ccpa.compreqdtls.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer_device_t", schema = "CCPA", catalog = "")
public class ConsumerDevice {
	@Column(name="manufacturer_name")
	private String manufacturer;
	
	@Column(name="model_name")
	private String modelName;
	
	@Column(name="model_number")
	private String modelNumber;
	
	@Column(name="serial_number")
	private String serialNumber;
	
	@Column(name="mac_address_1")
	private String macAddress1;
	
	@Column(name="mac_address_2")
	private String macAddress2;
	
	@Column(name="system_name")
	private String imei;
	

	public ConsumerDevice(String manufacturer, String modelName, String modelNumber, String serialNumber,
			String macAddress1, String macAddress2, String imei) {
		this.manufacturer = manufacturer;
		this.modelName = modelName;
		this.modelNumber = modelNumber;
		this.serialNumber = serialNumber;
		this.macAddress1 = macAddress1;
		this.macAddress2 = macAddress2;
		this.imei = imei;
	}

	public ConsumerDevice() {
		// TODO Auto-generated constructor stub
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModelName() {
		return modelName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getMacAddress1() {
		return macAddress1;
	}

	public String getMacAddress2() {
		return macAddress2;
	}

	public String getImei() {
		return imei;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public void setMacAddress1(String macAddress1) {
		this.macAddress1 = macAddress1;
	}

	public void setMacAddress2(String macAddress2) {
		this.macAddress2 = macAddress2;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	
	
}

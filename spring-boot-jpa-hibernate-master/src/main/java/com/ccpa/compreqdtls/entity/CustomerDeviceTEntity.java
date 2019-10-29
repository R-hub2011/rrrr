package com.ccpa.compreqdtls.entity;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_DEVICE_T", catalog = "")
public class CustomerDeviceTEntity {
    private String deviceId;
    private String manufacturerName;
    private String modelName;
    private String modelNumber;
    private String serialNumber;
    private String macAddress1;
    private String macAddress2;
    private String imei;
    private String iccid;
    private CustomerTEntity customerEntity;
    @ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID", nullable = false )
    public CustomerTEntity getCustomerEntity() {
    	return customerEntity;
    }

    public void setCustomerEntity(CustomerTEntity customerEntity) {
    	this.customerEntity = customerEntity;
    }
   

    @Id
    @Column(name = "DEVICE_ID")
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "MANUFACTURER_NAME")
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    @Basic
    @Column(name = "MODEL_NAME")
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Basic
    @Column(name = "MODEL_NUMBER")
    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Basic
    @Column(name = "SERIAL_NUMBER")
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Basic
    @Column(name = "MAC_ADDRESS_1")
    public String getMacAddress1() {
        return macAddress1;
    }

    public void setMacAddress1(String macAddress1) {
        this.macAddress1 = macAddress1;
    }

    @Basic
    @Column(name = "MAC_ADDRESS_2")
    public String getMacAddress2() {
        return macAddress2;
    }

    public void setMacAddress2(String macAddress2) {
        this.macAddress2 = macAddress2;
    }

    @Basic
    @Column(name = "IMEI")
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Basic
    @Column(name = "ICCID")
    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDeviceTEntity that = (CustomerDeviceTEntity) o;
        return Objects.equals(deviceId, that.deviceId) &&
                Objects.equals(manufacturerName, that.manufacturerName) &&
                Objects.equals(modelName, that.modelName) &&
                Objects.equals(modelNumber, that.modelNumber) &&
                Objects.equals(serialNumber, that.serialNumber) &&
                Objects.equals(macAddress1, that.macAddress1) &&
                Objects.equals(macAddress2, that.macAddress2) &&
                Objects.equals(imei, that.imei) &&
                Objects.equals(iccid, that.iccid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, manufacturerName, modelName, modelNumber, serialNumber, macAddress1, macAddress2, imei, iccid);
    }
}

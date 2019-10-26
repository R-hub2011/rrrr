package com.ccpa.compreqdtls.entity;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_T", schema = "CPP", catalog = "")
public class CustomerTEntity {
    private Long requestCustomerId;
    private String custNamePrefix;
    private String custFirstName;
    private String custMiddleName;
    private String custLastName;
    private String custNameSuffix;
    private String custAddressLine1;
    private String custAddressLine2;
    private String custAddressCity;
    private String custAddressState;
    private String custPostalCode;
    private String custAddressCountryCode;
    private String custTnCountryCode;
    private Long custTnAreaCode;
    private Long custTnExchange;
    private Long custTnLineNumber;
    private String custTnExtension;
    private String custTnTypeCode;
    private String custEmail;
    private String lastBillingAccountNumber;
    private String spectrumCoreAccount;
    private String spectrumCoreDivision;
    CustomerRequestTEntity requestEntity;
    AddlCustomerNameTEntity cusNameEntity;
    AddlCustomerAddressTEntity cusAddressEntity;
    CustomerSystemIdentifiersTEntity systemIdentifires;
    CustomerDeviceTEntity deviceEntity;
    AddlCustomerContactTEntity cusContactEntity;
    
	@Id
    @Column(name = "REQUEST_CUSTOMER_ID")
    public Long getRequestCustomerId() {
        return requestCustomerId;
    }

    public void setRequestCustomerId(Long requestCustomerId) {
        this.requestCustomerId = requestCustomerId;
    }

    @Basic
    @Column(name = "CUST_NAME_PREFIX")
    public String getCustNamePrefix() {
        return custNamePrefix;
    }

    public void setCustNamePrefix(String custNamePrefix) {
        this.custNamePrefix = custNamePrefix;
    }

    @Basic
    @Column(name = "CUST_FIRST_NAME")
    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    @Basic
    @Column(name = "CUST_MIDDLE_NAME")
    public String getCustMiddleName() {
        return custMiddleName;
    }

    public void setCustMiddleName(String custMiddleName) {
        this.custMiddleName = custMiddleName;
    }

    @Basic
    @Column(name = "CUST_LAST_NAME")
    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    @Basic
    @Column(name = "CUST_NAME_SUFFIX")
    public String getCustNameSuffix() {
        return custNameSuffix;
    }

    public void setCustNameSuffix(String custNameSuffix) {
        this.custNameSuffix = custNameSuffix;
    }

    @Basic
    @Column(name = "CUST_ADDRESS_LINE1")
    public String getCustAddressLine1() {
        return custAddressLine1;
    }

    public void setCustAddressLine1(String custAddressLine1) {
        this.custAddressLine1 = custAddressLine1;
    }

    @Basic
    @Column(name = "CUST_ADDRESS_LINE2")
    public String getCustAddressLine2() {
        return custAddressLine2;
    }

    public void setCustAddressLine2(String custAddressLine2) {
        this.custAddressLine2 = custAddressLine2;
    }

    @Basic
    @Column(name = "CUST_ADDRESS_CITY")
    public String getCustAddressCity() {
        return custAddressCity;
    }

    public void setCustAddressCity(String custAddressCity) {
        this.custAddressCity = custAddressCity;
    }

    @Basic
    @Column(name = "CUST_ADDRESS_STATE")
    public String getCustAddressState() {
        return custAddressState;
    }

    public void setCustAddressState(String custAddressState) {
        this.custAddressState = custAddressState;
    }

    @Basic
    @Column(name = "CUST_POSTAL_CODE")
    public String getCustPostalCode() {
        return custPostalCode;
    }

    public void setCustPostalCode(String custPostalCode) {
        this.custPostalCode = custPostalCode;
    }

    @Basic
    @Column(name = "CUST_ADDRESS_COUNTRY_CODE")
    public String getCustAddressCountryCode() {
        return custAddressCountryCode;
    }

    public void setCustAddressCountryCode(String custAddressCountryCode) {
        this.custAddressCountryCode = custAddressCountryCode;
    }

    @Basic
    @Column(name = "CUST_TN_COUNTRY_CODE")
    public String getCustTnCountryCode() {
        return custTnCountryCode;
    }

    public void setCustTnCountryCode(String custTnCountryCode) {
        this.custTnCountryCode = custTnCountryCode;
    }

    @Basic
    @Column(name = "CUST_TN_AREA_CODE")
    public Long getCustTnAreaCode() {
        return custTnAreaCode;
    }

    public void setCustTnAreaCode(Long custTnAreaCode) {
        this.custTnAreaCode = custTnAreaCode;
    }

    @Basic
    @Column(name = "CUST_TN_EXCHANGE")
    public Long getCustTnExchange() {
        return custTnExchange;
    }

    public void setCustTnExchange(Long custTnExchange) {
        this.custTnExchange = custTnExchange;
    }

    @Basic
    @Column(name = "CUST_TN_LINE_NUMBER")
    public Long getCustTnLineNumber() {
        return custTnLineNumber;
    }

    public void setCustTnLineNumber(Long custTnLineNumber) {
        this.custTnLineNumber = custTnLineNumber;
    }

    @Basic
    @Column(name = "CUST_TN_EXTENSION")
    public String getCustTnExtension() {
        return custTnExtension;
    }

    public void setCustTnExtension(String custTnExtension) {
        this.custTnExtension = custTnExtension;
    }

    @Basic
    @Column(name = "CUST_TN_TYPE_CODE")
    public String getCustTnTypeCode() {
        return custTnTypeCode;
    }

    public void setCustTnTypeCode(String custTnTypeCode) {
        this.custTnTypeCode = custTnTypeCode;
    }

    @Basic
    @Column(name = "CUST_EMAIL")
    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    @Basic
    @Column(name = "LAST_BILLING_ACCOUNT_NUMBER")
    public String getLastBillingAccountNumber() {
        return lastBillingAccountNumber;
    }

    public void setLastBillingAccountNumber(String lastBillingAccountNumber) {
        this.lastBillingAccountNumber = lastBillingAccountNumber;
    }

    @Basic
    @Column(name = "SPECTRUM_CORE_ACCOUNT")
    public String getSpectrumCoreAccount() {
        return spectrumCoreAccount;
    }

    public void setSpectrumCoreAccount(String spectrumCoreAccount) {
        this.spectrumCoreAccount = spectrumCoreAccount;
    }

    @Basic
    @Column(name = "SPECTRUM_CORE_DIVISION")
    public String getSpectrumCoreDivision() {
        return spectrumCoreDivision;
    }

    public void setSpectrumCoreDivision(String spectrumCoreDivision) {
        this.spectrumCoreDivision = spectrumCoreDivision;
    }
    
    @OneToMany(mappedBy="customerEntity", cascade = CascadeType.ALL)
    public CustomerRequestTEntity getRequestEntity() {
		return requestEntity;
	}

	public void setRequestEntity(CustomerRequestTEntity requestEntity) {
		this.requestEntity = requestEntity;
	}
	
	@OneToMany(mappedBy="customerEntity", cascade = CascadeType.ALL)
    public AddlCustomerNameTEntity getCusNameEntity() {
		return cusNameEntity;
	}

	public void setCusNameEntity(AddlCustomerNameTEntity cusNameEntity) {
		this.cusNameEntity = cusNameEntity;
	}

	@OneToMany(mappedBy="customerEntity", cascade = CascadeType.ALL)
	public AddlCustomerAddressTEntity getCusAddressEntity() {
		return cusAddressEntity;
	}

	public void setCusAddressEntity(AddlCustomerAddressTEntity cusAddressEntity) {
		this.cusAddressEntity = cusAddressEntity;
	}

	@OneToMany(mappedBy="customerEntity", cascade = CascadeType.ALL)
	public CustomerSystemIdentifiersTEntity getSystemIdentifires() {
		return systemIdentifires;
	}

	public void setSystemIdentifires(CustomerSystemIdentifiersTEntity systemIdentifires) {
		this.systemIdentifires = systemIdentifires;
	}

	@OneToMany(mappedBy="customerEntity", cascade = CascadeType.ALL)
	public CustomerDeviceTEntity getDeviceEntity() {
		return deviceEntity;
	}

	public void setDeviceEntity(CustomerDeviceTEntity deviceEntity) {
		this.deviceEntity = deviceEntity;
	}

	@OneToMany(mappedBy="customerEntity", cascade = CascadeType.ALL)
	public AddlCustomerContactTEntity getCusContactEntity() {
		return cusContactEntity;
	}

	public void setCusContactEntity(AddlCustomerContactTEntity cusContactEntity) {
		this.cusContactEntity = cusContactEntity;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerTEntity that = (CustomerTEntity) o;
        return Objects.equals(requestCustomerId, that.requestCustomerId) &&
                Objects.equals(custNamePrefix, that.custNamePrefix) &&
                Objects.equals(custFirstName, that.custFirstName) &&
                Objects.equals(custMiddleName, that.custMiddleName) &&
                Objects.equals(custLastName, that.custLastName) &&
                Objects.equals(custNameSuffix, that.custNameSuffix) &&
                Objects.equals(custAddressLine1, that.custAddressLine1) &&
                Objects.equals(custAddressLine2, that.custAddressLine2) &&
                Objects.equals(custAddressCity, that.custAddressCity) &&
                Objects.equals(custAddressState, that.custAddressState) &&
                Objects.equals(custPostalCode, that.custPostalCode) &&
                Objects.equals(custAddressCountryCode, that.custAddressCountryCode) &&
                Objects.equals(custTnCountryCode, that.custTnCountryCode) &&
                Objects.equals(custTnAreaCode, that.custTnAreaCode) &&
                Objects.equals(custTnExchange, that.custTnExchange) &&
                Objects.equals(custTnLineNumber, that.custTnLineNumber) &&
                Objects.equals(custTnExtension, that.custTnExtension) &&
                Objects.equals(custTnTypeCode, that.custTnTypeCode) &&
                Objects.equals(custEmail, that.custEmail) &&
                Objects.equals(lastBillingAccountNumber, that.lastBillingAccountNumber) &&
                Objects.equals(spectrumCoreAccount, that.spectrumCoreAccount) &&
                Objects.equals(spectrumCoreDivision, that.spectrumCoreDivision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestCustomerId, custNamePrefix, custFirstName, custMiddleName, custLastName, custNameSuffix, custAddressLine1, custAddressLine2, custAddressCity, custAddressState, custPostalCode, custAddressCountryCode, custTnCountryCode, custTnAreaCode, custTnExchange, custTnLineNumber, custTnExtension, custTnTypeCode, custEmail, lastBillingAccountNumber, spectrumCoreAccount, spectrumCoreDivision);
    }
}

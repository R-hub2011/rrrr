package com.ccpa.compreqdtls.entity;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADDL_CUSTOMER_ADDRESS_T", schema = "CPP", catalog = "")
public class AddlCustomerAddressTEntity {
    private String addressLine1;
    private String addressLine2;
    private String addressCity;
    private String addressState;
    private String postalCode;
    private String addressCountryCode;
    private Long id;
    CustomerTEntity customerEntity;
    
    @ManyToOne
	@JoinColumn(name = "Customer_ID")
	public CustomerTEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerTEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

    @Basic
    @Column(name = "ADDRESS_LINE1")
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @Basic
    @Column(name = "ADDRESS_LINE2")
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @Basic
    @Column(name = "ADDRESS_CITY")
    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    @Basic
    @Column(name = "ADDRESS_STATE")
    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    @Basic
    @Column(name = "POSTAL_CODE")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "ADDRESS_COUNTRY_CODE")
    public String getAddressCountryCode() {
        return addressCountryCode;
    }

    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddlCustomerAddressTEntity that = (AddlCustomerAddressTEntity) o;
        return Objects.equals(addressLine1, that.addressLine1) &&
                Objects.equals(addressLine2, that.addressLine2) &&
                Objects.equals(addressCity, that.addressCity) &&
                Objects.equals(addressState, that.addressState) &&
                Objects.equals(postalCode, that.postalCode) &&
                Objects.equals(addressCountryCode, that.addressCountryCode) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLine1, addressLine2, addressCity, addressState, postalCode, addressCountryCode, id);
    }
}

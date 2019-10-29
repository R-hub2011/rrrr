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
@Table(name = "ADDL_CUSTOMER_CONTACT_T", catalog = "")
public class AddlCustomerContactTEntity {
	private String tnCountryCode;
	private String tnAreaCode;
	private Long tnExchange;
	private Long tnLineNumber;
	private String tnExtension;
	private String tnTypeCode;
	private String email;
	private Long id;
	
	private CustomerTEntity customerEntity;
	
	 @ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID", nullable = false)
	public CustomerTEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerTEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	
	@Basic
	@Column(name = "TN_COUNTRY_CODE")
	public String getTnCountryCode() {
		return tnCountryCode;
	}

	public void setTnCountryCode(String tnCountryCode) {
		this.tnCountryCode = tnCountryCode;
	}

	@Basic
	@Column(name = "TN_AREA_CODE")
	public String getTnAreaCode() {
		return tnAreaCode;
	}

	public void setTnAreaCode(String tnAreaCode) {
		this.tnAreaCode = tnAreaCode;
	}

	@Basic
	@Column(name = "TN_EXCHANGE")
	public Long getTnExchange() {
		return tnExchange;
	}

	public void setTnExchange(Long tnExchange) {
		this.tnExchange = tnExchange;
	}

	@Basic
	@Column(name = "TN_LINE_NUMBER")
	public Long getTnLineNumber() {
		return tnLineNumber;
	}

	public void setTnLineNumber(Long tnLineNumber) {
		this.tnLineNumber = tnLineNumber;
	}

	@Basic
	@Column(name = "TN_EXTENSION")
	public String getTnExtension() {
		return tnExtension;
	}

	public void setTnExtension(String tnExtension) {
		this.tnExtension = tnExtension;
	}

	@Basic
	@Column(name = "TN_TYPE_CODE")
	public String getTnTypeCode() {
		return tnTypeCode;
	}

	public void setTnTypeCode(String tnTypeCode) {
		this.tnTypeCode = tnTypeCode;
	}

	@Basic
	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		AddlCustomerContactTEntity that = (AddlCustomerContactTEntity) o;
		return Objects.equals(tnCountryCode, that.tnCountryCode) && Objects.equals(tnAreaCode, that.tnAreaCode)
				&& Objects.equals(tnExchange, that.tnExchange) && Objects.equals(tnLineNumber, that.tnLineNumber)
				&& Objects.equals(tnExtension, that.tnExtension) && Objects.equals(tnTypeCode, that.tnTypeCode)
				&& Objects.equals(email, that.email) && Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tnCountryCode, tnAreaCode, tnExchange, tnLineNumber, tnExtension, tnTypeCode, email, id);
	}
}

package com.ccpa.compreqdtls.entity;

import java.sql.Time;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "REQUEST_T", catalog = "")
public class RequestTEntity {
	private String requestId;
	private Time requestDatetime;
	private String resiNamePrefix;
	private String resiFirstName;
	private String resiMiddleName;
	private String resiLastName;
	private String resiNameSuffix;
	private String resiAddressLine1;
	private String resiAddressLine2;
	private String resiAddressCity;
	private String resiAddressState;
	private String resiPostalCode;
	private String resiAddressCountryCode;
	private String resiTnCountryCode;
	private String resiTnAreaCode;
	private Long resiTnExchange;
	private Long resiTnLineNumber;
	private String resiTnExtension;
	private String resiTnTypeCode;
	private String resiEmail;
	private String resiCustomerStatusCode;
	private String resiAuthenticationId;
	private String resiKbpPassFail;
	private String rqstrNamePrefix;
	private String rqstrFirstName;
	private String rqstrMiddleName;
	private String rqstrLastName;
	private String rqstrNameSuffix;
	private String rqstrAddressLine1;
	private String rqstrAddressLine2;
	private String rqstrAddressCity;
	private String rqstrAddressState;
	private String rqstrPostalCode;
	private String rqstrAddressCountryCode;
	private String rqstrTnCountryCode;
	private Long rqstrTnAreaCode;
	private Long rqstrTnExchange;
	private Long rqstrTnLineNumber;
	private String rqstrTnExtension;
	private String rqstrTnTypeCode;
	private String rqstrEmail;
	private String rqstrResiRelationCode;
	
	private Set<CustomerTEntity> customer;
	
	
	@ManyToMany(mappedBy="requests")
	public Set<CustomerTEntity> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<CustomerTEntity> customer) {
		this.customer = customer;
	}

	@Id
	@Column(name = "REQUEST_ID")
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Basic
	@Column(name = "REQUEST_DATETIME")
	public Time getRequestDatetime() {
		return requestDatetime;
	}

	public void setRequestDatetime(Time requestDatetime) {
		this.requestDatetime = requestDatetime;
	}

	@Basic
	@Column(name = "RESI_NAME_PREFIX")
	public String getResiNamePrefix() {
		return resiNamePrefix;
	}

	public void setResiNamePrefix(String resiNamePrefix) {
		this.resiNamePrefix = resiNamePrefix;
	}

	@Basic
	@Column(name = "RESI_FIRST_NAME")
	public String getResiFirstName() {
		return resiFirstName;
	}

	public void setResiFirstName(String resiFirstName) {
		this.resiFirstName = resiFirstName;
	}

	@Basic
	@Column(name = "RESI_MIDDLE_NAME")
	public String getResiMiddleName() {
		return resiMiddleName;
	}

	public void setResiMiddleName(String resiMiddleName) {
		this.resiMiddleName = resiMiddleName;
	}

	@Basic
	@Column(name = "RESI_LAST_NAME")
	public String getResiLastName() {
		return resiLastName;
	}

	public void setResiLastName(String resiLastName) {
		this.resiLastName = resiLastName;
	}

	@Basic
	@Column(name = "RESI_NAME_SUFFIX")
	public String getResiNameSuffix() {
		return resiNameSuffix;
	}

	public void setResiNameSuffix(String resiNameSuffix) {
		this.resiNameSuffix = resiNameSuffix;
	}

	@Basic
	@Column(name = "RESI_ADDRESS_LINE1")
	public String getResiAddressLine1() {
		return resiAddressLine1;
	}

	public void setResiAddressLine1(String resiAddressLine1) {
		this.resiAddressLine1 = resiAddressLine1;
	}

	@Basic
	@Column(name = "RESI_ADDRESS_LINE2")
	public String getResiAddressLine2() {
		return resiAddressLine2;
	}

	public void setResiAddressLine2(String resiAddressLine2) {
		this.resiAddressLine2 = resiAddressLine2;
	}

	@Basic
	@Column(name = "RESI_ADDRESS_CITY")
	public String getResiAddressCity() {
		return resiAddressCity;
	}

	public void setResiAddressCity(String resiAddressCity) {
		this.resiAddressCity = resiAddressCity;
	}

	@Basic
	@Column(name = "RESI_ADDRESS_STATE")
	public String getResiAddressState() {
		return resiAddressState;
	}

	public void setResiAddressState(String resiAddressState) {
		this.resiAddressState = resiAddressState;
	}

	@Basic
	@Column(name = "RESI_POSTAL_CODE")
	public String getResiPostalCode() {
		return resiPostalCode;
	}

	public void setResiPostalCode(String resiPostalCode) {
		this.resiPostalCode = resiPostalCode;
	}

	@Basic
	@Column(name = "RESI_ADDRESS_COUNTRY_CODE")
	public String getResiAddressCountryCode() {
		return resiAddressCountryCode;
	}

	public void setResiAddressCountryCode(String resiAddressCountryCode) {
		this.resiAddressCountryCode = resiAddressCountryCode;
	}

	@Basic
	@Column(name = "RESI_TN_COUNTRY_CODE")
	public String getResiTnCountryCode() {
		return resiTnCountryCode;
	}

	public void setResiTnCountryCode(String resiTnCountryCode) {
		this.resiTnCountryCode = resiTnCountryCode;
	}

	@Basic
	@Column(name = "RESI_TN_AREA_CODE")
	public String getResiTnAreaCode() {
		return resiTnAreaCode;
	}

	public void setResiTnAreaCode(String resiTnAreaCode) {
		this.resiTnAreaCode = resiTnAreaCode;
	}

	@Basic
	@Column(name = "RESI_TN_EXCHANGE")
	public Long getResiTnExchange() {
		return resiTnExchange;
	}

	public void setResiTnExchange(Long resiTnExchange) {
		this.resiTnExchange = resiTnExchange;
	}

	@Basic
	@Column(name = "RESI_TN_LINE_NUMBER")
	public Long getResiTnLineNumber() {
		return resiTnLineNumber;
	}

	public void setResiTnLineNumber(Long resiTnLineNumber) {
		this.resiTnLineNumber = resiTnLineNumber;
	}

	@Basic
	@Column(name = "RESI_TN_EXTENSION")
	public String getResiTnExtension() {
		return resiTnExtension;
	}

	public void setResiTnExtension(String resiTnExtension) {
		this.resiTnExtension = resiTnExtension;
	}

	@Basic
	@Column(name = "RESI_TN_TYPE_CODE")
	public String getResiTnTypeCode() {
		return resiTnTypeCode;
	}

	public void setResiTnTypeCode(String resiTnTypeCode) {
		this.resiTnTypeCode = resiTnTypeCode;
	}

	@Basic
	@Column(name = "RESI_EMAIL")
	public String getResiEmail() {
		return resiEmail;
	}

	public void setResiEmail(String resiEmail) {
		this.resiEmail = resiEmail;
	}

	@Basic
	@Column(name = "RESI_CUSTOMER_STATUS_CODE")
	public String getResiCustomerStatusCode() {
		return resiCustomerStatusCode;
	}

	public void setResiCustomerStatusCode(String resiCustomerStatusCode) {
		this.resiCustomerStatusCode = resiCustomerStatusCode;
	}

	@Basic
	@Column(name = "RESI_AUTHENTICATION_ID")
	public String getResiAuthenticationId() {
		return resiAuthenticationId;
	}

	public void setResiAuthenticationId(String resiAuthenticationId) {
		this.resiAuthenticationId = resiAuthenticationId;
	}

	@Basic
	@Column(name = "RESI_KBP_PASS_FAIL")
	public String getResiKbpPassFail() {
		return resiKbpPassFail;
	}

	public void setResiKbpPassFail(String resiKbpPassFail) {
		this.resiKbpPassFail = resiKbpPassFail;
	}

	@Basic
	@Column(name = "RQSTR_NAME_PREFIX")
	public String getRqstrNamePrefix() {
		return rqstrNamePrefix;
	}

	public void setRqstrNamePrefix(String rqstrNamePrefix) {
		this.rqstrNamePrefix = rqstrNamePrefix;
	}

	@Basic
	@Column(name = "RQSTR_FIRST_NAME")
	public String getRqstrFirstName() {
		return rqstrFirstName;
	}

	public void setRqstrFirstName(String rqstrFirstName) {
		this.rqstrFirstName = rqstrFirstName;
	}

	@Basic
	@Column(name = "RQSTR_MIDDLE_NAME")
	public String getRqstrMiddleName() {
		return rqstrMiddleName;
	}

	public void setRqstrMiddleName(String rqstrMiddleName) {
		this.rqstrMiddleName = rqstrMiddleName;
	}

	@Basic
	@Column(name = "RQSTR_LAST_NAME")
	public String getRqstrLastName() {
		return rqstrLastName;
	}

	public void setRqstrLastName(String rqstrLastName) {
		this.rqstrLastName = rqstrLastName;
	}

	@Basic
	@Column(name = "RQSTR_NAME_SUFFIX")
	public String getRqstrNameSuffix() {
		return rqstrNameSuffix;
	}

	public void setRqstrNameSuffix(String rqstrNameSuffix) {
		this.rqstrNameSuffix = rqstrNameSuffix;
	}

	@Basic
	@Column(name = "RQSTR_ADDRESS_LINE1")
	public String getRqstrAddressLine1() {
		return rqstrAddressLine1;
	}

	public void setRqstrAddressLine1(String rqstrAddressLine1) {
		this.rqstrAddressLine1 = rqstrAddressLine1;
	}

	@Basic
	@Column(name = "RQSTR_ADDRESS_LINE2")
	public String getRqstrAddressLine2() {
		return rqstrAddressLine2;
	}

	public void setRqstrAddressLine2(String rqstrAddressLine2) {
		this.rqstrAddressLine2 = rqstrAddressLine2;
	}

	@Basic
	@Column(name = "RQSTR_ADDRESS_CITY")
	public String getRqstrAddressCity() {
		return rqstrAddressCity;
	}

	public void setRqstrAddressCity(String rqstrAddressCity) {
		this.rqstrAddressCity = rqstrAddressCity;
	}

	@Basic
	@Column(name = "RQSTR_ADDRESS_STATE")
	public String getRqstrAddressState() {
		return rqstrAddressState;
	}

	public void setRqstrAddressState(String rqstrAddressState) {
		this.rqstrAddressState = rqstrAddressState;
	}

	@Basic
	@Column(name = "RQSTR_POSTAL_CODE")
	public String getRqstrPostalCode() {
		return rqstrPostalCode;
	}

	public void setRqstrPostalCode(String rqstrPostalCode) {
		this.rqstrPostalCode = rqstrPostalCode;
	}

	@Basic
	@Column(name = "RQSTR_ADDRESS_COUNTRY_CODE")
	public String getRqstrAddressCountryCode() {
		return rqstrAddressCountryCode;
	}

	public void setRqstrAddressCountryCode(String rqstrAddressCountryCode) {
		this.rqstrAddressCountryCode = rqstrAddressCountryCode;
	}

	@Basic
	@Column(name = "RQSTR_TN_COUNTRY_CODE")
	public String getRqstrTnCountryCode() {
		return rqstrTnCountryCode;
	}

	public void setRqstrTnCountryCode(String rqstrTnCountryCode) {
		this.rqstrTnCountryCode = rqstrTnCountryCode;
	}

	@Basic
	@Column(name = "RQSTR_TN_AREA_CODE")
	public Long getRqstrTnAreaCode() {
		return rqstrTnAreaCode;
	}

	public void setRqstrTnAreaCode(Long rqstrTnAreaCode) {
		this.rqstrTnAreaCode = rqstrTnAreaCode;
	}

	@Basic
	@Column(name = "RQSTR_TN_EXCHANGE")
	public Long getRqstrTnExchange() {
		return rqstrTnExchange;
	}

	public void setRqstrTnExchange(Long rqstrTnExchange) {
		this.rqstrTnExchange = rqstrTnExchange;
	}

	@Basic
	@Column(name = "RQSTR_TN_LINE_NUMBER")
	public Long getRqstrTnLineNumber() {
		return rqstrTnLineNumber;
	}

	public void setRqstrTnLineNumber(Long rqstrTnLineNumber) {
		this.rqstrTnLineNumber = rqstrTnLineNumber;
	}

	@Basic
	@Column(name = "RQSTR_TN_EXTENSION")
	public String getRqstrTnExtension() {
		return rqstrTnExtension;
	}

	public void setRqstrTnExtension(String rqstrTnExtension) {
		this.rqstrTnExtension = rqstrTnExtension;
	}

	@Basic
	@Column(name = "RQSTR_TN_TYPE_CODE")
	public String getRqstrTnTypeCode() {
		return rqstrTnTypeCode;
	}

	public void setRqstrTnTypeCode(String rqstrTnTypeCode) {
		this.rqstrTnTypeCode = rqstrTnTypeCode;
	}

	@Basic
	@Column(name = "RQSTR_EMAIL")
	public String getRqstrEmail() {
		return rqstrEmail;
	}

	public void setRqstrEmail(String rqstrEmail) {
		this.rqstrEmail = rqstrEmail;
	}

	@Basic
	@Column(name = "RQSTR_RESI_RELATION_CODE")
	public String getRqstrResiRelationCode() {
		return rqstrResiRelationCode;
	}

	public void setRqstrResiRelationCode(String rqstrResiRelationCode) {
		this.rqstrResiRelationCode = rqstrResiRelationCode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		RequestTEntity that = (RequestTEntity) o;
		return Objects.equals(requestId, that.requestId) && Objects.equals(requestDatetime, that.requestDatetime)
				&& Objects.equals(resiNamePrefix, that.resiNamePrefix)
				&& Objects.equals(resiFirstName, that.resiFirstName)
				&& Objects.equals(resiMiddleName, that.resiMiddleName)
				&& Objects.equals(resiLastName, that.resiLastName)
				&& Objects.equals(resiNameSuffix, that.resiNameSuffix)
				&& Objects.equals(resiAddressLine1, that.resiAddressLine1)
				&& Objects.equals(resiAddressLine2, that.resiAddressLine2)
				&& Objects.equals(resiAddressCity, that.resiAddressCity)
				&& Objects.equals(resiAddressState, that.resiAddressState)
				&& Objects.equals(resiPostalCode, that.resiPostalCode)
				&& Objects.equals(resiAddressCountryCode, that.resiAddressCountryCode)
				&& Objects.equals(resiTnCountryCode, that.resiTnCountryCode)
				&& Objects.equals(resiTnAreaCode, that.resiTnAreaCode)
				&& Objects.equals(resiTnExchange, that.resiTnExchange)
				&& Objects.equals(resiTnLineNumber, that.resiTnLineNumber)
				&& Objects.equals(resiTnExtension, that.resiTnExtension)
				&& Objects.equals(resiTnTypeCode, that.resiTnTypeCode) && Objects.equals(resiEmail, that.resiEmail)
				&& Objects.equals(resiCustomerStatusCode, that.resiCustomerStatusCode)
				&& Objects.equals(resiAuthenticationId, that.resiAuthenticationId)
				&& Objects.equals(resiKbpPassFail, that.resiKbpPassFail)
				&& Objects.equals(rqstrNamePrefix, that.rqstrNamePrefix)
				&& Objects.equals(rqstrFirstName, that.rqstrFirstName)
				&& Objects.equals(rqstrMiddleName, that.rqstrMiddleName)
				&& Objects.equals(rqstrLastName, that.rqstrLastName)
				&& Objects.equals(rqstrNameSuffix, that.rqstrNameSuffix)
				&& Objects.equals(rqstrAddressLine1, that.rqstrAddressLine1)
				&& Objects.equals(rqstrAddressLine2, that.rqstrAddressLine2)
				&& Objects.equals(rqstrAddressCity, that.rqstrAddressCity)
				&& Objects.equals(rqstrAddressState, that.rqstrAddressState)
				&& Objects.equals(rqstrPostalCode, that.rqstrPostalCode)
				&& Objects.equals(rqstrAddressCountryCode, that.rqstrAddressCountryCode)
				&& Objects.equals(rqstrTnCountryCode, that.rqstrTnCountryCode)
				&& Objects.equals(rqstrTnAreaCode, that.rqstrTnAreaCode)
				&& Objects.equals(rqstrTnExchange, that.rqstrTnExchange)
				&& Objects.equals(rqstrTnLineNumber, that.rqstrTnLineNumber)
				&& Objects.equals(rqstrTnExtension, that.rqstrTnExtension)
				&& Objects.equals(rqstrTnTypeCode, that.rqstrTnTypeCode) && Objects.equals(rqstrEmail, that.rqstrEmail)
				&& Objects.equals(rqstrResiRelationCode, that.rqstrResiRelationCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(requestId, requestDatetime, resiNamePrefix, resiFirstName, resiMiddleName, resiLastName,
				resiNameSuffix, resiAddressLine1, resiAddressLine2, resiAddressCity, resiAddressState, resiPostalCode,
				resiAddressCountryCode, resiTnCountryCode, resiTnAreaCode, resiTnExchange, resiTnLineNumber,
				resiTnExtension, resiTnTypeCode, resiEmail, resiCustomerStatusCode, resiAuthenticationId,
				resiKbpPassFail, rqstrNamePrefix, rqstrFirstName, rqstrMiddleName, rqstrLastName, rqstrNameSuffix,
				rqstrAddressLine1, rqstrAddressLine2, rqstrAddressCity, rqstrAddressState, rqstrPostalCode,
				rqstrAddressCountryCode, rqstrTnCountryCode, rqstrTnAreaCode, rqstrTnExchange, rqstrTnLineNumber,
				rqstrTnExtension, rqstrTnTypeCode, rqstrEmail, rqstrResiRelationCode);
	}
}

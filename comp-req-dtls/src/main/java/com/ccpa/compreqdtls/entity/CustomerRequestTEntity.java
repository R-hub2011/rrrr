package com.ccpa.compreqdtls.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_REQUEST_T", schema = "CPP", catalog = "")
public class CustomerRequestTEntity {
   
	private Integer reqCustID;
	private String requestID;
	CustomerTEntity customerEntity;
	RequestTEntity requestEntity;
   
	@OneToMany(mappedBy="cusRequestEntity", cascade = CascadeType.ALL)
    public RequestTEntity getRequestEntity() {
		return requestEntity;
	}

	public void setRequestEntity(RequestTEntity requestEntity) {
		this.requestEntity = requestEntity;
	}

	@Column(name = "REQUEST_CUSTOMER_ID")
	public Integer getReqCustID() {
		return reqCustID;
	}

	public void setReqCustID(Integer reqCustID) {
		this.reqCustID = reqCustID;
	}

    @Column(name = "REQUEST_ID")
	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	
	@ManyToOne
	@JoinColumn(name = "Request_Customer_ID")
	public CustomerTEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerTEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	
}

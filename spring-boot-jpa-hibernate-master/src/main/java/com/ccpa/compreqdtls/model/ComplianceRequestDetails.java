package com.ccpa.compreqdtls.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;


public class ComplianceRequestDetails {

    UUID requestId;
    ResidentInformation residentInformation;
    RequestorInformation requestorInformation;
    InternalIDResponse internalCustomerIdentifiers;

    public ComplianceRequestDetails(UUID requestId, ResidentInformation residentInformation, RequestorInformation requestorInformation, InternalIDResponse internalCustomerIdentifiers) {
        this.requestId = requestId;
        this.residentInformation = residentInformation;
        this.requestorInformation = requestorInformation;
        this.internalCustomerIdentifiers = internalCustomerIdentifiers;
    }
    public ComplianceRequestDetails() {
	}
	
    public UUID getRequestId() {
        return requestId;
    }

    public ResidentInformation getResidentInformation() {
    	if(this.residentInformation==null) {
    		this.residentInformation=new ResidentInformation();
    	}
        return residentInformation;
    }

    public RequestorInformation getRequestorInformation() {
    	if(this.requestorInformation==null) {
    		this.requestorInformation=new RequestorInformation();
    	}
        return requestorInformation;
    }

    public InternalIDResponse getInternalCustomerIdentifiers() {
    	if(this.internalCustomerIdentifiers==null) {
    		this.internalCustomerIdentifiers=new InternalIDResponse();
    	}
        return internalCustomerIdentifiers;
    }
}

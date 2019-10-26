package com.ccpa.compreqdtls.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "customer_request_t", schema = "CPP", catalog = "")
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
	@Id
    @Column(name = "REQUEST_CUSTOMER_ID")
    public UUID getRequestId() {
        return requestId;
    }

    public ResidentInformation getResidentInformation() {
        return residentInformation;
    }

    public RequestorInformation getRequestorInformation() {
        return requestorInformation;
    }

    public InternalIDResponse getInternalCustomerIdentifiers() {
        return internalCustomerIdentifiers;
    }
}

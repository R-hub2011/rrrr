package com.ccpa.compreqdtls.service;

import com.ccpa.compreqdtls.model.ComplianceRequestDetails;

public interface ComplianceRequestDtlService {
	ComplianceRequestDetails getCompReDtls(String requestID) throws Exception;
}

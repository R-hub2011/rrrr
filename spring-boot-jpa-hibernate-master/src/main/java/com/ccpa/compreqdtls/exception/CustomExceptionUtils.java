package com.ccpa.compreqdtls.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ccpa.compreqdtls.controller.ComplianceRequestDtlController;
import com.ccpa.compreqdtls.model.ErrorMsg;

public class CustomExceptionUtils {
	
	private static final Logger logger = LogManager.getLogger(CustomExceptionUtils.class);
	
	public ErrorMsg setErrorMessage(CCPAException ex) {
		if(ex.getDevOpsMessage().equalsIgnoreCase(CCPAConstant.ERROR_MESSAGE_DEV_OPS)) {
			logger.error("Error Message = " + ex.getMessage());
			logger.error("Strack Trace = "+ex.getsTrace(ex.getEx()));
		} else {
			logger.info("Error Message = " + ex.getDevOpsMessage());
		}
		 return new ErrorMsg(ex.getUserMessage(), ex.getDevOpsMessage());	
		
	}

}

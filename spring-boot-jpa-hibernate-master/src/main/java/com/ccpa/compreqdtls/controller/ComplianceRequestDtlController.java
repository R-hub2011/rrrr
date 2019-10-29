package com.ccpa.compreqdtls.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ccpa.compreqdtls.exception.CCPAConstant;
import com.ccpa.compreqdtls.exception.CCPAException;
import com.ccpa.compreqdtls.exception.CustomExceptionUtils;
import com.ccpa.compreqdtls.model.ComplianceRequestDetails;
import com.ccpa.compreqdtls.model.ErrorMsg;
import com.ccpa.compreqdtls.service.ComplianceRequestDtlsServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
//baseUrl and versions can be added later
@RequestMapping("/api")
public class ComplianceRequestDtlController {
	
	private static final Logger logger = LogManager.getLogger(ComplianceRequestDtlController.class);
	
	@Autowired
	ComplianceRequestDtlsServiceImpl service;
	
	 @Autowired
	 private ObjectMapper objectMapper;
	
	/**
	 * Get Compliance request details.
	 * @param requestID
	 * @return JSOn 
	 */
	@GetMapping("/complianceRequestDetail")
	public String getCompReqDtls(@RequestParam("requestId") String requestId) {
		logger.info("ComplianceRequestDtlController :: getCompReqDtls :: Start");
		CustomExceptionUtils utils = new CustomExceptionUtils();
		String jsonValue = "";
		try {
			logger.info("ComplianceRequestDtlController :: getCompReqDtls :: Request ID = "+requestId);
			if(requestId != null && !requestId.isEmpty() && !requestId.equalsIgnoreCase("null")) {
				ComplianceRequestDetails objDetails = service.getCompReDtls(requestId);
				jsonValue = objToJson(objDetails);
			} else {
				ErrorMsg errMsg = new ErrorMsg(CCPAConstant.ERROR_MESSAGE_REQID_EMPTY, CCPAConstant.REQID_ERROR_MSG);
				jsonValue = objToJson(errMsg);
			}
			
		} catch(CCPAException ex) {
			try {
				ErrorMsg errMsg = utils.setErrorMessage(ex);
				jsonValue = objToJson(errMsg);
			} catch (CCPAException e) {
				utils.setErrorMessage(e);
			}
		
		}	
		logger.info("ComplianceRequestDtlController :: getCompReqDtls :: End");
		return jsonValue;
	}
	
	public String objToJson(Object obj) throws CCPAException {
		String objJackson = "";
        try {
        	if(ErrorMsg.class.isAssignableFrom(obj.getClass())) {
        		ErrorMsg objMsg = (ErrorMsg) obj;
        		objJackson = objectMapper.writeValueAsString(objMsg);
        	} else {
        		ComplianceRequestDetails objMsg = (ComplianceRequestDetails) obj;
        		 objJackson = objectMapper.writeValueAsString(objMsg);
        	}
        } catch (JsonProcessingException ex) {
        	throw new CCPAException(CCPAConstant.ERROR_CODE, CCPAConstant.ERROR_MESSAGE,
					CCPAConstant.ERROR_MESSAGE_DEV_OPS, ex.getMessage(), ex);
        }
        return objJackson;
    }

}

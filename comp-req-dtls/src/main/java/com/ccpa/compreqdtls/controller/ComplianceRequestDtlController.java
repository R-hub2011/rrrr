package com.ccpa.compreqdtls.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccpa.compreqdtls.model.ComplianceRequestDetails;
import com.ccpa.compreqdtls.model.ErrorMsg;
import com.ccpa.compreqdtls.service.ComplianceRequestDtlsServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
//baseUrl and versions can be added later
@RequestMapping("localhost:8080/api")
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
	public String getCompReqDtls(@PathVariable("requestID") String requestID) {
		String jsonValue = "";
		try {
			if(requestID != null && !requestID.isEmpty()) {
				ComplianceRequestDetails objDetails = service.getCompReDtls(requestID);
				jsonValue = objToJson(objDetails);
			} else {
				ErrorMsg errMsg = new ErrorMsg("RequestId input is empty / null", "Input validation error");
				jsonValue = objToJson(errMsg);
			}
			
		} catch(Exception ex) {
			ErrorMsg errMsg = new ErrorMsg("RequestId input is empty / null", "Input validation error");
			try {
				jsonValue = objToJson(errMsg);
			} catch (JsonProcessingException e) {
				logger.error("Error occured"+e.getMessage());
			}
		}
		return jsonValue;
	}
	
	public String objToJson(Object obj) throws JsonProcessingException {
		String objJackson = "";
        try {
        	if(ErrorMsg.class.isAssignableFrom(obj.getClass())) {
        		ErrorMsg objMsg = (ErrorMsg) obj;
        		objJackson = objectMapper.writeValueAsString(objMsg);
        	} else {
        		ComplianceRequestDetails objMsg = (ComplianceRequestDetails) obj;
        		 objJackson = objectMapper.writeValueAsString(objMsg);
        	}
        } catch (JsonProcessingException e) {
           throw e;
        }
        return objJackson;
    }

}

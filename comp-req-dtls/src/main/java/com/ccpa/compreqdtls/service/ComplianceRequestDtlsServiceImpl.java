package com.ccpa.compreqdtls.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccpa.compreqdtls.dao.ComplicanceRequestDtlDAO;
import com.ccpa.compreqdtls.dao.CustomerRequestDtlsDAO;
import com.ccpa.compreqdtls.entity.CustomerRequestTEntity;
import com.ccpa.compreqdtls.entity.CustomerTEntity;
import com.ccpa.compreqdtls.model.Address;
import com.ccpa.compreqdtls.model.CharterCustomerStatus;
import com.ccpa.compreqdtls.model.ComplianceRequestDetails;
import com.ccpa.compreqdtls.model.ConsumerDevice;
import com.ccpa.compreqdtls.model.EMailAddress;
import com.ccpa.compreqdtls.model.IndividualName;
import com.ccpa.compreqdtls.model.KBAEnrichment;
import com.ccpa.compreqdtls.model.PassFail;
import com.ccpa.compreqdtls.model.SystemIdentifier;
import com.ccpa.compreqdtls.model.TelephoneNumber;

@Service
public class ComplianceRequestDtlsServiceImpl implements ComplianceRequestDtlService{

	// This class is to connect with DB to persist or query or Update  
	
	@Autowired
	ComplicanceRequestDtlDAO repo;
	
	@Autowired
	CustomerRequestDtlsDAO custReqRepo;
	
	@Override
	public ComplianceRequestDetails getCompReDtls(String requestID) {
		ComplianceRequestDetails objDtls = new ComplianceRequestDetails();
		CustomerTEntity obj = new CustomerTEntity();
		try {
			Optional<CustomerRequestTEntity> findById = custReqRepo.findById(requestID);
			CustomerRequestTEntity objCustReq = findById.get();
			
			Optional<CustomerTEntity> findById2 = repo.findById(Long.valueOf(objCustReq.getReqCustID().toString()));
			obj = findById2.get();
			if(obj != null) {
				
					
					
					
					SystemIdentifier sysIdf = new SystemIdentifier();
					sysIdf.setSystem(obj.getSystemIdentifires().getSystemName());
					sysIdf.setSystemKey(obj.getSystemIdentifires().getSystemIdentifierValue());
					objDtls.getInternalCustomerIdentifiers().getSystemIDs().add(sysIdf);
					
					ConsumerDevice cusDev = new ConsumerDevice();
					cusDev.setManufacturer(obj.getDeviceEntity().getManufacturerName());
					cusDev.setModelName(obj.getDeviceEntity().getModelName());
					cusDev.setModelNumber(obj.getDeviceEntity().getModelNumber());
					cusDev.setSerialNumber(obj.getDeviceEntity().getImei());
					cusDev.setMacAddress1(obj.getDeviceEntity().getMacAddress1());
					cusDev.setMacAddress2(obj.getDeviceEntity().getMacAddress2());
					objDtls.getInternalCustomerIdentifiers().getDevices().add(cusDev);
					
					Address addr = new Address();
					addr.setLine1(obj.getCusAddressEntity().getAddressLine1());
					addr.setLine2(obj.getCusAddressEntity().getAddressLine2());
					addr.setCity(obj.getCusAddressEntity().getAddressCity());
					addr.setCountryCode(obj.getCusAddressEntity().getAddressCountryCode());
					addr.setPostalCode(obj.getCusAddressEntity().getPostalCode());
					addr.setTerritoryCode(""); //Need to check with the team where we have to get territory code.
					objDtls.getInternalCustomerIdentifiers().getAddresses().add(addr);
					
					TelephoneNumber tph = new TelephoneNumber();
					tph.setAreaCode(obj.getCusContactEntity().getTnAreaCode());
					tph.setCountryCode(obj.getCusContactEntity().getTnCountryCode());
					tph.setExchange(obj.getCusContactEntity().getTnExchange().toString());
					tph.setExtension(obj.getCusContactEntity().getTnExtension());
					tph.setLineNumber(obj.getCusContactEntity().getTnLineNumber().toString());
					tph.setType(obj.getCusContactEntity().getTnTypeCode());
					objDtls.getInternalCustomerIdentifiers().getTelephoneNumbers().add(tph);
					
					EMailAddress eAddr = new EMailAddress();
					eAddr.setEmailAddress(obj.getCustEmail());
					objDtls.getInternalCustomerIdentifiers().geteMailAddresses().add(eAddr);
					
					//Requestor Information
					objDtls.getRequestorInformation().setEmailAddress(obj.getRequestEntity().getRequestEntity().getRqstrEmail());
					objDtls.getRequestorInformation().setRelationshipToResident(obj.getRequestEntity().getRequestEntity().getRqstrResiRelationCode());
					IndividualName iName = new IndividualName(obj.getRequestEntity().getRequestEntity().getRqstrFirstName(), 
							obj.getRequestEntity().getRequestEntity().getRqstrMiddleName(),
							obj.getRequestEntity().getRequestEntity().getRqstrLastName(),
							obj.getRequestEntity().getRequestEntity().getRqstrNamePrefix(),
							obj.getRequestEntity().getRequestEntity().getRqstrNameSuffix());
					objDtls.getRequestorInformation().setIndividualName(iName);
					
					Address reqAddr = new Address(obj.getRequestEntity().getRequestEntity().getRqstrAddressLine1(),
							obj.getRequestEntity().getRequestEntity().getRqstrAddressLine2(),
							obj.getRequestEntity().getRequestEntity().getRqstrAddressCity(),
							"", //Need to check wat is the exact value we need to fetch 
							obj.getRequestEntity().getRequestEntity().getRqstrPostalCode(),
							obj.getRequestEntity().getRequestEntity().getRqstrTnCountryCode()
							);
					objDtls.getRequestorInformation().setAddress(reqAddr);
					
					TelephoneNumber tn = new TelephoneNumber(obj.getRequestEntity().getRequestEntity().getRqstrTnCountryCode(),
							obj.getRequestEntity().getRequestEntity().getRqstrTnAreaCode().toString(),
							obj.getRequestEntity().getRequestEntity().getRqstrTnExchange().toString(),
							obj.getRequestEntity().getRequestEntity().getRqstrTnLineNumber().toString(),
							obj.getRequestEntity().getRequestEntity().getRqstrTnExtension(),
							obj.getRequestEntity().getRequestEntity().getRqstrTnTypeCode());
					objDtls.getRequestorInformation().setTelephoneNumber(tn);
					
					//Resident Information
					IndividualName resIName = new IndividualName(obj.getRequestEntity().getRequestEntity().getResiFirstName(), 
							obj.getRequestEntity().getRequestEntity().getResiMiddleName(),
							obj.getRequestEntity().getRequestEntity().getResiLastName(),
							obj.getRequestEntity().getRequestEntity().getResiNamePrefix(),
							obj.getRequestEntity().getRequestEntity().getResiNameSuffix());
					objDtls.getResidentInformation().setIndividualName(resIName);
					
					Address resAddr = new Address(obj.getRequestEntity().getRequestEntity().getResiAddressLine1(),
							obj.getRequestEntity().getRequestEntity().getResiAddressLine2(),
							obj.getRequestEntity().getRequestEntity().getResiAddressCity(),
							"", //Need to check wat is the exact value we need to fetch 
							obj.getRequestEntity().getRequestEntity().getResiPostalCode(),
							obj.getRequestEntity().getRequestEntity().getResiTnCountryCode()
							);
					objDtls.getResidentInformation().setAddress(resAddr);
					
					TelephoneNumber resTN = new TelephoneNumber(obj.getRequestEntity().getRequestEntity().getResiTnCountryCode(),
							obj.getRequestEntity().getRequestEntity().getResiTnAreaCode().toString(),
							obj.getRequestEntity().getRequestEntity().getResiTnExchange().toString(),
							obj.getRequestEntity().getRequestEntity().getResiTnLineNumber().toString(),
							obj.getRequestEntity().getRequestEntity().getResiTnExtension(),
							obj.getRequestEntity().getRequestEntity().getResiTnTypeCode());
					objDtls.getResidentInformation().setTelephoneNumber(resTN);
					
					
					objDtls.getResidentInformation().setCharterCustomerStatus(CharterCustomerStatus.valueOf(obj.getRequestEntity().getRequestEntity().getResiCustomerStatusCode()));
					
					objDtls.getResidentInformation().setLexusNexusEnrichment(
							new KBAEnrichment("", //Need to check wat is the exact value we need to fetch 
									PassFail.valueOf(obj.getRequestEntity().getRequestEntity().getResiKbpPassFail())
									)
							);
			}
		} catch(Exception ex) {
			throw ex;
		}
		return objDtls;
	}

}

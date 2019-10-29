package com.ccpa.compreqdtls.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccpa.compreqdtls.controller.ComplianceRequestDtlController;
import com.ccpa.compreqdtls.dao.CusteomerEntityDAO;
import com.ccpa.compreqdtls.entity.AddlCustomerAddressTEntity;
import com.ccpa.compreqdtls.entity.AddlCustomerContactTEntity;
import com.ccpa.compreqdtls.entity.CustomerDeviceTEntity;
import com.ccpa.compreqdtls.entity.CustomerSystemIdentifiersTEntity;
import com.ccpa.compreqdtls.entity.CustomerTEntity;
import com.ccpa.compreqdtls.entity.RequestTEntity;
import com.ccpa.compreqdtls.exception.CCPAConstant;
import com.ccpa.compreqdtls.exception.CCPAException;
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
public class ComplianceRequestDtlsServiceImpl implements ComplianceRequestDtlService {
	
	private static final Logger logger = LogManager.getLogger(ComplianceRequestDtlsServiceImpl.class);

	// This class is to connect with DB to persist or query or Update

	@Autowired
	CusteomerEntityDAO repo;

	@Override
	public ComplianceRequestDetails getCompReDtls(String requestID) throws CCPAException {
		logger.info("ComplianceRequestDtlsServiceImpl :: getCompReqDtls :: Start");
		ComplianceRequestDetails objDtls = new ComplianceRequestDetails();
		try {
			CustomerTEntity obj = repo.findOne(Long.valueOf(requestID));

			if (obj != null) {

				SystemIdentifier sysIdf = new SystemIdentifier();
				CustomerSystemIdentifiersTEntity customerSystemIdentifiersTEntity = obj.getSystemIdentifires() != null
						&& !obj.getSystemIdentifires().isEmpty() ? obj.getSystemIdentifires().iterator().next()
								: new CustomerSystemIdentifiersTEntity();
				sysIdf.setSystem(customerSystemIdentifiersTEntity.getSystemName());
				sysIdf.setSystemKey(customerSystemIdentifiersTEntity.getSystemIdentifierValue());
				objDtls.getInternalCustomerIdentifiers().getSystemIDs().add(sysIdf);

				ConsumerDevice cusDev = new ConsumerDevice();
				CustomerDeviceTEntity customerDeviceTEntity = obj.getDeviceEntity() != null
						&& !obj.getDeviceEntity().isEmpty() ? obj.getDeviceEntity().iterator().next()
								: new CustomerDeviceTEntity();
				cusDev.setManufacturer(customerDeviceTEntity.getManufacturerName());
				cusDev.setModelName(customerDeviceTEntity.getModelName());
				cusDev.setModelNumber(customerDeviceTEntity.getModelNumber());
				cusDev.setSerialNumber(customerDeviceTEntity.getImei());
				cusDev.setMacAddress1(customerDeviceTEntity.getMacAddress1());
				cusDev.setMacAddress2(customerDeviceTEntity.getMacAddress2());
				objDtls.getInternalCustomerIdentifiers().getDevices().add(cusDev);

				Address addr = new Address();
				AddlCustomerAddressTEntity addlCustomerAddressTEntity = obj.getCusAddressEntity() != null
						&& !obj.getCusAddressEntity().isEmpty() ? obj.getCusAddressEntity().iterator().next()
								: new AddlCustomerAddressTEntity();
				addr.setLine1(addlCustomerAddressTEntity.getAddressLine1());
				addr.setLine2(addlCustomerAddressTEntity.getAddressLine2());
				addr.setCity(addlCustomerAddressTEntity.getAddressCity());
				addr.setCountryCode(addlCustomerAddressTEntity.getAddressCountryCode());
				addr.setPostalCode(addlCustomerAddressTEntity.getPostalCode());
				addr.setTerritoryCode(""); // Need to check with the team where we have to get territory code.
				objDtls.getInternalCustomerIdentifiers().getAddresses().add(addr);

				TelephoneNumber tph = new TelephoneNumber();
				AddlCustomerContactTEntity addlCustomerContactTEntity = obj.getCusContactEntity() != null
						&& !obj.getCusContactEntity().isEmpty() ? obj.getCusContactEntity().iterator().next()
								: new AddlCustomerContactTEntity();
				tph.setAreaCode(addlCustomerContactTEntity.getTnAreaCode());
				tph.setCountryCode(addlCustomerContactTEntity.getTnCountryCode());
				if (addlCustomerContactTEntity.getTnExchange() != null) {
					tph.setExchange(addlCustomerContactTEntity.getTnExchange().toString());
				}
				tph.setExtension(addlCustomerContactTEntity.getTnExtension());
				if (addlCustomerContactTEntity.getTnLineNumber() != null) {
					tph.setLineNumber(addlCustomerContactTEntity.getTnLineNumber().toString());
				}
				tph.setType(addlCustomerContactTEntity.getTnTypeCode());
				objDtls.getInternalCustomerIdentifiers().getTelephoneNumbers().add(tph);

				EMailAddress eAddr = new EMailAddress();
				eAddr.setEmailAddress(obj.getCustEmail());
				objDtls.getInternalCustomerIdentifiers().geteMailAddresses().add(eAddr);
				if(obj.getRequests()!=null && !obj.getRequests().isEmpty()) {
				RequestTEntity req = obj.getRequests().iterator().next();
				// Requestor Information
				objDtls.getRequestorInformation().setEmailAddress(req.getRqstrEmail());
				objDtls.getRequestorInformation().setRelationshipToResident(req.getRqstrResiRelationCode());
				IndividualName iName = new IndividualName(req.getRqstrFirstName(), req.getRqstrMiddleName(),
						req.getRqstrLastName(), req.getRqstrNamePrefix(), req.getRqstrNameSuffix());
				objDtls.getRequestorInformation().setIndividualName(iName);

				Address reqAddr = new Address(req.getRqstrAddressLine1(), req.getRqstrAddressLine2(),
						req.getRqstrAddressCity(), "", // Need to check wat is the exact value we need to fetch
						req.getRqstrPostalCode(), req.getRqstrTnCountryCode());
				objDtls.getRequestorInformation().setAddress(reqAddr);

				TelephoneNumber tn = new TelephoneNumber(req.getRqstrTnCountryCode(),
						req.getRqstrTnAreaCode() != null ? req.getRqstrTnAreaCode().toString() : "",
						req.getRqstrTnExchange() != null ? req.getRqstrTnExchange().toString() : "",
						req.getRqstrTnLineNumber() != null ? req.getRqstrTnLineNumber().toString() : "",
						req.getRqstrTnExtension(), req.getRqstrTnTypeCode());
				objDtls.getRequestorInformation().setTelephoneNumber(tn);

				// Resident Information
				IndividualName resIName = new IndividualName(req.getResiFirstName(), req.getResiMiddleName(),
						req.getResiLastName(), req.getResiNamePrefix(), req.getResiNameSuffix());
				objDtls.getResidentInformation().setIndividualName(resIName);

				Address resAddr = new Address(req.getResiAddressLine1(), req.getResiAddressLine2(),
						req.getResiAddressCity(), "", // Need to check wat is the exact value we need to fetch
						req.getResiPostalCode(), req.getResiTnCountryCode());
				objDtls.getResidentInformation().setAddress(resAddr);

				TelephoneNumber resTN = new TelephoneNumber(req.getResiTnCountryCode(),
						req.getResiTnAreaCode() != null ? req.getResiTnAreaCode().toString() : "",
						req.getResiTnExchange() != null ? req.getResiTnExchange().toString() : "",
						req.getResiTnLineNumber().toString() != null ? req.getResiTnLineNumber().toString() : "",
						req.getResiTnExtension(), req.getResiTnTypeCode());
				objDtls.getResidentInformation().setTelephoneNumber(resTN);

				objDtls.getResidentInformation()
						.setCharterCustomerStatus(CharterCustomerStatus.valueOf(req.getResiCustomerStatusCode()));

				objDtls.getResidentInformation().setLexusNexusEnrichment(new KBAEnrichment("", // Need to check wat is
																								// the exact value we
																								// need to fetch
						PassFail.valueOf(req.getResiKbpPassFail())));
				}
			} else {
				throw new CCPAException(CCPAConstant.ERROR_CODE, CCPAConstant.REQ_ID_NOT_FOUND_DB,
						CCPAConstant.DEV_OPS_MESSAGE_ID_NOT_FOUND, null, null);
			}
		} catch(CCPAException ce) {
			throw ce;
		} catch (Exception ex) {
			throw new CCPAException(CCPAConstant.ERROR_CODE, CCPAConstant.ERROR_MESSAGE,
					CCPAConstant.ERROR_MESSAGE_DEV_OPS, ex.getMessage(), ex);
		}
		logger.info("ComplianceRequestDtlsServiceImpl :: getCompReqDtls :: Start");
		return objDtls;
	}

}

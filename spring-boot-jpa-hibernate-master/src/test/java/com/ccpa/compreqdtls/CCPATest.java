package com.ccpa.compreqdtls;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ccpa.compreqdtls.controller.ComplianceRequestDtlController;
import com.ccpa.compreqdtls.service.ComplianceRequestDtlsServiceImpl;

@RunWith(SpringRunner.class)
@WebMvcTest(ComplianceRequestDtlController.class)
public class CCPATest {
	
	@Autowired
	private MockMvc mvc;
	@MockBean
	ComplianceRequestDtlsServiceImpl service;
	
	
@Test
public void getComplainceRequestById() {
}

}

package com.ccpa.compreqdtls.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer_system_identifiers_t", schema = "CPP", catalog = "")
public class SystemIdentifier {

	@Column(name="system_name")
	private String system;
	
	@Column(name="system_identifier_value")
	private String systemKey;

	public SystemIdentifier(String system, String systemKey) {
		this.system = system;
		this.systemKey = systemKey;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public void setSystemKey(String systemKey) {
		this.systemKey = systemKey;
	}

	public SystemIdentifier() {
		// TODO Auto-generated constructor stub
	}

	public String getSystem() {
		return system;
	}

	public String getSystemKey() {
		return systemKey;
	}
}

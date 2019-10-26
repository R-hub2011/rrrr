package com.ccpa.compreqdtls.entity;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_SYSTEM_IDENTIFIERS_T", schema = "CPP", catalog = "")
public class CustomerSystemIdentifiersTEntity {
    private String systemName;
    private String systemIdentifierValue;
    private Long id;
    CustomerTEntity customerEntity;
    
    @ManyToOne
	@JoinColumn(name = "Customer_ID")
	public CustomerTEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerTEntity customerEntity) {
		this.customerEntity = customerEntity;
	}	

    @Basic
    @Column(name = "SYSTEM_NAME")
    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    @Basic
    @Column(name = "SYSTEM_IDENTIFIER_VALUE")
    public String getSystemIdentifierValue() {
        return systemIdentifierValue;
    }

    public void setSystemIdentifierValue(String systemIdentifierValue) {
        this.systemIdentifierValue = systemIdentifierValue;
    }

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerSystemIdentifiersTEntity that = (CustomerSystemIdentifiersTEntity) o;
        return Objects.equals(systemName, that.systemName) &&
                Objects.equals(systemIdentifierValue, that.systemIdentifierValue) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemName, systemIdentifierValue, id);
    }
}

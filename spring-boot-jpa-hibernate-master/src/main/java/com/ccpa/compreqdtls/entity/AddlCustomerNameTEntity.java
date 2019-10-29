package com.ccpa.compreqdtls.entity;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADDL_CUSTOMER_NAME_T", catalog = "")
public class AddlCustomerNameTEntity {
    private String namePrefix;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nameSuffix;
    private Long id;
   
private CustomerTEntity customerEntity;
@ManyToOne( fetch = FetchType.LAZY)

@JoinColumn(name = "CUSTOMER_ID", nullable = false)
public CustomerTEntity getCustomerEntity() {
	return customerEntity;
}

public void setCustomerEntity(CustomerTEntity customerEntity) {
	this.customerEntity = customerEntity;
}

    @Basic
    @Column(name = "NAME_PREFIX")
    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    @Basic
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "MIDDLE_NAME")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "NAME_SUFFIX")
    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
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
        AddlCustomerNameTEntity that = (AddlCustomerNameTEntity) o;
        return Objects.equals(namePrefix, that.namePrefix) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(middleName, that.middleName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(nameSuffix, that.nameSuffix) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePrefix, firstName, middleName, lastName, nameSuffix, id);
    }

}

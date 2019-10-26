package com.ccpa.compreqdtls.entity;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REQUEST_TYPE_CT", schema = "CPP", catalog = "")
public class RequestTypeCtEntity {
    private String requestTypeCd;
    private String requestTypeDesc;

    @Id
    @Column(name = "REQUEST_TYPE_CD")
    public String getRequestTypeCd() {
        return requestTypeCd;
    }

    public void setRequestTypeCd(String requestTypeCd) {
        this.requestTypeCd = requestTypeCd;
    }

    @Basic
    @Column(name = "REQUEST_TYPE_DESC")
    public String getRequestTypeDesc() {
        return requestTypeDesc;
    }

    public void setRequestTypeDesc(String requestTypeDesc) {
        this.requestTypeDesc = requestTypeDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestTypeCtEntity that = (RequestTypeCtEntity) o;
        return Objects.equals(requestTypeCd, that.requestTypeCd) &&
                Objects.equals(requestTypeDesc, that.requestTypeDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestTypeCd, requestTypeDesc);
    }
}

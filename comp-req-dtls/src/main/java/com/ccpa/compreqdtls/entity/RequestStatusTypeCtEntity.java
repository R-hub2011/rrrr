package com.ccpa.compreqdtls.entity;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REQUEST_STATUS_TYPE_CT", schema = "CPP", catalog = "")
public class RequestStatusTypeCtEntity {
    private String requestStatusTypeCd;
    private String requestStatusTypeDesc;

    @Id
    @Column(name = "REQUEST_STATUS_TYPE_CD")
    public String getRequestStatusTypeCd() {
        return requestStatusTypeCd;
    }

    public void setRequestStatusTypeCd(String requestStatusTypeCd) {
        this.requestStatusTypeCd = requestStatusTypeCd;
    }

    @Basic
    @Column(name = "REQUEST_STATUS_TYPE_DESC")
    public String getRequestStatusTypeDesc() {
        return requestStatusTypeDesc;
    }

    public void setRequestStatusTypeDesc(String requestStatusTypeDesc) {
        this.requestStatusTypeDesc = requestStatusTypeDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestStatusTypeCtEntity that = (RequestStatusTypeCtEntity) o;
        return Objects.equals(requestStatusTypeCd, that.requestStatusTypeCd) &&
                Objects.equals(requestStatusTypeDesc, that.requestStatusTypeDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestStatusTypeCd, requestStatusTypeDesc);
    }
}

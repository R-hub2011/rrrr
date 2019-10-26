package com.ccpa.compreqdtls.entity;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REQUEST_PROCESS_CT", schema = "CPP", catalog = "")
public class RequestProcessCtEntity {
    private String requestProcessCd;
    private String requestProcessDesc;

    @Id
    @Column(name = "REQUEST_PROCESS_CD")
    public String getRequestProcessCd() {
        return requestProcessCd;
    }

    public void setRequestProcessCd(String requestProcessCd) {
        this.requestProcessCd = requestProcessCd;
    }

    @Basic
    @Column(name = "REQUEST_PROCESS_DESC")
    public String getRequestProcessDesc() {
        return requestProcessDesc;
    }

    public void setRequestProcessDesc(String requestProcessDesc) {
        this.requestProcessDesc = requestProcessDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestProcessCtEntity that = (RequestProcessCtEntity) o;
        return Objects.equals(requestProcessCd, that.requestProcessCd) &&
                Objects.equals(requestProcessDesc, that.requestProcessDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestProcessCd, requestProcessDesc);
    }
}

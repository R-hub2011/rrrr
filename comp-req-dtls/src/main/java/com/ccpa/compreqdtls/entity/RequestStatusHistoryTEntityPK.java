package com.ccpa.compreqdtls.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;

public class RequestStatusHistoryTEntityPK implements Serializable {
    private String requestId;
    private Time statusEffectiveDatetime;

    @Column(name = "REQUEST_ID")
    @Id
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Column(name = "STATUS_EFFECTIVE_DATETIME")
    @Id
    public Time getStatusEffectiveDatetime() {
        return statusEffectiveDatetime;
    }

    public void setStatusEffectiveDatetime(Time statusEffectiveDatetime) {
        this.statusEffectiveDatetime = statusEffectiveDatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestStatusHistoryTEntityPK that = (RequestStatusHistoryTEntityPK) o;
        return Objects.equals(requestId, that.requestId) &&
                Objects.equals(statusEffectiveDatetime, that.statusEffectiveDatetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, statusEffectiveDatetime);
    }
}

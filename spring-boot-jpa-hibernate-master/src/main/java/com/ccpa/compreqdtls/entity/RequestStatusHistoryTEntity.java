package com.ccpa.compreqdtls.entity;

import java.sql.Time;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "REQUEST_STATUS_HISTORY_T", catalog = "")
@IdClass(RequestStatusHistoryTEntityPK.class)
public class RequestStatusHistoryTEntity {
    private String requestId;
    private Time statusEffectiveDatetime;

    @Id
    @Column(name = "REQUEST_ID")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Id
    @Column(name = "STATUS_EFFECTIVE_DATETIME")
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
        RequestStatusHistoryTEntity that = (RequestStatusHistoryTEntity) o;
        return Objects.equals(requestId, that.requestId) &&
                Objects.equals(statusEffectiveDatetime, that.statusEffectiveDatetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, statusEffectiveDatetime);
    }
}

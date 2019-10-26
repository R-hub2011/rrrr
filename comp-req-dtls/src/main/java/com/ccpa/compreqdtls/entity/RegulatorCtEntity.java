package com.ccpa.compreqdtls.entity;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGULATOR_CT", schema = "CPP", catalog = "")
public class RegulatorCtEntity {
    private String regulationCd;
    private String regulationName;

    @Id
    @Column(name = "REGULATION_CD")
    public String getRegulationCd() {
        return regulationCd;
    }

    public void setRegulationCd(String regulationCd) {
        this.regulationCd = regulationCd;
    }

    @Basic
    @Column(name = "REGULATION_NAME")
    public String getRegulationName() {
        return regulationName;
    }

    public void setRegulationName(String regulationName) {
        this.regulationName = regulationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegulatorCtEntity that = (RegulatorCtEntity) o;
        return Objects.equals(regulationCd, that.regulationCd) &&
                Objects.equals(regulationName, that.regulationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regulationCd, regulationName);
    }
}

package com.ccpa.compreqdtls.model;

public class KBAEnrichment {
    private String individualID;
    private PassFail kbaPassFail;

    public KBAEnrichment(String individualID, PassFail kbaPassFail) {
        this.individualID = individualID;
        this.kbaPassFail = kbaPassFail;
    }

    public String getIndividualID() {
        return individualID;
    }

    public PassFail getKbaPassFail() {
        return kbaPassFail;
    }

}

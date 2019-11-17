package com.campus.order.domain;

public class Final {
    private Long fId;

    private String fAddress;

    private String fType;

    private String pay;

    private String fText;

    private Long uid;

    private Double fSum;

    private String rdcolor;

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public String getfAddress() {
        return fAddress;
    }

    public void setfAddress(String fAddress) {
        this.fAddress = fAddress == null ? null : fAddress.trim();
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType == null ? null : fType.trim();
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay == null ? null : pay.trim();
    }

    public String getfText() {
        return fText;
    }

    public void setfText(String fText) {
        this.fText = fText == null ? null : fText.trim();
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Double getfSum() {
        return fSum;
    }

    public void setfSum(Double fSum) {
        this.fSum = fSum;
    }

    public String getRdcolor() {
        return rdcolor;
    }

    public void setRdcolor(String rdcolor) {
        this.rdcolor = rdcolor == null ? null : rdcolor.trim();
    }

    @Override
    public String toString() {
        return "Final{" +
                "fId=" + fId +
                ", fAddress='" + fAddress + '\'' +
                ", fType='" + fType + '\'' +
                ", pay='" + pay + '\'' +
                ", fText='" + fText + '\'' +
                ", uid=" + uid +
                ", fSum=" + fSum +
                ", rdcolor='" + rdcolor + '\'' +
                '}';
    }
}
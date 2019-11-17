package com.campus.order.domain;

public class ProductType {
    private Long tId;

    private String tName;

    private Long tMid;

    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Long gettMid() {
        return tMid;
    }

    public void settMid(Long tMid) {
        this.tMid = tMid;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tMid=" + tMid +
                '}';
    }
}
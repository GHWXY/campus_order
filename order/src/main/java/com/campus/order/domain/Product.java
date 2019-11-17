package com.campus.order.domain;

public class Product {
    private Long pId;

    private String pName;

    private Double pPrice;

    private Long mId;

    private String pPicon;

    private Double pPromotion;

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Double getpPrice() {
        return pPrice;
    }

    public void setpPrice(Double pPrice) {
        this.pPrice = pPrice;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getpPicon() {
        return pPicon;
    }

    public void setpPicon(String pPicon) {
        this.pPicon = pPicon == null ? null : pPicon.trim();
    }

    public Double getpPromotion() {
        return pPromotion;
    }

    public void setpPromotion(Double pPromotion) {
        this.pPromotion = pPromotion;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pPrice=" + pPrice +
                ", mId=" + mId +
                ", pPicon='" + pPicon + '\'' +
                ", pPromotion=" + pPromotion +
                '}';
    }
}
package com.campus.order.domain;

import java.math.BigDecimal;

public class Settlement {
    private Long sId;

    private String sCheckbox;

    private String sPiocn;

    private String sCname;

    private BigDecimal sCuxiao;

    private Long sCount;

    private BigDecimal sPrice;

    private Long uid;

    private Long sNumberw;

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public String getsCheckbox() {
        return sCheckbox;
    }

    public void setsCheckbox(String sCheckbox) {
        this.sCheckbox = sCheckbox == null ? null : sCheckbox.trim();
    }

    public String getsPiocn() {
        return sPiocn;
    }

    public void setsPiocn(String sPiocn) {
        this.sPiocn = sPiocn == null ? null : sPiocn.trim();
    }

    public String getsCname() {
        return sCname;
    }

    public void setsCname(String sCname) {
        this.sCname = sCname == null ? null : sCname.trim();
    }

    public BigDecimal getsCuxiao() {
        return sCuxiao;
    }

    public void setsCuxiao(BigDecimal sCuxiao) {
        this.sCuxiao = sCuxiao;
    }

    public Long getsCount() {
        return sCount;
    }

    public void setsCount(Long sCount) {
        this.sCount = sCount;
    }

    public BigDecimal getsPrice() {
        return sPrice;
    }

    public void setsPrice(BigDecimal sPrice) {
        this.sPrice = sPrice;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getsNumberw() {
        return sNumberw;
    }

    public void setsNumberw(Long sNumberw) {
        this.sNumberw = sNumberw;
    }
}
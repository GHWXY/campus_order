package com.campus.order.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Merchant {
    private Long mId;

    private String mName;

    private String mPhoto;

    private String mAddress;

    private Long mPhone;

    private String mSpecial;

    private String mActive;

    private Date mDate;

    private BigDecimal mPrice;

    private Long mPid;

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmPhoto() {
        return mPhoto;
    }

    public void setmPhoto(String mPhoto) {
        this.mPhoto = mPhoto == null ? null : mPhoto.trim();
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress == null ? null : mAddress.trim();
    }

    public Long getmPhone() {
        return mPhone;
    }

    public void setmPhone(Long mPhone) {
        this.mPhone = mPhone;
    }

    public String getmSpecial() {
        return mSpecial;
    }

    public void setmSpecial(String mSpecial) {
        this.mSpecial = mSpecial == null ? null : mSpecial.trim();
    }

    public String getmActive() {
        return mActive;
    }

    public void setmActive(String mActive) {
        this.mActive = mActive == null ? null : mActive.trim();
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public BigDecimal getmPrice() {
        return mPrice;
    }

    public void setmPrice(BigDecimal mPrice) {
        this.mPrice = mPrice;
    }

    public Long getmPid() {
        return mPid;
    }

    public void setmPid(Long mPid) {
        this.mPid = mPid;
    }
}
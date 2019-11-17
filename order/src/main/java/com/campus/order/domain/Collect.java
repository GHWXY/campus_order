package com.campus.order.domain;

public class Collect {
    private Long sId;

    private String sName;

    private String sPhoto;

    private Long sMid;

    private Long sUid;

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsPhoto() {
        return sPhoto;
    }

    public void setsPhoto(String sPhoto) {
        this.sPhoto = sPhoto == null ? null : sPhoto.trim();
    }

    public Long getsMid() {
        return sMid;
    }

    public void setsMid(Long sMid) {
        this.sMid = sMid;
    }

    public Long getsUid() {
        return sUid;
    }

    public void setsUid(Long sUid) {
        this.sUid = sUid;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sPhoto='" + sPhoto + '\'' +
                ", sMid=" + sMid +
                ", sUid=" + sUid +
                '}';
    }
}
package com.campus.order.domain;

public class Address {
    private Long aid;

    private String auname;

    private Long auphone;

    private String azone;

    private String ainfo;

    private Long uid;

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getAuname() {
        return auname;
    }

    public void setAuname(String auname) {
        this.auname = auname == null ? null : auname.trim();
    }

    public Long getAuphone() {
        return auphone;
    }

    public void setAuphone(Long auphone) {
        this.auphone = auphone;
    }

    public String getAzone() {
        return azone;
    }

    public void setAzone(String azone) {
        this.azone = azone == null ? null : azone.trim();
    }

    public String getAinfo() {
        return ainfo;
    }

    public void setAinfo(String ainfo) {
        this.ainfo = ainfo == null ? null : ainfo.trim();
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", auname='" + auname + '\'' +
                ", auphone=" + auphone +
                ", azone='" + azone + '\'' +
                ", ainfo='" + ainfo + '\'' +
                ", uid=" + uid +
                '}';
    }
}
package com.campus.order.domain;

public class Cart {
    private Long cid;

    private String cname;

    private String cpicon;

    private Double cprice;

    private Long cnumber;

    private Double cuprice;

    private Long pid;

    private String cinfo;

    private Long uid;

    private String mname;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCpicon() {
        return cpicon;
    }

    public void setCpicon(String cpicon) {
        this.cpicon = cpicon == null ? null : cpicon.trim();
    }

    public Double getCprice() {
        return cprice;
    }

    public void setCprice(Double cprice) {
        this.cprice = cprice;
    }

    public Long getCnumber() {
        return cnumber;
    }

    public void setCnumber(Long cnumber) {
        this.cnumber = cnumber;
    }

    public Double getCuprice() {
        return cuprice;
    }

    public void setCuprice(Double cuprice) {
        this.cuprice = cuprice;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getCinfo() {
        return cinfo;
    }

    public void setCinfo(String cinfo) {
        this.cinfo = cinfo == null ? null : cinfo.trim();
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cpicon='" + cpicon + '\'' +
                ", cprice=" + cprice +
                ", cnumber=" + cnumber +
                ", cuprice=" + cuprice +
                ", pid=" + pid +
                ", cinfo='" + cinfo + '\'' +
                ", uid=" + uid +
                ", mname='" + mname + '\'' +
                '}';
    }
}
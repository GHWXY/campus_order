package com.campus.order.domain;

public class UserInfo {
    private Long uId;

    private String uName;

    private String uPwd;

    private String email;

    private String uPhone;

    private String uCheckcode;

    private Long aid;

    private String uPwd2;

    private String uPhoto;

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuCheckcode() {
        return uCheckcode;
    }

    public void setuCheckcode(String uCheckcode) {
        this.uCheckcode = uCheckcode == null ? null : uCheckcode.trim();
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getuPwd2() {
        return uPwd2;
    }

    public void setuPwd2(String uPwd2) {
        this.uPwd2 = uPwd2 == null ? null : uPwd2.trim();
    }

    public String getuPhoto() {
        return uPhoto;
    }

    public void setuPhoto(String uPhoto) {
        this.uPhoto = uPhoto == null ? null : uPhoto.trim();
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPwd='" + uPwd + '\'' +
                ", email='" + email + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", uCheckcode='" + uCheckcode + '\'' +
                ", aid=" + aid +
                ", uPwd2='" + uPwd2 + '\'' +
                ", uPhoto='" + uPhoto + '\'' +
                '}';
    }
}
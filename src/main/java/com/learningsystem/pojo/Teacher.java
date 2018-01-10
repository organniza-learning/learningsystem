package com.learningsystem.pojo;

public class Teacher {
    private Integer tId;

    private String tName;

    private Integer tTeacher;

    private String cClass;

    private String tGrnder;

    private String tPhone;

    private Integer tQq;

    private String tWechat;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Integer gettTeacher() {
        return tTeacher;
    }

    public void settTeacher(Integer tTeacher) {
        this.tTeacher = tTeacher;
    }

    public String getcClass() {
        return cClass;
    }

    public void setcClass(String cClass) {
        this.cClass = cClass == null ? null : cClass.trim();
    }

    public String gettGrnder() {
        return tGrnder;
    }

    public void settGrnder(String tGrnder) {
        this.tGrnder = tGrnder == null ? null : tGrnder.trim();
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone == null ? null : tPhone.trim();
    }

    public Integer gettQq() {
        return tQq;
    }

    public void settQq(Integer tQq) {
        this.tQq = tQq;
    }

    public String gettWechat() {
        return tWechat;
    }

    public void settWechat(String tWechat) {
        this.tWechat = tWechat == null ? null : tWechat.trim();
    }
}
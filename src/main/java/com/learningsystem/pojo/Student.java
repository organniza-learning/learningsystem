package com.learningsystem.pojo;

public class Student {
    private Integer stuId;

    private String tgOpenid;

    private Integer cClassid;

    private Integer tgIdentifying;

    private String stuStudentid;

    private String stuPassword;

    private String stuName;

    private String stuGrade;

    private Integer gIdentifying;

    private String stuEmail;

    private Integer stuPhoner;

    private Integer stuQq;

    private String stuWechat;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getTgOpenid() {
        return tgOpenid;
    }

    public void setTgOpenid(String tgOpenid) {
        this.tgOpenid = tgOpenid == null ? null : tgOpenid.trim();
    }

    public Integer getcClassid() {
        return cClassid;
    }

    public void setcClassid(Integer cClassid) {
        this.cClassid = cClassid;
    }

    public Integer getTgIdentifying() {
        return tgIdentifying;
    }

    public void setTgIdentifying(Integer tgIdentifying) {
        this.tgIdentifying = tgIdentifying;
    }

    public String getStuStudentid() {
        return stuStudentid;
    }

    public void setStuStudentid(String stuStudentid) {
        this.stuStudentid = stuStudentid == null ? null : stuStudentid.trim();
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword == null ? null : stuPassword.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade == null ? null : stuGrade.trim();
    }

    public Integer getgIdentifying() {
        return gIdentifying;
    }

    public void setgIdentifying(Integer gIdentifying) {
        this.gIdentifying = gIdentifying;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail == null ? null : stuEmail.trim();
    }

    public Integer getStuPhoner() {
        return stuPhoner;
    }

    public void setStuPhoner(Integer stuPhoner) {
        this.stuPhoner = stuPhoner;
    }

    public Integer getStuQq() {
        return stuQq;
    }

    public void setStuQq(Integer stuQq) {
        this.stuQq = stuQq;
    }

    public String getStuWechat() {
        return stuWechat;
    }

    public void setStuWechat(String stuWechat) {
        this.stuWechat = stuWechat == null ? null : stuWechat.trim();
    }
}
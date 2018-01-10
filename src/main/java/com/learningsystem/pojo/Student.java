package com.learningsystem.pojo;

public class Student {
    private Integer stuId;//表ID

    private String tgOpenid;//微信登录绑定ID

    private Integer cClassid;//班级标识

    private Integer tgIdentifying;//成绩表绑定学生

    private String stuStudentid;//学生学号

    private String stuPassword;//学生密码

    private String stuName;//学生姓名

    private String stuGender;//学生性别

    private Integer gIdentifying;//分组标识

    private String stuEmail;//学生邮箱

    private String stuPhoner;//学生手机

    private String stuQq;//学生QQ

    private String stuWechat;//学生微信

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

    public String getGtuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender == null ? null : stuGender.trim();
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

    public String getStuPhoner() {
        return stuPhoner;
    }

    public void setStuPhoner(String stuPhoner) {
        this.stuPhoner = stuPhoner;
    }

    public String getStuQq() {
        return stuQq;
    }

    public void setStuQq(String stuQq) {
        this.stuQq = stuQq;
    }

    public String getStuWechat() {
        return stuWechat;
    }

    public void setStuWechat(String stuWechat) {
        this.stuWechat = stuWechat == null ? null : stuWechat.trim();
    }
}
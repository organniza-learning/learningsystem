package com.learningsystem.pojo;

/**
*@Author : YangGuang
*@Description:学生实体类
*@Date:Created in 13:12 2018/1/7
*
**/
public class Student {
    private Integer stuId;

    private String tgOpenid;

    private Integer cClassid;

    private Integer tgIdentifying;

    private String stuStudentid;

    private String stuPassword;

    private String stuName;

    private Integer gSpeaknum;

    private String stuEmail;

    private Integer gIdentifying;

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

    public Integer getgSpeaknum() {
        return gSpeaknum;
    }

    public void setgSpeaknum(Integer gSpeaknum) {
        this.gSpeaknum = gSpeaknum;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail == null ? null : stuEmail.trim();
    }

    public Integer getgIdentifying() {
        return gIdentifying;
    }

    public void setgIdentifying(Integer gIdentifying) {
        this.gIdentifying = gIdentifying;
    }
}
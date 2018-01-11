package com.learningsystem.pojo;

public class Student {
    private Integer stuId;

    private String tgOpenid;

    private Integer cClassid;

    private Integer tgIdentifying;

    private String stuStudentid;

    private String stuPassword;

    private String stuName;

    private String stuGender;

    private Integer gIdentifying;

    private String stuEmail;

    private String stuPhoner;

    private String stuQq;

    private String stuWechat;
    
    private Class classs;
    

    public Class getClasss() {
		return classs;
	}

	public void setClasss(Class classs) {
		this.classs = classs;
	}

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

    public String getStuGender() {
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
        this.stuPhoner = stuPhoner == null ? null : stuPhoner.trim();
    }

    public String getStuQq() {
        return stuQq;
    }

    public void setStuQq(String stuQq) {
        this.stuQq = stuQq == null ? null : stuQq.trim();
    }

    public String getStuWechat() {
        return stuWechat;
    }

    public void setStuWechat(String stuWechat) {
        this.stuWechat = stuWechat == null ? null : stuWechat.trim();
    }
}
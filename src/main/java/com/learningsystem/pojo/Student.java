package com.learningsystem.pojo;

public class Student {
    private Integer stuId;

    private String tgOpenid;

    private Integer tgIdentifying;

    private String stuStudentid;

    private String stuName;

    private String stuGroup;

    private String stuDuty;

    private Integer gSpeaknum;

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

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuGroup() {
        return stuGroup;
    }

    public void setStuGroup(String stuGroup) {
        this.stuGroup = stuGroup == null ? null : stuGroup.trim();
    }

    public String getStuDuty() {
        return stuDuty;
    }

    public void setStuDuty(String stuDuty) {
        this.stuDuty = stuDuty == null ? null : stuDuty.trim();
    }

    public Integer getgSpeaknum() {
        return gSpeaknum;
    }

    public void setgSpeaknum(Integer gSpeaknum) {
        this.gSpeaknum = gSpeaknum;
    }
}
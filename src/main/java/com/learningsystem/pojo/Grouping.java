package com.learningsystem.pojo;

/**
*@Author : YangGuang
*@Description:分组实体类
*@Date:Created in 12:16 2018/1/7
*
**/
public class Grouping {
    private Integer gId;

    private Integer gIdentifying;

    private String gName;

    private String gStudentid;

    private Integer gSpeaknum;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getgIdentifying() {
        return gIdentifying;
    }

    public void setgIdentifying(Integer gIdentifying) {
        this.gIdentifying = gIdentifying;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public String getgStudentid() {
        return gStudentid;
    }

    public void setgStudentid(String gStudentid) {
        this.gStudentid = gStudentid == null ? null : gStudentid.trim();
    }

    public Integer getgSpeaknum() {
        return gSpeaknum;
    }

    public void setgSpeaknum(Integer gSpeaknum) {
        this.gSpeaknum = gSpeaknum;
    }
}
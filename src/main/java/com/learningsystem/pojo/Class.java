package com.learningsystem.pojo;

/**
*@Author : YangGuang
*@Description:班级实体类
*@Date:Created in 12:16 2018/1/7
*
**/
public class Class {
    private Integer cId;

    private Integer cClassid;

    private String tTeacher;

    private String cName;

    private String cCollege;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcClassid() {
        return cClassid;
    }

    public void setcClassid(Integer cClassid) {
        this.cClassid = cClassid;
    }

    public String gettTeacher() {
        return tTeacher;
    }

    public void settTeacher(String tTeacher) {
        this.tTeacher = tTeacher == null ? null : tTeacher.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcCollege() {
        return cCollege;
    }

    public void setcCollege(String cCollege) {
        this.cCollege = cCollege == null ? null : cCollege.trim();
    }
}
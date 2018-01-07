package com.learningsystem.pojo;

import java.util.Date;

/**
*@Author : YangGuang
*@Description:发布应用案例实体类
*@Date:Created in 12:16 2018/1/7
*
**/
public class Releaseapplicationcase {
    private Integer racId;

    private Integer tTeacher;

    private String racClass;

    private String racCasedescription;

    private String racCaseimg;

    private String racUploadaccessory;

    private Integer racCondition;

    private Date racTime;

    public Integer getRacId() {
        return racId;
    }

    public void setRacId(Integer racId) {
        this.racId = racId;
    }

    public Integer gettTeacher() {
        return tTeacher;
    }

    public void settTeacher(Integer tTeacher) {
        this.tTeacher = tTeacher;
    }

    public String getRacClass() {
        return racClass;
    }

    public void setRacClass(String racClass) {
        this.racClass = racClass == null ? null : racClass.trim();
    }

    public String getRacCasedescription() {
        return racCasedescription;
    }

    public void setRacCasedescription(String racCasedescription) {
        this.racCasedescription = racCasedescription == null ? null : racCasedescription.trim();
    }

    public String getRacCaseimg() {
        return racCaseimg;
    }

    public void setRacCaseimg(String racCaseimg) {
        this.racCaseimg = racCaseimg == null ? null : racCaseimg.trim();
    }

    public String getRacUploadaccessory() {
        return racUploadaccessory;
    }

    public void setRacUploadaccessory(String racUploadaccessory) {
        this.racUploadaccessory = racUploadaccessory == null ? null : racUploadaccessory.trim();
    }

    public Integer getRacCondition() {
        return racCondition;
    }

    public void setRacCondition(Integer racCondition) {
        this.racCondition = racCondition;
    }

    public Date getRacTime() {
        return racTime;
    }

    public void setRacTime(Date racTime) {
        this.racTime = racTime;
    }
}
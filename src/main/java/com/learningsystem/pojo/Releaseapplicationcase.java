package com.learningsystem.pojo;

import java.util.Date;

public class Releaseapplicationcase {
    private Integer racId;

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
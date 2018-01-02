package com.learningsystem.pojo;

import java.util.Date;

public class Releaselearningcontent {
    private Integer rlcId;

    private String rlcClass;

    private String rlcLearninggoals;

    private String rlcLearningrequire;

    private String rlcUploadaccessory;

    private Integer rlcCondition;

    private Date rlcTime;

    public Integer getRlcId() {
        return rlcId;
    }

    public void setRlcId(Integer rlcId) {
        this.rlcId = rlcId;
    }

    public String getRlcClass() {
        return rlcClass;
    }

    public void setRlcClass(String rlcClass) {
        this.rlcClass = rlcClass == null ? null : rlcClass.trim();
    }

    public String getRlcLearninggoals() {
        return rlcLearninggoals;
    }

    public void setRlcLearninggoals(String rlcLearninggoals) {
        this.rlcLearninggoals = rlcLearninggoals == null ? null : rlcLearninggoals.trim();
    }

    public String getRlcLearningrequire() {
        return rlcLearningrequire;
    }

    public void setRlcLearningrequire(String rlcLearningrequire) {
        this.rlcLearningrequire = rlcLearningrequire == null ? null : rlcLearningrequire.trim();
    }

    public String getRlcUploadaccessory() {
        return rlcUploadaccessory;
    }

    public void setRlcUploadaccessory(String rlcUploadaccessory) {
        this.rlcUploadaccessory = rlcUploadaccessory == null ? null : rlcUploadaccessory.trim();
    }

    public Integer getRlcCondition() {
        return rlcCondition;
    }

    public void setRlcCondition(Integer rlcCondition) {
        this.rlcCondition = rlcCondition;
    }

    public Date getRlcTime() {
        return rlcTime;
    }

    public void setRlcTime(Date rlcTime) {
        this.rlcTime = rlcTime;
    }
}
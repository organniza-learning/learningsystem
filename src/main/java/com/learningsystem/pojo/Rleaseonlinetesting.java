package com.learningsystem.pojo;

public class Rleaseonlinetesting {
    private Integer rotId;

    private Integer rotIdentifying;

    private String rotClass;

    private String rotChoicequestion;

    private String choicequestionResult;

    private String rotCompletion;

    private String completionResult;

    private String rotTexttopic;

    private String texttopicResult;

    private String rotTrueorfalse;

    private Integer trueorfalseResult;

    private String stuStudentid;

    public Integer getRotId() {
        return rotId;
    }

    public void setRotId(Integer rotId) {
        this.rotId = rotId;
    }

    public Integer getRotIdentifying() {
        return rotIdentifying;
    }

    public void setRotIdentifying(Integer rotIdentifying) {
        this.rotIdentifying = rotIdentifying;
    }

    public String getRotClass() {
        return rotClass;
    }

    public void setRotClass(String rotClass) {
        this.rotClass = rotClass == null ? null : rotClass.trim();
    }

    public String getRotChoicequestion() {
        return rotChoicequestion;
    }

    public void setRotChoicequestion(String rotChoicequestion) {
        this.rotChoicequestion = rotChoicequestion == null ? null : rotChoicequestion.trim();
    }

    public String getChoicequestionResult() {
        return choicequestionResult;
    }

    public void setChoicequestionResult(String choicequestionResult) {
        this.choicequestionResult = choicequestionResult == null ? null : choicequestionResult.trim();
    }

    public String getRotCompletion() {
        return rotCompletion;
    }

    public void setRotCompletion(String rotCompletion) {
        this.rotCompletion = rotCompletion == null ? null : rotCompletion.trim();
    }

    public String getCompletionResult() {
        return completionResult;
    }

    public void setCompletionResult(String completionResult) {
        this.completionResult = completionResult == null ? null : completionResult.trim();
    }

    public String getRotTexttopic() {
        return rotTexttopic;
    }

    public void setRotTexttopic(String rotTexttopic) {
        this.rotTexttopic = rotTexttopic == null ? null : rotTexttopic.trim();
    }

    public String getTexttopicResult() {
        return texttopicResult;
    }

    public void setTexttopicResult(String texttopicResult) {
        this.texttopicResult = texttopicResult == null ? null : texttopicResult.trim();
    }

    public String getRotTrueorfalse() {
        return rotTrueorfalse;
    }

    public void setRotTrueorfalse(String rotTrueorfalse) {
        this.rotTrueorfalse = rotTrueorfalse == null ? null : rotTrueorfalse.trim();
    }

    public Integer getTrueorfalseResult() {
        return trueorfalseResult;
    }

    public void setTrueorfalseResult(Integer trueorfalseResult) {
        this.trueorfalseResult = trueorfalseResult;
    }

    public String getStuStudentid() {
        return stuStudentid;
    }

    public void setStuStudentid(String stuStudentid) {
        this.stuStudentid = stuStudentid == null ? null : stuStudentid.trim();
    }
}
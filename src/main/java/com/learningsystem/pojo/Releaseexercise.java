package com.learningsystem.pojo;

/**
*@Author : YangGuang
*@Description:发布课后习题实体类
*@Date:Created in 12:17 2018/1/7
*
**/
public class Releaseexercise {
    private Integer reId;

    private String reTitle;

    private Integer tTeacher;

    private String reClass;

    private String reText;

    private String reFile;

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public String getReTitle() {
        return reTitle;
    }

    public void setReTitle(String reTitle) {
        this.reTitle = reTitle == null ? null : reTitle.trim();
    }

    public Integer gettTeacher() {
        return tTeacher;
    }

    public void settTeacher(Integer tTeacher) {
        this.tTeacher = tTeacher;
    }

    public String getReClass() {
        return reClass;
    }

    public void setReClass(String reClass) {
        this.reClass = reClass == null ? null : reClass.trim();
    }

    public String getReText() {
        return reText;
    }

    public void setReText(String reText) {
        this.reText = reText == null ? null : reText.trim();
    }

    public String getReFile() {
        return reFile;
    }

    public void setReFile(String reFile) {
        this.reFile = reFile == null ? null : reFile.trim();
    }
}
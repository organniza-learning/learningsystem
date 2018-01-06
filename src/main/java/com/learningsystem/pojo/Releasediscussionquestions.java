package com.learningsystem.pojo;

import java.util.Date;

public class Releasediscussionquestions {
    private Integer rdqId;

    private String gStudentid;

    private Integer tTeacher;

    private Integer tagId;

    private String rdqTheme;

    private String rdqClass;

    private String rdqText;

    private Date rdqTime;

    private String rdqUploadfile;

    //查询Tag标签
    private Tag tag;

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Integer getRdqId() {
        return rdqId;
    }

    public void setRdqId(Integer rdqId) {
        this.rdqId = rdqId;
    }

    public String getgStudentid() {
        return gStudentid;
    }

    public void setgStudentid(String gStudentid) {
        this.gStudentid = gStudentid == null ? null : gStudentid.trim();
    }

    public Integer gettTeacher() {
        return tTeacher;
    }

    public void settTeacher(Integer tTeacher) {
        this.tTeacher = tTeacher;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getRdqTheme() {
        return rdqTheme;
    }

    public void setRdqTheme(String rdqTheme) {
        this.rdqTheme = rdqTheme == null ? null : rdqTheme.trim();
    }

    public String getRdqClass() {
        return rdqClass;
    }

    public void setRdqClass(String rdqClass) {
        this.rdqClass = rdqClass == null ? null : rdqClass.trim();
    }

    public String getRdqText() {
        return rdqText;
    }

    public void setRdqText(String rdqText) {
        this.rdqText = rdqText == null ? null : rdqText.trim();
    }

    public Date getRdqTime() {
        return rdqTime;
    }

    public void setRdqTime(Date rdqTime) {
        this.rdqTime = rdqTime;
    }

    public String getRdqUploadfile() {
        return rdqUploadfile;
    }

    public void setRdqUploadfile(String rdqUploadfile) {
        this.rdqUploadfile = rdqUploadfile == null ? null : rdqUploadfile.trim();
    }
}
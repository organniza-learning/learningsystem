package com.learningsystem.pojo;

public class Writeback {
    private Integer wbId;

    private Integer rdqId;

    private String wbContent;

    private String wbUploadfile;

    private String stuStudentid;

    public Integer getWbId() {
        return wbId;
    }

    public void setWbId(Integer wbId) {
        this.wbId = wbId;
    }

    public Integer getRdqId() {
        return rdqId;
    }

    public void setRdqId(Integer rdqId) {
        this.rdqId = rdqId;
    }

    public String getWbContent() {
        return wbContent;
    }

    public void setWbContent(String wbContent) {
        this.wbContent = wbContent == null ? null : wbContent.trim();
    }

    public String getWbUploadfile() {
        return wbUploadfile;
    }

    public void setWbUploadfile(String wbUploadfile) {
        this.wbUploadfile = wbUploadfile == null ? null : wbUploadfile.trim();
    }

    public String getStuStudentid() {
        return stuStudentid;
    }

    public void setStuStudentid(String stuStudentid) {
        this.stuStudentid = stuStudentid == null ? null : stuStudentid.trim();
    }
}
package com.learningsystem.pojo;

public class Classwork {
    private Integer ckId;

    private String ckCalss;

    private Integer gIdentifying;

    private Integer ckWeek;

    private String ckFile;

    public Integer getCkId() {
        return ckId;
    }

    public void setCkId(Integer ckId) {
        this.ckId = ckId;
    }

    public String getCkCalss() {
        return ckCalss;
    }

    public void setCkCalss(String ckCalss) {
        this.ckCalss = ckCalss == null ? null : ckCalss.trim();
    }

    public Integer getgIdentifying() {
        return gIdentifying;
    }

    public void setgIdentifying(Integer gIdentifying) {
        this.gIdentifying = gIdentifying;
    }

    public Integer getCkWeek() {
        return ckWeek;
    }

    public void setCkWeek(Integer ckWeek) {
        this.ckWeek = ckWeek;
    }

    public String getCkFile() {
        return ckFile;
    }

    public void setCkFile(String ckFile) {
        this.ckFile = ckFile == null ? null : ckFile.trim();
    }
}
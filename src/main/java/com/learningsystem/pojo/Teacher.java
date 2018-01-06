package com.learningsystem.pojo;

public class Teacher {
    private Integer tId;

    private String tName;

    private Integer tTeacher;

    private String cClass;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Integer gettTeacher() {
        return tTeacher;
    }

    public void settTeacher(Integer tTeacher) {
        this.tTeacher = tTeacher;
    }

    public String getcClass() {
        return cClass;
    }

    public void setcClass(String cClass) {
        this.cClass = cClass == null ? null : cClass.trim();
    }
}
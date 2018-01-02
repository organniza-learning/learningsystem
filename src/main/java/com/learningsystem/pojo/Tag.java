package com.learningsystem.pojo;

public class Tag {
    private Integer tagId;

    private String tagConten;

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagConten() {
        return tagConten;
    }

    public void setTagConten(String tagConten) {
        this.tagConten = tagConten == null ? null : tagConten.trim();
    }
}
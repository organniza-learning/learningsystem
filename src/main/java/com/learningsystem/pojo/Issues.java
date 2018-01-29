package com.learningsystem.pojo;

public class Issues {
    private Integer isId;

    private String tgOpenid;

    private String state;

    private String body;

    private String title;

    private String avatarUrl;

    private String replyer;

    private String endtime;

    private String starttime;

    private String replybody;

    private String imgUrl;

    private String label;

    private String details;

    public Integer getIsId() {
        return isId;
    }

    public void setIsId(Integer isId) {
        this.isId = isId;
    }

    public String getTgOpenid() {
        return tgOpenid;
    }

    public void setTgOpenid(String tgOpenid) {
        this.tgOpenid = tgOpenid == null ? null : tgOpenid.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getReplyer() {
        return replyer;
    }

    public void setReplyer(String replyer) {
        this.replyer = replyer == null ? null : replyer.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getReplybody() {
        return replybody;
    }

    public void setReplybody(String replybody) {
        this.replybody = replybody == null ? null : replybody.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

	public Issues(String tgOpenid, String state, String body, String title, String starttime, String imgUrl,
			String details) {
		super();
		this.tgOpenid = tgOpenid;
		this.state = state;
		this.body = body;
		this.title = title;
		this.starttime = starttime;
		this.imgUrl = imgUrl;
		this.details = details;
	}

	public Issues() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
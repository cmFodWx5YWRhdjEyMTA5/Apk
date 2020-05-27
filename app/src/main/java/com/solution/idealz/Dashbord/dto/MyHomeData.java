package com.solution.idealz.Dashbord.dto;

public class MyHomeData {


    private String description;
    private String time;
    private String status;
    private String colour;
    private String leadid;
    private String ads;
    private String cname;
    private int imgId;


    public MyHomeData(String description, String leadid, String time, String status, String cname, int imgId, String colour, String ads) {
        this.description = description;
        this.time = time;
        this.leadid = leadid;
        this.imgId = imgId;
        this.status = status;
        this.colour = colour;
        this.cname = cname;
        this.ads = ads;
    }


    public String getAds() {
        return ads;
    }

    public void setAds(String ads) {
        this.ads = ads;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLeadid() {
        return leadid;
    }

    public void setLeadid(String leadid) {
        this.leadid = leadid;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

}

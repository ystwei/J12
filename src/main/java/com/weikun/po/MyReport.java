package com.weikun.po;

/**
 * Created by Administrator on 2016/12/4.
 */
public class MyReport {
    private int fid;
    private String fname;

    public MyReport(int fid, String fname) {
        this.fid = fid;
        this.fname = fname;
    }
    public MyReport(){

    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}

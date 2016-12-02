package com.weikun.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/2.
 */
public class Father1 {
    private int fid;
    private String fname;
    private Set<Son1> sons=new HashSet<Son1>();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Father1 father1 = (Father1) o;

        if (fid != father1.fid) return false;
        if (fname != null ? !fname.equals(father1.fname) : father1.fname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid;
        result = 31 * result + (fname != null ? fname.hashCode() : 0);
        return result;
    }

    public Set<Son1> getSons() {
        return sons;
    }

    public void setSons(Set<Son1> sons) {
        this.sons = sons;
    }
}

package com.weikun.po;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/4.
 */
@Entity
public class Father2 {
    private int fid;
    private String fname;
    private Set<Son2> son=new HashSet<Son2>();

    @Id
    @Column(name = "fid", nullable = false )
    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "fname", nullable = true, length = 10)
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

        Father2 father2 = (Father2) o;

        if (fid != father2.fid) return false;
        if (fname != null ? !fname.equals(father2.fname) : father2.fname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid;
        result = 31 * result + (fname != null ? fname.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "father",cascade =CascadeType.ALL )
    public Set<Son2> getSon() {
        return son;
    }

    public void setSon(Set<Son2> son) {
        this.son = son;
    }
}

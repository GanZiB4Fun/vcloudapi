package net.shangzhibo.vcloud.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xiaoming(a)wallaw.cn on 16/8/27.
 */
public class JsonRet implements Serializable {

    private int pnum;
    private List<Channel> list;
    private int totalRecords;
    private int totalPnum;
    private int records;

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public List<Channel> getList() {
        return list;
    }

    public void setList(List<Channel> list) {
        this.list = list;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getTotalPnum() {
        return totalPnum;
    }

    public void setTotalPnum(int totalPnum) {
        this.totalPnum = totalPnum;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }
}

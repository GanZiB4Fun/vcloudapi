package net.shangzhibo.vcloud.model;

import java.util.Date;

/**
 * Created by xiaoming(a)wallaw.cn on 16/8/27.
 */
public class ResultCreateChannel {
    private Channel ret;
    private String code;
    private String msg;

    public Channel getRet() {
        return ret;
    }

    public void setRet(Channel ret) {
        this.ret = ret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}



package net.shangzhibo.vcloud.model;

import java.io.Serializable;

/**
 * Created by xiaoming(a)wallaw.cn on 16/8/27.
 */
public class ChannelList implements Serializable {

    private JsonRet ret;
    private int code;

    public JsonRet getRet() {
        return ret;
    }

    public void setRet(JsonRet ret) {
        this.ret = ret;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

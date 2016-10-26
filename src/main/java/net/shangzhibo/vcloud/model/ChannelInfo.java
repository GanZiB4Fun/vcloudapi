package net.shangzhibo.vcloud.model;

import java.util.Date;

/**
 * Created by xiaoming(a)wallaw.cn on 16/8/27.
 */
public class ChannelInfo {
    private String httpPullUrl;
    private String hlsPullUrl;
    private String rtmpPullUrl;
    private String name;
    private String pushUrl;
    private Date wsTime;
    private Date ctime;
    private String cid;

    public String getHttpPullUrl() {
        return httpPullUrl;
    }

    public void setHttpPullUrl(String httpPullUrl) {
        this.httpPullUrl = httpPullUrl;
    }

    public String getHlsPullUrl() {
        return hlsPullUrl;
    }

    public void setHlsPullUrl(String hlsPullUrl) {
        this.hlsPullUrl = hlsPullUrl;
    }

    public String getRtmpPullUrl() {
        return rtmpPullUrl;
    }

    public void setRtmpPullUrl(String rtmpPullUrl) {
        this.rtmpPullUrl = rtmpPullUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    public Date getWsTime() {
        return wsTime;
    }

    public void setWsTime(Date wsTime) {
        this.wsTime = wsTime;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}

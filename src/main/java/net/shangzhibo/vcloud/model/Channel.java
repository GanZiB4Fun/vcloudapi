package net.shangzhibo.vcloud.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xiaoming(a)wallaw.cn on 16/8/27.
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Channel implements Serializable {

    /**
     * 直播间类型：会议直播
     */
    public static final String LIVR_TYPE_CHANNEL = "CHANNEL";
    /**
     * 直播间类型：路演直播
     */
    public static final String LIVR_TYPE_ROADSHOW = "ROADSHOW";

    private Integer channelId;
    private Integer videoId;
    private String cid; //频道ID，32位字符串
    private Date ctime;//创建频道的时间戳
    private String name; //频道名称
    private int status;  //频道状态（0：空闲； 1：直播； 2：禁用； 3：直播录制）
    private int type;  //频道类型 ( 0 : rtmp, 1 : hls, 2 : http)
    private String liveType;//直播类型 CHANNEL -会议直播 ROADSHOW-路演直播
    private long uid;   //用户ID
    private int needRecord;   //1-开启录制； 0-关闭录制
    private int format;  //1-flv； 0-mp4 录制格式

    private int duration;  //录制切片时长(分钟)，默认120分钟
    private String filename;  //录制后文件名
    private String httpPullUrl;  //http拉流地址
    private String hlsPullUrl;   //hls拉流地址
    private String rtmpPullUrl;   //rtmp拉流地址
    private String pushUrl;     //推流地址
    private Date wsTime;

    private java.lang.String coverImg; //封面图地址
    private java.lang.String tag; //频道标签
    private java.lang.Integer sort; //排序
    private java.lang.Integer userId; //直播用户
    private java.lang.Integer trailers; //是否预告
    private java.lang.Integer commentSum; //评论数量
    private Long income; //收入
    private java.util.Date updateTime; //更新时间
    private java.lang.Integer updateEmployee; //更新管理员
    private String description;//简介
    private String anchor;//主播
    private Integer hits;//
    private String onlineUser;


    private String category;//栏目
    private String url;
    private String obsPush;//是否OBS推流 YES NO 默认为NO


    public String getObsPush() {
        return obsPush;
    }

    public void setObsPush(String obsPush) {
        this.obsPush = obsPush;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public int getNeedRecord() {
        return needRecord;
    }

    public void setNeedRecord(int needRecord) {
        this.needRecord = needRecord;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOnlineUser() {
        return onlineUser;
    }

    public void setOnlineUser(String onlineUser) {
        this.onlineUser = onlineUser;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLiveType() {
        return liveType;
    }

    public void setLiveType(String liveType) {
        this.liveType = liveType;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
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

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTrailers() {
        return trailers;
    }

    public void setTrailers(Integer trailers) {
        this.trailers = trailers;
    }

    public Integer getCommentSum() {
        return commentSum;
    }

    public void setCommentSum(Integer commentSum) {
        this.commentSum = commentSum;
    }

    public Long getIncome() {
        return income;
    }

    public void setIncome(Long income) {
        this.income = income;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateEmployee() {
        return updateEmployee;
    }

    public void setUpdateEmployee(Integer updateEmployee) {
        this.updateEmployee = updateEmployee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }
}

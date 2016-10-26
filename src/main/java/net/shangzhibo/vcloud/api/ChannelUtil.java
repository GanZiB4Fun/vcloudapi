package net.shangzhibo.vcloud.api;

import net.sf.json.JSONObject;
import net.shangzhibo.vcloud.model.Channel;
import net.shangzhibo.vcloud.model.ChannelList;
import net.shangzhibo.vcloud.model.ResultCreateChannel;
import net.shangzhibo.vcloud.util.CheckSumBuilder;
import net.shangzhibo.vcloud.util.Config;
import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaoming(a)wallaw.cn on 16/8/27.
 * 频道管理工具类
 */
public class ChannelUtil {

    /**
     * 创建一个直播频道
     * POST https://vcloud.163.com/app/channel/create HTTP/1.1
     * Content-Type: application/json;charset=utf-8
     *
     * @param name 频道名称 （最大长度64个字符，只支持中文、字母、数字和下划线） 必须
     */
    public static ResultCreateChannel createChannel(String name) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(Config.CHANNEL_CREATE);
        String nonce = "1";
        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(Config.APP_SECRET, nonce, curTime);

        // 设置请求的header
        httpPost.addHeader("AppKey", Config.APP_KEY);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"name\":\"" + name + "\", \"type\":0}", Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        String jsonStr = EntityUtils.toString(response.getEntity(), "utf-8");

        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        ResultCreateChannel resultCreateChannel = (ResultCreateChannel) JSONObject.toBean(jsonObject, ResultCreateChannel.class);
        return resultCreateChannel;
    }

    /**
     * 修改直播频道信息
     * POST https://vcloud.163.com/app/channel/update HTTP/1.1
     * Content-Type: application/json;charset=utf-8
     *
     * @param name 频道名（最大长度64个字符）
     * @param cid  频道ID，32位字符串
     * @param type 频道类型 ( 0 : rtmp)
     * @return
     */
    public static ResultCreateChannel updateChannel(String name, String cid, int type) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(Config.CHANNEL_UPDATE);
        String nonce = "1";
        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(Config.APP_SECRET, nonce, curTime);

        // 设置请求的header
        httpPost.addHeader("AppKey", Config.APP_KEY);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"name\":\"" + name + "\",\"cid\":\"" + cid + "\", \"type\":0}", Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        String jsonStr = EntityUtils.toString(response.getEntity(), "utf-8");

        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        ResultCreateChannel resultCreateChannel = (ResultCreateChannel) JSONObject.toBean(jsonObject, ResultCreateChannel.class);
        return resultCreateChannel;
    }

    /**
     * 删除一个直播频道
     * POST https://vcloud.163.com/app/channel/delete HTTP/1.1
     * Content-Type: application/json;charset=utf-8
     *
     * @param cid 频道ID，32位字符串
     * @return
     */
    public static ResultCreateChannel deleteChannel(String cid) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(Config.CHANNEL_DELETE);
        String nonce = "1";
        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(Config.APP_SECRET, nonce, curTime);

        // 设置请求的header
        httpPost.addHeader("AppKey", Config.APP_KEY);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\"" + cid + "\"}", Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        String jsonStr = EntityUtils.toString(response.getEntity(), "utf-8");

        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        ResultCreateChannel resultCreateChannel = (ResultCreateChannel) JSONObject.toBean(jsonObject, ResultCreateChannel.class);
        return resultCreateChannel;
    }

    /**
     * 获取一个直播频道的信息
     * POST https://vcloud.163.com/app/channelstats HTTP/1.1
     * Content-Type: application/json;charset=utf-8
     *
     * @param cid 频道ID，32位字符串
     * @return
     */
    public static ResultCreateChannel chanelStats(String cid) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(Config.CHANNEL_STATS);
        String nonce = "1";
        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(Config.APP_SECRET, nonce, curTime);

        // 设置请求的header
        httpPost.addHeader("AppKey", Config.APP_KEY);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\"" + cid + "\"}", Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        String jsonStr = EntityUtils.toString(response.getEntity(), "utf-8");

        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        ResultCreateChannel resultCreateChannel = (ResultCreateChannel) JSONObject.toBean(jsonObject, ResultCreateChannel.class);
        return resultCreateChannel;
    }

    /**
     * 获取用户直播频道列表
     * POST https://vcloud.163.com/app/channellist HTTP/1.1
     * Content-Type: application/json;charset=utf-8
     *
     * @param records 单页记录数，默认值为10
     * @param pnum    要取第几页，默认值为1
     * @param ofield  排序的域，支持的排序域为：ctime（默认）
     * @param sort    升序还是降序，1升序，0降序，默认为desc
     * @return
     */
    public static ChannelList channelLst(int records, int pnum, String ofield, int sort) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(Config.CHANNEL_LIST);
        String nonce = "1";
        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(Config.APP_SECRET, nonce, curTime);

        // 设置请求的header
        httpPost.addHeader("AppKey", Config.APP_KEY);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"records\":" + records + ",\"pnum\":" + pnum + ",\"ofield\":\"" + ofield + "\",\"sort\":" + sort + "}", Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        String jsonStr = EntityUtils.toString(response.getEntity(), "utf-8");

        Map<String, Class> classMap = new HashMap<>();
        classMap.put("list", Channel.class);

        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        ChannelList channelList = (ChannelList) JSONObject.toBean(jsonObject, ChannelList.class, classMap);
        return channelList;
    }

    /**
     * 用户创建频道时获取的推流地址失效时，重新获取推流地址。
     * POST https://vcloud.163.com/app/address HTTP/1.1
     * Content-Type: application/json;charset=utf-8
     *
     * @param cid 频道ID，32位字符串
     * @return
     */
    public static ResultCreateChannel chanelAddress(String cid) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(Config.CHANNEL_ADDRESS);
        String nonce = "1";
        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(Config.APP_SECRET, nonce, curTime);

        // 设置请求的header
        httpPost.addHeader("AppKey", Config.APP_KEY);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\"" + cid + "\"}", Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        String jsonStr = EntityUtils.toString(response.getEntity(), "utf-8");

        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        ResultCreateChannel resultCreateChannel = (ResultCreateChannel) JSONObject.toBean(jsonObject, ResultCreateChannel.class);
        return resultCreateChannel;
    }


    /**
     * 设置频道为录制状态，用户推流时，即可录制为视频文件。
     * POST https://vcloud.163.com/app/channel/setAlwaysRecord HTTP/1.1
     * Content-Type: application/json;charset=utf-8
     *
     * @param cid        频道ID，32位字符串
     * @param needRecord 1-开启录制； 0-关闭录制
     * @param format     1-flv； 0-mp4
     * @param duration   录制切片时长(分钟)，5~120分钟
     * @param filename   录制后文件名（只支持中文、字母和数字），格式为filename_YYYYMMDD-HHmmssYYYYMMDD-HHmmss,
     *                   文件名录制起始时间（年月日时分秒) -录制结束时间（年月日时分秒)
     * @return
     */
    public static ResultCreateChannel setAlwaysRecord(String cid, int needRecord, int format, long duration, String filename) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(Config.CHANNEL_SETALWAYSRECORD);
        String nonce = "1";
        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(Config.APP_SECRET, nonce, curTime);

        // 设置请求的header
        httpPost.addHeader("AppKey", Config.APP_KEY);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\"" + cid + "\",\"needRecord\":" + needRecord + ",\"format\":" + format + ",\"duration\":" + duration + ",\"filename\":\"" + filename + "\"}", Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        String jsonStr = EntityUtils.toString(response.getEntity(), "utf-8");

        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        ResultCreateChannel resultCreateChannel = (ResultCreateChannel) JSONObject.toBean(jsonObject, ResultCreateChannel.class);
        return resultCreateChannel;
    }

    /**
     * 禁用用户正在直播的频道。
     * POST https://vcloud.163.com/app/channel/pause HTTP/1.1
     * Content-Type: application/json;charset=utf-8
     *
     * @param cid 频道ID，32位字符串
     * @return
     */
    public static ResultCreateChannel pauseChannel(String cid) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(Config.CHANNEL_PAUSE);
        String nonce = "1";
        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(Config.APP_SECRET, nonce, curTime);

        // 设置请求的header
        httpPost.addHeader("AppKey", Config.APP_KEY);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\"" + cid + "\"}", Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        String jsonStr = EntityUtils.toString(response.getEntity(), "utf-8");

        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        ResultCreateChannel resultCreateChannel = (ResultCreateChannel) JSONObject.toBean(jsonObject, ResultCreateChannel.class);
        return resultCreateChannel;
    }

    /**
     * 恢复被禁用的频道。
     * POST https://vcloud.163.com/app/channel/resume HTTP/1.1
     * Content-Type: application/json;charset=utf-8
     *
     * @param cid 频道ID，32位字符串
     * @return
     */
    public static ResultCreateChannel resumeChannel(String cid) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(Config.CHANNEL_RESUME);
        String nonce = "1";
        String curTime = String.valueOf((new Date()).getTime() / 1000L);
        String checkSum = CheckSumBuilder.getCheckSum(Config.APP_SECRET, nonce, curTime);

        // 设置请求的header
        httpPost.addHeader("AppKey", Config.APP_KEY);
        httpPost.addHeader("Nonce", nonce);
        httpPost.addHeader("CurTime", curTime);
        httpPost.addHeader("CheckSum", checkSum);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");

        // 设置请求的参数
        StringEntity params = new StringEntity("{\"cid\":\"" + cid + "\"}", Consts.UTF_8);
        httpPost.setEntity(params);

        // 执行请求
        HttpResponse response = httpClient.execute(httpPost);

        // 打印执行结果
        String jsonStr = EntityUtils.toString(response.getEntity(), "utf-8");

        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        ResultCreateChannel resultCreateChannel = (ResultCreateChannel) JSONObject.toBean(jsonObject, ResultCreateChannel.class);
        return resultCreateChannel;
    }



}

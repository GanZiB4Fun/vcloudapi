package net.shangzhibo.vcloud.api;

import net.shangzhibo.vcloud.model.ResultCreateChannel;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by xiaoming(a)wallaw.cn on 16/8/27.
 */
public class ChannelUtilTest {

    @Test
    public void testCreateChannel() throws Exception {
        ChannelUtil channelUtil = new ChannelUtil();
        channelUtil.createChannel("testtest1245");
    }

    @Test
    public void testUpdateChannel() throws Exception {
        ChannelUtil channelUtil = new ChannelUtil();
        channelUtil.updateChannel("接口测试一下","1638a0aa6b0c4b4aa76a69e8fe9ed04f",0);
    }

    @Test
    public void testDeleteChannel() throws Exception {
        ChannelUtil channelUtil = new ChannelUtil();
        channelUtil.deleteChannel("1638a0aa6b0c4b4aa76a69e8fe9ed04f");
    }

    /**
     * 获取一个直播频道的信息
     * @throws Exception
     */
    @Test
    public void testChanelStats() throws Exception {
        ChannelUtil channelUtil = new ChannelUtil();
        ResultCreateChannel resultCreateChannel = channelUtil.chanelStats("5096be091ffb421ea3baff2d2d34ec1b");
        assertEquals("132",resultCreateChannel.getRet().getName());
    }

    @Test
    public void testChannelLst() throws Exception {
        ChannelUtil channelUtil = new ChannelUtil();
        channelUtil.channelLst(10,1,"ctime",0);
    }

    @Test
    public void testChanelAddress() throws Exception {
        ChannelUtil channelUtil = new ChannelUtil();
        channelUtil.chanelAddress("48eab373106849f595229fef3945d4f6");
    }

    /**
     * 测试设置录制状态
     * @throws Exception
     */
    @Test
    public void testSetAlwaysRecord() throws Exception {
        ChannelUtil channelUtil = new ChannelUtil();
        channelUtil.setAlwaysRecord("48eab373106849f595229fef3945d4f6",0,0,60,"testfilename");
    }

    /**
     * 测试禁用频道
     * @throws Exception
     */
    @Test
    public void testPauseChannel() throws Exception {
        ChannelUtil channelUtil = new ChannelUtil();
        channelUtil.pauseChannel("48eab373106849f595229fef3945d4f6");
    }

    /**
     * 测试恢复被禁用的频道
     * @throws Exception
     */
    @Test
    public void testResumeChannel() throws Exception {
        ChannelUtil channelUtil = new ChannelUtil();
        channelUtil.resumeChannel("48eab373106849f595229fef3945d4f6");
    }
}
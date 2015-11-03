package com.ysy.ysy_festival_sms.bean;

/**
 * User: ysy
 * Date: 2015/11/3
 * Time: 8:35
 */
public class Msg {
    private int msgId;
    private int festivalId;
    private String content;

    public Msg(int festivalId, int msgId, String content) {
        this.content = content;
        this.festivalId = festivalId;
        this.msgId = msgId;
    }

    public String getContent() {
        return content;
    }

    public int getFestivalId() {
        return festivalId;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFestivalId(int festivalId) {
        this.festivalId = festivalId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }
}

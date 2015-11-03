package com.ysy.ysy_festival_sms.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeshiyuan on 2015/10/28.
 */
public class FestivalLab {
    private static FestivalLab mInstance;

    private List<Festival> mFestivals = new ArrayList<Festival>();
    private List<Msg> mMsgs = new ArrayList<Msg>();

    private FestivalLab() {
        mFestivals.add(new Festival(1, "国庆节"));
        mFestivals.add(new Festival(2, "中秋节"));
        mFestivals.add(new Festival(3, "元旦"));
        mFestivals.add(new Festival(4, "春节"));
        mFestivals.add(new Festival(5, "端午节"));
        mFestivals.add(new Festival(6, "七夕"));
        mFestivals.add(new Festival(7, "圣诞节"));
        mFestivals.add(new Festival(8, "儿童节"));

        mMsgs.add(new Msg(1, 1, "11TODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODO"));
        mMsgs.add(new Msg(1, 2, "22TODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODO"));
        mMsgs.add(new Msg(1, 3, "33TODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODO"));
        mMsgs.add(new Msg(2, 4, "44TODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODO"));
        mMsgs.add(new Msg(3, 5, "55TODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODO"));
        mMsgs.add(new Msg(4, 6, "66TODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODO"));
        mMsgs.add(new Msg(5, 7, "77TODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODO"));
        mMsgs.add(new Msg(6, 8, "88TODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODO"));
        mMsgs.add(new Msg(7, 9, "99TODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODO"));
        mMsgs.add(new Msg(8, 10, "10TODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODOTODO"));
    }

    public List<Msg> getMsgByFestivalId(int festivalId) {
        List<Msg> msgs = new ArrayList<>();
        for (Msg msg : mMsgs) {
            if (msg.getFestivalId() == festivalId) {
                msgs.add(msg);
            }
        }
        return msgs;
    }

    public Msg getMsgbyId(int msgId) {
        for (Msg msg : mMsgs) {
            if (msg.getMsgId() == msgId) {
                return msg;
            }
        }
        return null;
    }

    public List<Festival> getFestivals() {
        return new ArrayList<>(mFestivals);
    }

    public Festival getFestivalById(int fesId) {
        for (Festival festival : mFestivals) {
            if (festival.getId() == fesId) {
                return festival;
            }
        }
        return null;
    }

    public static FestivalLab getInstance() {
        if (mInstance == null) {
            synchronized (Festival.class) {
                if (mInstance == null) {
                    mInstance = new FestivalLab();
                }
            }
        }
        return mInstance;
    }
}

package com.ysy.ysy_festival_sms.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by yeshiyuan on 2015/10/28.
 */
public class FestivalLab {
    private static FestivalLab mInstance;

    private List<Festival> mFestivals = new ArrayList<Festival>();

    private FestivalLab() {
        mFestivals.add(new Festival(1, "国庆节"));
        mFestivals.add(new Festival(2, "中秋节"));
        mFestivals.add(new Festival(3, "元旦"));
        mFestivals.add(new Festival(4, "春节"));
        mFestivals.add(new Festival(5, "端午节"));
        mFestivals.add(new Festival(6, "七夕"));
        mFestivals.add(new Festival(7, "圣诞节"));
        mFestivals.add(new Festival(8, "儿童节"));
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

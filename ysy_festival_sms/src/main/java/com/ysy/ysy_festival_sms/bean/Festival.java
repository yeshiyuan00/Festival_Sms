package com.ysy.ysy_festival_sms.bean;

/**
 * Created by yeshiyuan on 2015/10/28.
 */
public class Festival {
    private int id;
    private String name;

    public Festival(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

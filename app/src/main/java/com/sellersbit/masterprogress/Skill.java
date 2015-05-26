package com.sellersbit.masterprogress;

import android.util.Log;

/**
 * Created by moreyd_2 on 5/11/2015.
 */
public class Skill {
    private final static String TAG = "Skill";

    private String title;
    private int overallTime;

    public void addTime(int time){
        overallTime += time;
        Log.d(TAG, "Added " + time + " to " + title + "." + " New total: " + overallTime);
    }

    public Skill(String title) {
        this.title = title;
        overallTime = 0;
    }

    public int getOverallTime() {
        return overallTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

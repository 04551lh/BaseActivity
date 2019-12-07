package com.adasplus.lib_common.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;

import java.util.Stack;

/**
 * Created by dell on 2019/11/18 16:03
 * Description:
 * Emain: 1187278976@qq.com
 */
public class ActivityManagerUtil {

    private static Stack<Activity> mStack;
    private static ActivityManagerUtil instance;
    private ActivityManagerUtil(){}

    public static ActivityManagerUtil getInstance(){
        if(instance == null) instance = new ActivityManagerUtil();
        return instance;
    }

    public void addActivity(Activity activity){
        if(mStack == null) mStack = new Stack<Activity>();
        mStack.add(activity);
    }

    public Activity currentActivity(){
        Activity activity = mStack.lastElement();
        return activity;
    }

    public void finishActivity(){
        Activity activity = mStack.lastElement();
        if(activity != null){
            activity.finish();
            activity = null;
        }
    }

    public void finishActivity(Activity activity){
        if(activity != null){
            mStack.remove(activity);
            activity.finish();
            activity = null;
        }
    }

    public void finishActivity(Class<?> cls){
        for (Activity activity : mStack) {
            if(activity.getClass().equals(cls))
                finishActivity(activity);
        }
    }

    public void finishAllActivity(){
        for (int i = 0; i < mStack.size() ; i++) {
            if(mStack.get(i) != null) mStack.get(i).finish();
        }
        mStack.clear();
    }

    public void AppExit(Context context){
        finishAllActivity();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        activityManager.restartPackage(context.getPackageName());
        System.exit(0);
    }
}

package com.adasplus.lib_common.base;

import android.app.Application;

/**
 * Created by dell on 2019/12/4 20:46
 * Description:
 * Emain: 1187278976@qq.com
 */
public class BaseApp extends Application {
    private static Application mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
//        WifiHelper.getInstance().init(this);
    }

    public static Application getInstance(){
        if (mApplication == null){
            mApplication = new Application();
        }
        return mApplication;
    }
}

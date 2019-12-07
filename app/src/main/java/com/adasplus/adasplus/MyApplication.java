package com.adasplus.adasplus;

import com.adasplus.lib_common.base.BaseApp;
import com.adasplus.lib_common.utils.CrashHandler;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by dell on 2019/12/5 14:49
 * Description:
 * Emain: 1187278976@qq.com
 */
public class MyApplication extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
        CrashHandler.getInstance(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        ARouter.getInstance().destroy();
    }
}

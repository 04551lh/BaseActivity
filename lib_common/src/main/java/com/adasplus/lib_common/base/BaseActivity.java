package com.adasplus.lib_common.base;

import android.os.Bundle;

import com.adasplus.lib_common.utils.ActivityManagerUtil;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by dell on 2019/11/18 15:35
 * Description:
 * Emain: 1187278976@qq.com
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        ActivityManagerUtil.getInstance().addActivity(this);
        initViews();
        setListener();
    }

    public abstract int getLayoutResId();

    public abstract void initViews();

    public abstract void setListener();

}

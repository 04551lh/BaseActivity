package com.adasplus.adasplus.activity;

import android.content.Intent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.adasplus.adasplus.R;
import com.adasplus.lib_common.base.BaseActivity;

/**
 * Created by dell on 2019/12/5 14:42
 * Description:
 * Emain: 1187278976@qq.com
 */
public class SplashActivity extends BaseActivity {

    //开屏页图片
    ImageView iv_splash;
    //淡入动画
    AlphaAnimation alphaAnim;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_splash;
    }

    @Override
    public void initViews() {
        iv_splash = findViewById(R.id.iv_splash);
    }

    @Override
    public void setListener() {

    }

    private void initAnimation() {
        //淡入动画
        alphaAnim = new AlphaAnimation(0f, 1f);
        //设置动画时间
        alphaAnim.setDuration(3000);
        //设置动画播放结束后的监听
        alphaAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation arg0) {
            }

            @Override
            public void onAnimationRepeat(Animation arg0) {
            }

            @Override
            public void onAnimationEnd(Animation arg0) {
                //跳转到主页
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                //开启
                startActivity(intent);
                //关闭开屏页
                finish();
            }
        });
        //开启动画
        iv_splash.startAnimation(alphaAnim);
    }

    /**
     * 当前页是否已获得焦点
     *
     * @param hasFocus true代表获得焦点，false相反
     */

    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            initAnimation();
        }
    }
}

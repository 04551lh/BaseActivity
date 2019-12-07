package com.adasplus.lib_common.base;

/**
 * Created by dell on 2019/12/5 10:54
 * Description:
 * Emain: 1187278976@qq.com
 */
public interface BaseView {
    /**
     * 显示加载中
     */
    void showLoading();

    /**
     * 隐藏加载
     */
    void hideLoading();

    /**
     * 数据获取失败
     * @param throwable
     */
    void onError(Throwable throwable);

//    /**
//     * 绑定Android生命周期 防止RxJava内存泄漏
//     *
//     * @param <T>
//     * @return
//     */
//    <T> AutoDisposeConverter<T> bindAutoDispose();
}

package com.adasplus.lib_common.base;

/**
 * Created by dell on 2019/12/4 20:32
 * Description:
 * Emain: 1187278976@qq.com
 */
public class BaseResponse<T> {
    private int StatusCode;
    private T Result;

    public int getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(int statuesCode) {
        StatusCode = statuesCode;
    }

    public T getResult() {
        return Result;
    }

    public void setResult(T result) {
        Result = result;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "StatusCode=" + StatusCode +
                ", Result=" + Result +
                '}';
    }
}

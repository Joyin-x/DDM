package com.joyin.demo.Public.Base;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author wwx
 * @date 2019/4/18 11:22
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse<T> {
    private int code;
    private String msg;
    private T data;

    public BaseResponse() {
        this.code = ResponseCode.FAILURE.getCode();
        this.msg = ResponseCode.FAILURE.getMsg();
    }

    public BaseResponse(ResponseCode status, String msg) {
        this.code = status.getCode();
        this.msg = msg;
    }
    public void setStatus(ResponseCode status) {
        this.code = status.getCode();
        this.msg = status.getMsg();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

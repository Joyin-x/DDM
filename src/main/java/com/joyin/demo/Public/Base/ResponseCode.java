package com.joyin.demo.Public.Base;

/**
 * @author wwx
 * @date 2019/4/18 11:23
 **/
public enum ResponseCode {

    SUCCESS(200, "成功"),
    FAILURE(420, "失败"),
    UNAUTHORIZED(401, "请先登录"),
    TOKEN_EXPIRE(403, "token过期"),
    NOT_FOUND(404, "请求不存在"),
    NOT_ACCEPTABLE(406, "不接受的请求"),
    ERROR(500, "请求出错");

    private int code;
    private String msg;

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

    ResponseCode(int code, String msg) {
        this.code=code;
        this.msg=msg;
    }
}

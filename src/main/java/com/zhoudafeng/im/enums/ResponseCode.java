package com.zhoudafeng.im.enums;

public enum ResponseCode {
    SUCCESS(true,"200","操作成功"),
    FAIL(false,"-1","操作失败");

    public final boolean success;
    public final String code;
    public final String msg;

    ResponseCode(boolean success,String code,String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
    }

    public boolean getSuccess() {
        return success;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

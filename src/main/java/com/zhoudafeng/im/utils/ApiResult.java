package com.zhoudafeng.im.utils;

import com.zhoudafeng.im.enums.ResponseCode;

import java.util.HashMap;
import java.util.Map;

public class ApiResult<T> {
    private boolean success;
    private String code;
    private String message;
    private Map<String,Object> data = new HashMap<>();

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public static ApiResult requestSuccess(){
        ApiResult apiResult = new ApiResult();
        apiResult.setSuccess(ResponseCode.SUCCESS.success);
        apiResult.setCode(ResponseCode.SUCCESS.code);
        apiResult.setMessage(ResponseCode.SUCCESS.msg);
        return apiResult;
    }
    public static ApiResult requestFail(){
        ApiResult apiResult = new ApiResult();
        apiResult.setSuccess(ResponseCode.FAIL.success);
        apiResult.setCode(ResponseCode.FAIL.code);
        apiResult.setMessage(ResponseCode.FAIL.msg);
        return apiResult;
    }

    public static ApiResult setResult(ResponseCode responseCode){
        ApiResult r = new ApiResult();
        r.setSuccess(responseCode.getSuccess());
        r.setCode(responseCode.getCode());
        r.setMessage(responseCode.getMsg());
        return r;
    }

    public ApiResult success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public ApiResult message(String message){
        this.setMessage(message);
        return this;
    }

    public ApiResult code(String code){
        this.setCode(code);
        return this;
    }
    public ApiResult data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public ApiResult data(Map<String, Object> map){
        this.setData(map);
        return this;
    }

    @Override
    public String toString() {
        return "ApiResult{" +
                "success=" + success +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

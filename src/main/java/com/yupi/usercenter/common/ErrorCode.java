package com.yupi.usercenter.common;

public enum ErrorCode {

    SUCCESS(0,"ok",""),
    PARAMS_ERROR(40001,"请求参数异常",""),
    NULL_ERROR(40000,"请求数据为空",""),
    NOT_LOGIN(40100,"登录异常",""),
    NOT_LOGOUT(40200,"登出异常",""),
    NO_AUTH(40101,"无权限",""),
    NO_CURRENTUSER(400200,"没有当前用户111",""),
    SYSTEM_ERROR(50000,"系统异常",""),
    ;

    /**
     * 状态码
     */
    private int code;

    /**
     * 状态码信息
     */
    private String message;

    /**
     * 状态码描述（详情）
     */
    private String  description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    ErrorCode(int code, String message) {
        this(code,message,"");
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}

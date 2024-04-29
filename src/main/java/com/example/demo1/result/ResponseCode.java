package com.example.demo1.result;

public enum ResponseCode {
    SUCCESS("0","SUCCESS"),
    FAILED("501","SYSTEM ERROR"),
    SQLEXCEPTION("101","sql is wrong"),
    LOGINFAILED("201","the username or password wrong");
    private String code;
    private String msg;

    ResponseCode(String code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

package com.wymx.autopushmessage.dva.entity;

public enum ConstantResult {

    SUCCESS("0", "Success"),

    DBFAIL("100001", "inert into Db failed");

    private final String resultCode;

    private final String resultDesc;

    public String getResultCode() {
        return resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    ConstantResult(String resultCode, String resultDesc) {
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
    }
}

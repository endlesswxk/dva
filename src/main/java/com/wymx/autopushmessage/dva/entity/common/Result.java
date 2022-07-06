package com.wymx.autopushmessage.dva.entity.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Result {

    /**
     * 结果码
     */
    private String resultCode;

    /**
     * 结果描述
     */
    private String resultDesc;
}

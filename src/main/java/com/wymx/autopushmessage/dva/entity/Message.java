package com.wymx.autopushmessage.dva.entity;


import com.wymx.autopushmessage.dva.entity.common.Result;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Message {

    /**
     * 消息ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long messageId;

    /**
     * 消息标题
     */
    private String messageTitle;

    /**
     * 消息连结
     */
    private String messageLink;

    /**
     * 消息时间 精确到分钟
     */
    private String messageDatetime;

    /**
     * 当前时间段 51 条数据中的顺序
     */
    private String messageIndex;
}

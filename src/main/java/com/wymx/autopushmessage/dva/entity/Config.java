package com.wymx.autopushmessage.dva.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Config {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer configId;

    /**
     * 配置名称
     */
    @Column(unique=true)
    private String configName;

    /**
     * 配置值
     */
    private String configValue;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 配置描述
     */
    private String description;
}

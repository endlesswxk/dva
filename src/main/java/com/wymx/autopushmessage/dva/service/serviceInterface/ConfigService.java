package com.wymx.autopushmessage.dva.service.serviceInterface;

import com.wymx.autopushmessage.dva.entity.Config;
import com.wymx.autopushmessage.dva.entity.common.Result;

public interface ConfigService {

    /**
     * 获取数据库配置值
     *
     * @param config
     * @return Result
     */
    Config findByConfigName(Config config);

    /**
     * 获取数据库配置值
     *
     * @param config
     * @return Result
     */
    Result setConfigInfo(Config config);
}

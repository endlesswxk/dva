package com.wymx.autopushmessage.dva.service.serviceImpl;

import com.wymx.autopushmessage.dva.entity.Config;
import com.wymx.autopushmessage.dva.entity.ConstantResult;
import com.wymx.autopushmessage.dva.entity.common.Result;
import com.wymx.autopushmessage.dva.responsitory.ConfigRepository;
import com.wymx.autopushmessage.dva.service.serviceInterface.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceImpl implements ConfigService {

    @Autowired
    private ConfigRepository configRepository;

    @Override
    public Config findByConfigName(Config config) {
        return configRepository.findByConfigName(config.getConfigName());
    }

    @Override
    public Result setConfigInfo(Config config) {
        Config configResult = configRepository.save(config);

        Result result = new Result();
        if (configResult.getConfigId() != null) {
            result.setResultCode(ConstantResult.SUCCESS.getResultCode());
            result.setResultDesc(ConstantResult.SUCCESS.getResultDesc());
        } else {
            result.setResultCode(ConstantResult.DBFAIL.getResultCode());
            result.setResultDesc(ConstantResult.DBFAIL.getResultDesc());
        }
        return result;
    }
}

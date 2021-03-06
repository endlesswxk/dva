package com.wymx.autopushmessage.dva.responsitory;

import com.wymx.autopushmessage.dva.entity.Config;
import com.wymx.autopushmessage.dva.entity.common.Result;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ConfigRepository extends CrudRepository<Config, Result> {

    public Config findByConfigName(String configName);

    @Transactional
    public Integer deleteByConfigName(String configName);
}

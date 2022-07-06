package com.wymx.autopushmessage.dva.responsitory;

import com.wymx.autopushmessage.dva.entity.Message;
import com.wymx.autopushmessage.dva.entity.common.Result;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Result> {
}
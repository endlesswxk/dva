package com.wymx.autopushmessage.dva.service.serviceInterface;

import com.wymx.autopushmessage.dva.entity.Message;
import com.wymx.autopushmessage.dva.entity.common.Result;

public interface MessageService {

    /**
     * addMessage
     *
     * @param message
     * @return Result
     */
    Result addMessage(Message message);
}

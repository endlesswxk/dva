package com.wymx.autopushmessage.dva.service.serviceImpl;

import com.wymx.autopushmessage.dva.entity.ConstantResult;
import com.wymx.autopushmessage.dva.entity.Message;
import com.wymx.autopushmessage.dva.entity.common.Result;
import com.wymx.autopushmessage.dva.responsitory.MessageRepository;
import com.wymx.autopushmessage.dva.service.serviceInterface.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public Result addMessage(Message message) {

        Message messageResult = messageRepository.save(message);

        Result result = new Result();
        if (messageResult.getMessageId() != null) {
            result.setResultCode(ConstantResult.SUCCESS.getResultCode());
            result.setResultDesc(ConstantResult.SUCCESS.getResultDesc());
        } else {
            result.setResultCode(ConstantResult.DBFAIL.getResultCode());
            result.setResultDesc(ConstantResult.DBFAIL.getResultDesc());
        }
        return result;
    }
}

package com.wymx.autopushmessage.dva;

import com.wymx.autopushmessage.dva.entity.Config;
import com.wymx.autopushmessage.dva.entity.ConstantResult;
import com.wymx.autopushmessage.dva.entity.Message;
import com.wymx.autopushmessage.dva.entity.common.Result;
import com.wymx.autopushmessage.dva.service.serviceInterface.ConfigService;
import com.wymx.autopushmessage.dva.service.serviceInterface.FileProcessService;
import com.wymx.autopushmessage.dva.service.serviceInterface.MessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import java.io.File;
import java.util.List;

@SpringBootTest
class DvaApplicationTests {

    @Autowired
    private MessageService messageService;

    @Autowired
    private FileProcessService fileProcessService;

    @Autowired
    private ConfigService configService;

    @Test
    void contextLoads() throws InterruptedException {
        StopWatch sw = new StopWatch();
        sw.start();
        Thread.sleep(2000);
        sw.stop();
        System.out.println(sw.getTotalTimeMillis());
    }

    @Test
    void JpaTest() {
        Message message = new Message();
        message.setMessageLink("xxx");
        message.setMessageTitle("testJpa");
        message.setMessageDatetime("202206120019");
        Result result =  messageService.addMessage(message);

        Assertions.assertEquals(ConstantResult.SUCCESS.getResultCode(), result.getResultCode());
    }

    @Test
    void getFileTest() {
        List<File> files = fileProcessService.getDictionaryFiles("E:\\重要\\data");
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }

    @Test
    void setConfig() {
        Config config = new Config();
        config.setConfigName("fileAddress");
        config.setConfigValue("E:\\重要\\data");
        config.setDefaultValue("/home/dva/file");
        config.setDescription("文件存放地址");
        Result result = configService.setConfigInfo(config);
        Assertions.assertEquals(ConstantResult.SUCCESS.getResultCode(), result.getResultCode());
    }

    @Test
    void getConfig() {
        Config config = new Config();
        config.setConfigName("fileAddress");
        Config result = configService.findByConfigName(config);
        System.out.println(result);
        Assertions.assertNotNull(result);
    }


}

package com.wymx.autopushmessage.dva.controller;

import com.wymx.autopushmessage.dva.entity.request.SaveOldDataRequest;
import com.wymx.autopushmessage.dva.entity.response.SaveOldDataResponse;
import com.wymx.autopushmessage.dva.service.serviceInterface.FileProcessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/data")
public class DataProcessController {

    @Autowired
    private static  final Logger logger = LoggerFactory.getLogger(DataProcessController.class);

    @Resource
    private FileProcessService fileProcessService;


    @RequestMapping(value = "/saveOldData", method = RequestMethod.POST)
    public SaveOldDataResponse saveOldData(@RequestBody SaveOldDataRequest saveOldDataRequest) {
        return fileProcessService.saveOldData(saveOldDataRequest);
    }

    @RequestMapping(value = "/getPathFiles", method = RequestMethod.POST)
    public List<File> saveInfo(@RequestBody String path) {
       return fileProcessService.getDictionaryFiles(path);
    }
}

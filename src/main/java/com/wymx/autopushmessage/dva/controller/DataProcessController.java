package com.wymx.autopushmessage.dva.controller;

import com.wymx.autopushmessage.dva.service.serviceInterface.FileProcessService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/data")
public class DataProcessController {

    @Autowired
    private static  final Logger logger = LoggerFactory.getLogger(DataProcessController.class);

    @Resource
    private FileProcessService fileProcessService;


//    @RequestMapping(value = "/saveInfo", method = RequestMethod.POST)
//    public Result saveInfo(HttpServletRequest request, @RequestBody SaveInfoRequest saveInfoRequest) {
//        fileProcessService.getDictionaryFiles("");
//    }

    @RequestMapping(value = "/getPathFiles", method = RequestMethod.POST)
    public List<File> saveInfo(@RequestBody String path) {
       return fileProcessService.getDictionaryFiles(path);
    }
}

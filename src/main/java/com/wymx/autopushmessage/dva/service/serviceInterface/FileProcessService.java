package com.wymx.autopushmessage.dva.service.serviceInterface;

import com.wymx.autopushmessage.dva.entity.request.SaveOldDataRequest;
import com.wymx.autopushmessage.dva.entity.response.SaveOldDataResponse;

import java.io.File;
import java.util.List;

public interface FileProcessService {
    List<File> getDictionaryFiles(String path);

    SaveOldDataResponse saveOldData(SaveOldDataRequest saveOldDataRequest);
}

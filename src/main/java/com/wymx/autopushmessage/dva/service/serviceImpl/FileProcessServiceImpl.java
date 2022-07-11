package com.wymx.autopushmessage.dva.service.serviceImpl;

import com.wymx.autopushmessage.dva.entity.request.SaveOldDataRequest;
import com.wymx.autopushmessage.dva.entity.response.SaveOldDataResponse;
import com.wymx.autopushmessage.dva.service.serviceInterface.FileProcessService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class FileProcessServiceImpl implements FileProcessService {
    @Override
    public List<File> getDictionaryFiles(String path) {
        File dictionary = new File(path);
        return Arrays.asList(Objects.requireNonNull(dictionary.listFiles()));
    }

    @Override
    public SaveOldDataResponse saveOldData(SaveOldDataRequest saveOldDataRequest) {







        return null;
    }
}

package com.eddgarvf.score.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class FileServiceImpl implements FileService {

    private static final Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

    @Override
    public String getFileContent(String filePath){
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e){
            logger.error("Cannot get the information from the File (" + filePath + "). " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}

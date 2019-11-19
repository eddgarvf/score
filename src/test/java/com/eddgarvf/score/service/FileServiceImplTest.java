package com.eddgarvf.score.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

public class FileServiceImplTest {

    private static final String FILE_PATH = "src/main/resources/files/OCC Take Home Coding names.txt";

    @Test
    public void testGetFileContent(){
        File file = new File(FILE_PATH);
        String absolutePath = file.getAbsolutePath();
        FileService fileService = new FileServiceImpl();
        String fileContent = fileService.getFileContent(absolutePath);
        assertEquals(fileContent.length(), 46447);
    }

    @Test
    public void testGetFileContentWrongFile(){
        FileService fileService = new FileServiceImpl();
        String fileContent = fileService.getFileContent("");
        assertEquals(fileContent, null);
    }
}

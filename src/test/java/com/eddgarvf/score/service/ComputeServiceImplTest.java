package com.eddgarvf.score.service;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ComputeServiceImplTest {

    @Mock
    FileService fileService;

    private ComputeService computeService;

    private static final String FILE_PATH = "/resources/files/OCC Take Home Coding names.txt";
    private static final String FILE_CONTENT = "\"MARY\",\"PATRICIA\",\"LINDA\",\"BARBARA\",\"VINCENZO\",\"SHON\",\"LYNWOOD\",\"JERE\",\"HAI\"";

    private static final int COMPUTE_RESULT = 3194;

    @BeforeAll
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        computeService = new ComputeServiceImpl(fileService);
    }

    @Test
    public void testGetComputedScore(){
        when(fileService.getFileContent(FILE_PATH)).thenReturn(FILE_CONTENT);
        assertEquals(computeService.getComputedScoreOfTheFile(FILE_PATH), COMPUTE_RESULT);
    }

    @Test
    public void testGetComputedScoreNoData(){
        when(fileService.getFileContent(FILE_PATH)).thenReturn(null);
        assertEquals(computeService.getComputedScoreOfTheFile(FILE_PATH), 0);
    }

    @Test
    public void testGetComputedScoreBadData(){
        when(fileService.getFileContent(FILE_PATH)).thenReturn("12345");
        assertEquals(computeService.getComputedScoreOfTheFile(FILE_PATH), 0);
    }
}

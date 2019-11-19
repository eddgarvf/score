package com.eddgarvf.score.service;

import com.eddgarvf.score.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComputeServiceImpl implements ComputeService {

    private static final Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);

    FileService fileService;

    public ComputeServiceImpl(FileService fileService){
        this.fileService = fileService;
    }

    @Override
    public int getComputedScoreOfTheFile(String filePath) {
        int computedScore = 0;
        String fileContent = fileService.getFileContent(filePath);
        if(null != fileContent){
            try {
                List<String> sortedList = getParsedListFromFileContent(fileContent).stream().sorted().collect(Collectors.toList());
                for (int i = 0; i < sortedList.size(); i++) {
                    computedScore += getTheSumOfNumberOfChars(sortedList.get(i)) * (i + 1);
                }
            } catch (Exception e){
                logger.error("Compute was not able to happen as expected. " + e.getMessage());
                e.printStackTrace();
            }
        }
        return computedScore;
    }

    private int getTheSumOfNumberOfChars(String name) {
        Integer sum = 0;
        List<Character> charactersList = name.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        for(Character c : charactersList){
            sum += Constant.ALPHABETH_EN.get(c);
        }
        return sum;
    }

    private List<String> getParsedListFromFileContent(String fileContent){
        return Arrays.asList(fileContent.replace("\"", "").split(","));
    }
}

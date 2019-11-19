package com.eddgarvf.score;

import com.eddgarvf.score.service.ComputeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class ScoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ScoreApplication.class, args);
		ComputeService computeService = (ComputeService) ctx.getBean("computeServiceImpl");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide the file path to be computed: ");
		String filePath = scanner.nextLine();
		System.out.println("Computed File Result: " + computeService.getComputedScoreOfTheFile(filePath));
	}
}

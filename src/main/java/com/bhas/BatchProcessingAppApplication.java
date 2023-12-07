package com.bhas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class BatchProcessingAppApplication 
{

	public static void main(String[] args)
	{
		SpringApplication.run(BatchProcessingAppApplication.class, args);
		System.out.println("\n @SpringBootConfiguration,@ComponentScan,@EnableAutoConfiguration");
	}

}

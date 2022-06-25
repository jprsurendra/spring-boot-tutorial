package com.ssr.sbtutorial;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;

@Slf4j
@SpringBootApplication
public class SpringBootTutorialApplication  implements CommandLineRunner {

	private RestTemplate restTemplate;
	private ModelMapper modelMapper;

	@Bean
	public ModelMapper modelMapper() {
		modelMapper = new ModelMapper();
		return modelMapper;
	}

	@Bean
	public RestTemplate restTemplate() {
		restTemplate = new RestTemplate();
		return restTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Inside run() method of SpringBootTutorialApplication");
	}

}

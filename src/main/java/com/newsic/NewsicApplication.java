package com.newsic;

import com.newsic.controller.SongGenerationController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = SongGenerationController.class)
public class NewsicApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(NewsicApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(NewsicApplication.class, args);
	}
}

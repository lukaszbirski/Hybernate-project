package com.example.HibernateProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
	basePackageClasses = {HibernateProjectApplication.class, Jsr310JpaConverters.class}
)

@SpringBootApplication
public class HibernateProjectApplication{

	public static void main(String[] args) {
		SpringApplication.run(HibernateProjectApplication.class, args);
	}
}

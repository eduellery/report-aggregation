package com.eduellery.reportaggregation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;

@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
public class ReportAggregationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportAggregationApplication.class, args);
	}

}

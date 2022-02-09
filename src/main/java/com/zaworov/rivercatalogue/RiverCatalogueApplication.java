package com.zaworov.rivercatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) //TODO Remove this (KAJ-13)
public class RiverCatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiverCatalogueApplication.class, args);
	}

}

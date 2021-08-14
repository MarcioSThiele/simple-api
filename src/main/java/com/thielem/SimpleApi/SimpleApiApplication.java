package com.thielem.SimpleApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableCassandraRepositories(value = "com.thielem.SimpleApi.adapters.repository")
public class SimpleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApiApplication.class, args);
	}

}

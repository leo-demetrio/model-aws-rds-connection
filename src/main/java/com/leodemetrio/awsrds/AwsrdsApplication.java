package com.leodemetrio.awsrds;

import com.leodemetrio.awsrds.domain.Person;
import com.leodemetrio.awsrds.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwsrdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsrdsApplication.class, args);
	}

}

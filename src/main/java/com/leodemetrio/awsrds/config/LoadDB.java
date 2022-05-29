package com.leodemetrio.awsrds.config;

import com.leodemetrio.awsrds.domain.Person;
import com.leodemetrio.awsrds.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class LoadDB implements CommandLineRunner {
    @Autowired
    private PersonRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Person(null, "Leo", "Dev"));
        repository.save(new Person(null, "Leo1", "Dev"));

    }
}

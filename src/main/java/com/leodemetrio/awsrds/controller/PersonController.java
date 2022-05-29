package com.leodemetrio.awsrds.controller;

import com.leodemetrio.awsrds.domain.Person;
import com.leodemetrio.awsrds.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository repository;

    @GetMapping("persons")
    public List<Person> allPerson(){
        return repository.findAll();
    }
    @GetMapping("/persons/{id}")
    public Optional<Person> findById(@PathVariable Long id){
        return repository.findById(id);
    }
}

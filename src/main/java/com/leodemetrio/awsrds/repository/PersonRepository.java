package com.leodemetrio.awsrds.repository;

import com.leodemetrio.awsrds.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

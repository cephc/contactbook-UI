package com.contactbook.democontactbook.repository;

import com.contactbook.democontactbook.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface PersonRepository extends CrudRepository<Person, Long> {

}

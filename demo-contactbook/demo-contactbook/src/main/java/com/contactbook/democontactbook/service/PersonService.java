package com.contactbook.democontactbook.service;

import com.contactbook.democontactbook.domain.Person;
import com.contactbook.democontactbook.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void createPerson(Person person) {
        personRepository.save(person);
    }

    public Iterable<Person> getAllPeople() {
        return personRepository.findAll();
    }

    public Optional<Person> getPerson(Long id) {
        return personRepository.findById(id);
    }

    public void updatePerson(Person person) {
        personRepository.save(person);
    }


    public void deletePerson(Long personId) {
        personRepository.deleteById(personId);
    }

    public void saveAll(Iterable<Person> person) {
        personRepository.saveAll(person);
    }
}


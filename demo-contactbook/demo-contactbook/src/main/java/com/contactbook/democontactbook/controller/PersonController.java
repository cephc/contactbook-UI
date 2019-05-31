package com.contactbook.democontactbook.controller;

import com.contactbook.democontactbook.domain.Person;
import com.contactbook.democontactbook.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

    @Autowired
    private PersonService personService;

    //create method

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public ResponseEntity<?> createPersonRecord(@RequestBody Person person) {
        personService.createPerson(person);
        return new ResponseEntity<>(null, HttpStatus.CREATED );
    }
    //getAllMethod

    @RequestMapping(value = "/people", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Person>> getAllPeopleRecord() {
        return new ResponseEntity<>(personService.getAllPeople(), HttpStatus.OK);
    }
    //getOnePerson method

    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Person>> getPersonRecord(@PathVariable Long id){
        return new ResponseEntity<>(personService.getPerson(id), HttpStatus.OK);
    }
    //update a person method

    @RequestMapping(value="/person/{id}", method=RequestMethod.PUT)
    public ResponseEntity<?> updatePersonRecord(@RequestBody Person person) {
        personService.updatePerson(person);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //delete a person method

    @RequestMapping(value="/person/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<?> deletePersonRecord(@PathVariable Long id) {
        personService.deletePerson(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //post an array of people method

    @RequestMapping(value = "/people", method = RequestMethod.POST)
    public ResponseEntity <Iterable<Person>> createAllPeople(@RequestBody Iterable<Person> person){
        personService.saveAll(person);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

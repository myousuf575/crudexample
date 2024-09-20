package com.mycstutor.service;

import java.util.List;

import com.mycstutor.entity.Person;
import com.mycstutor.repository.PersonRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
@ApplicationScoped
public class PersonDbService {
    @Inject
    PersonRepository personRepository;

    public List<Person> getPersonList(){
        return  personRepository.findAll().list();
       }
       
       
       public Person  addPerson(Person person){
           
        personRepository.persist(person);
           return person;
       
       }
       
       public Person updatePerson(Person person){
           
        personRepository.persist(person);
        return person;
       }
       
       
       public void deletePerson(long id){
           
        personRepository.deleteById(id);
           
         }
       
       
       
       }

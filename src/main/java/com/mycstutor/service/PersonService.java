package com.mycstutor.service;

import java.util.ArrayList;
import java.util.List;

import com.mycstutor.entity.Person;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonService{

private List<Person> personList;

    public PersonService() {
        personList=new ArrayList<>();
        Person p1=new Person(111,"John","Parker");
        personList.add(p1);
    }




public List<Person> getPersonList(){
 return personList;
}


public List<Person>  addPerson(Person person){
    System.out.println(person);
    personList.add(person);
    return personList;

}

public void updatePerson(Person person){
    
  personList.removeIf(p->p.getId()==person.getId());
  personList.add(person);
}


public void deletePerson(int id){
    
    personList.removeIf(p->p.getId()==id);
    
  }



}
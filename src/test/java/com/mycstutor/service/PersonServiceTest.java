package com.mycstutor.service;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.mycstutor.entity.Person;

public class PersonServiceTest {
	@Test
	public void deletePerson() {
		PersonService p = new PersonService();
		int id = 123;
		p.deletePerson(id);
	}

	@Test
	public void updatePerson() {
		PersonService p = new PersonService();
		Person person = new Person(123, "abc", "abc");
		p.updatePerson(person);
	}

	@Test
	public void addPerson() {
		PersonService p = new PersonService();
		Person person = new Person(123, "abc", "abc");
		List<Person> expected = new ArrayList<>();
		List<Person> actual = p.addPerson(person);

		assertEquals(expected, actual);
	}

	@Test
	public void getPersonList() {
		PersonService p = new PersonService();
		List<Person> expected = new ArrayList<>();
		List<Person> actual = p.getPersonList();

		assertEquals(expected, actual);
	}

	@Test
	public void PersonService() {
		PersonService expected = new PersonService();
		PersonService actual = new PersonService();

		assertEquals(expected, actual);
	}

}

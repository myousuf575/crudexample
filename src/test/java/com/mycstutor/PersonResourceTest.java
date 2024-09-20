package com.mycstutor;

import com.mycstutor.entity.Person;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import jakarta.ws.rs.core.Response;

public class PersonResourceTest {
	@Test
	public void getAllPerson() {
		PersonResource p = new PersonResource();
		List<Person> expected = new ArrayList<>();
		List<Person> actual = p.getAllPerson();

		assertEquals(expected, actual);
	}

	@Test
	public void addPerson() {
		PersonResource p = new PersonResource();
		Person person = new Person(123, "abc", "abc");
		Response expected = null;
		Response actual = p.addPerson(person);

		assertEquals(expected, actual);
	}
}

package com.mycstutor;

import java.util.List;

import org.jboss.resteasy.reactive.RestQuery;

import com.mycstutor.entity.Person;
import com.mycstutor.service.PersonService;

import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api")
public class PersonResource {

    @Inject
    PersonService personService;

    @GET
    @Path("/person")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAllPerson() {
        return personService.getPersonList();
    }

    @POST
    @Path("/addPerson")
    public Response addPerson(Person person){
        System.out.println(person);
        personService.addPerson(person);
        return Response.ok(person).status(200).build();
    }

    @PUT
    @Path("/updatePerson")
    public Response updatePerson(Person person){
        personService.updatePerson(person);
        return Response.ok(person).status(200).build();
    }

    @DELETE
    @Path("/deletePerson")
    public Response deletePerson(@RestQuery int id){
        personService.deletePerson(id);
        return Response.ok(id+"Id is deleted").status(200).build();
    }
}

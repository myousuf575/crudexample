package com.mycstutor;
import java.util.List;

import org.jboss.resteasy.reactive.RestQuery;

import com.mycstutor.entity.Person;
import com.mycstutor.service.PersonDbService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/db")
public class PersonResourceDb {

    @Inject
    PersonDbService personDbService;

    @GET
    @Path("/person")
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAllPerson() {
        return personDbService.getPersonList();
    }

    @POST
    @Path("/addPerson")
    @Transactional
    public Response addPerson(Person person){
        System.out.println(person);
        personDbService.addPerson(person);
        return Response.ok(person).status(200).build();
    }

    @PUT
    @Path("/updatePerson")
    @Transactional
    public Response updatePerson(Person person){
        personDbService.updatePerson(person);
        return Response.ok(person).status(200).build();
    }

    @DELETE
    @Path("/deletePerson")
    @Transactional
    public Response deletePerson(@RestQuery int id){
        personDbService.deletePerson(id);
        return Response.ok(id+"Id is deleted").status(200).build();
    }
}

package controller;

import db.MaquinariaRepository;
import model.entity.Maquinaria;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by ronnie on 18/09/16.
 */
@Path("/maquinaria")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MaquinariaController {

    MaquinariaRepository repo = new MaquinariaRepository();

    @GET
    public List<Maquinaria> getSaludo(){
        return repo.getAll();
    }

    @GET
    @Path("/{id}")
    public Maquinaria find(@PathParam("id") Integer id){
        return repo.findById(id);
    }

    @POST
    public Response save(Maquinaria maquinaria){
        repo.insertMaquinaria(maquinaria);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Integer id, Maquinaria maquinaria){
        maquinaria.setId(id);
        repo.updateMaquinaria(maquinaria);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Integer id){
        repo.deleteMaquinaria(id);
        return Response.status(Response.Status.OK).build();
    }
}
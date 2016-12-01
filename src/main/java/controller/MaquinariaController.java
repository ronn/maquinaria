package controller;

import db.MaquinariaRepository;
import io.vertx.core.json.Json;
import io.vertx.ext.web.RoutingContext;
import model.entity.Maquinaria;

import java.util.List;
import java.util.Optional;

public class MaquinariaController {

    MaquinariaRepository repo = new MaquinariaRepository();

    public void getAll(RoutingContext rc){
        List<Maquinaria> list =  repo.getAll();

        if (list.size() > 0){
            rc.response().end(Json.encodePrettily(repo.getAll()));
        }else {
            rc.response().setStatusCode(204).end();
        }
    }

    public void getById(RoutingContext rc){
        Integer id = Integer.valueOf(rc.request().getParam("id"));
        Optional<Maquinaria> m = repo.getById(id);

        if(m.isPresent()){
            rc.response().end(Json.encodePrettily(m.get()));
        }else {
            rc.response().setStatusCode(204).end();
        }
    }

    public void save(RoutingContext rc){
        Maquinaria m = Json.decodeValue(rc.getBodyAsString(), Maquinaria.class);

        eraseConditionalFields(m);

        repo.save(m);
        rc.response().setStatusCode(201).end("La maquina se guardó con éxito!");
    }

    public void update(RoutingContext rc){
        Integer id = Integer.valueOf(rc.request().getParam("id"));
        Maquinaria m = Json.decodeValue(rc.getBodyAsString(), Maquinaria.class);
        m.setId(id);

        eraseConditionalFields(m);

        repo.update(m);
        rc.response().end("La máquina se actualizó con éxito!");
    }

    private void eraseConditionalFields(Maquinaria m) {
        if ("Disponible".equals(m.getEstado())){
            m.setIdManipulador(null);
            m.setIdObra(null);
        }
    }

    public void delete(RoutingContext rc){
        Integer id = Integer.valueOf(rc.request().getParam("id"));
        repo.delete(id);
        rc.response().end("La máquina se eliminó con éxito!");
    }
}
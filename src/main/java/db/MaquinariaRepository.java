package db;

import db.dao.MaquinariaDao;
import model.entity.Maquinaria;
import org.skife.jdbi.v2.DBI;
import utiliy.Conexion;

import java.util.List;
import java.util.Optional;

/**
 * Created by ronnie on 4/10/16.
 */
public class MaquinariaRepository {

    MaquinariaDao dao;
    DBI dbi = Conexion.get();

    public Optional<Maquinaria> getById(Integer id){
        dao = dbi.onDemand(MaquinariaDao.class);
        return dao.getById(id).stream().findFirst();
    }

    public List<Maquinaria> getAll(){
        dao = dbi.onDemand(MaquinariaDao.class);
        return dao.getAll();
    }

    public int save (Maquinaria maquinaria){
        dao = dbi.onDemand(MaquinariaDao.class);
        return dao.insert(maquinaria);
    }

    public void update(Maquinaria maquinaria){
        dao = dbi.onDemand(MaquinariaDao.class);
        dao.update(maquinaria);
    }

    public void delete(Integer id){
        dao = dbi.onDemand(MaquinariaDao.class);
        dao.delete(id);
    }
}
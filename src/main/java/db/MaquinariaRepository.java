package db;

import db.dao.MaquinariaDao;
import model.entity.Maquinaria;
import org.skife.jdbi.v2.DBI;
import utiliy.Conexion;

import java.util.List;

/**
 * Created by ronnie on 4/10/16.
 */
public class MaquinariaRepository {

    MaquinariaDao dao;
    DBI dbi = Conexion.get();

    public Maquinaria findById(Integer id){
        dao = dbi.onDemand(MaquinariaDao.class);
        System.out.print(id);
        return dao.findById(id);
    }

    public List<Maquinaria> getAll(){
        dao = dbi.onDemand(MaquinariaDao.class);
        return dao.getAll();
    }

    public void insertMaquinaria (Maquinaria maquinaria){
        dao = dbi.onDemand(MaquinariaDao.class);
        System.out.print(maquinaria.getIdManipulador());
        dao.insert(maquinaria);
    }

    public void updateMaquinaria(Maquinaria maquinaria){
        dao = dbi.onDemand(MaquinariaDao.class);
        dao.update(maquinaria);
    }

    public void deleteMaquinaria(Integer id){
        dao = dbi.onDemand(MaquinariaDao.class);
        dao.delete(id);
    }
}
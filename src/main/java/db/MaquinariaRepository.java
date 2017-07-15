package db;

import db.dao.MaquinariaDao;
import model.entity.Maquinaria;
import org.skife.jdbi.v2.exceptions.UnableToExecuteStatementException;
import utility.Conexion;

import java.util.List;
import java.util.Optional;

/**
 * Created by ronnie on 4/10/16.
 */
public class MaquinariaRepository {

    private static MaquinariaDao getDao() {
        return Conexion.get().onDemand(MaquinariaDao.class);
    }

    public Optional<Maquinaria> getById(Integer id){
        return getDao().getById(id).stream().findFirst();
    }

    public List<Maquinaria> getAll(){
        return getDao().getAll();
    }

    public void save (Maquinaria maquinaria) throws UnableToExecuteStatementException {
        getDao().insert(maquinaria);
    }

    public void update(Maquinaria maquinaria){
        getDao().update(maquinaria);
    }

    public void delete(Integer id){
        getDao().delete(id);
    }
}
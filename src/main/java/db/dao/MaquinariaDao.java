package db.dao;

import model.entity.Maquinaria;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

import static utiliy.DBSentences.*;

/**
 * Created by ronnie on 4/10/16.
 */
@RegisterMapper(MaquinariaMapper.class)
public interface MaquinariaDao {

    @SqlQuery(SQL_GET_ALL)
    List<Maquinaria> getAll();

    @SqlQuery(SQL_GET_BY_ID)
    List<Maquinaria> getById(@Bind("id") Integer id);

    @SqlUpdate(SQL_INSERT)
    int insert(@BindBean("m") Maquinaria maquinaria);

    @SqlUpdate(SQL_UPDATE)
    void update(@BindBean("m") Maquinaria maquinaria);

    @SqlUpdate(SQL_DELETE)
    void delete(@Bind("id") Integer id);
}
package db.dao;

import model.entity.Maquinaria;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;
import utiliy.DBSentences;

import java.util.List;

/**
 * Created by ronnie on 4/10/16.
 */
@RegisterMapper(MaquinariaMapper.class)
public interface MaquinariaDao {

    @SqlQuery(DBSentences.sqlGetAll)
    List<Maquinaria> getAll();

    @SqlQuery(DBSentences.sqlGetById)
    List<Maquinaria> getById(@Bind("id") Integer id);

    @SqlUpdate(DBSentences.sqlInsert)
    void insert(@BindBean("m") Maquinaria maquinaria);

    @SqlUpdate(DBSentences.sqlUpdate)
    void update(@BindBean("m") Maquinaria maquinaria);

    @SqlUpdate(DBSentences.sqlDelete)
    void delete(@Bind("id") Integer id);
}
package db.dao;

import model.entity.Maquinaria;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by ronnie on 4/10/16.
 */
@RegisterMapper(MaquinariaMapper.class)
public interface MaquinariaDao {

    @SqlQuery("SELECT * FROM MAQUINARIA WHERE ID_MAQUINARIA = :id")
    Maquinaria findById(@Bind("id") Integer id);

    @SqlQuery("SELECT * FROM MAQUINARIA")
    List<Maquinaria> getAll();

    @SqlUpdate("INSERT INTO MAQUINARIA (" +
            "ID_TIPO,"          +
            "ID_PROVEEDOR, "    +
            "NOMBRE, "          +
            "ESTADO, "          +
            "ID_MANIPULADOR) "  +
            "VALUES("           +
            ":m.idTipo, "       +
            ":m.idProveedor, "  +
            ":m.nombre, "       +
            ":m.estado, "       +
            ":m.idManipulador)")
    void insert(@BindBean("m") Maquinaria maquinaria);

    @SqlUpdate("UPDATE MAQUINARIA SET "         +
            "ID_PROVEEDOR = :m.idProveedor, "   +
            "NOMBRE = :m.nombre, "              +
            "ESTADO = :m.estado, "              +
            "ID_MANIPULADOR = :m.idManipulador "+
            "WHERE ID_MAQUINARIA = :m.id")
    void update(@BindBean("m") Maquinaria maquinaria);

    @SqlUpdate("DELETE FROM MAQUINARIA WHERE ID_MAQUINARIA = :id")
    void delete(@Bind("id") Integer id);
}
package db.dao;

import model.entity.Maquinaria;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by ronnie on 5/10/16.
 */
public class MaquinariaMapper implements ResultSetMapper<Maquinaria> {
    @Override
    public Maquinaria map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new Maquinaria(r.getInt("ID_MAQUINARIA"), r.getInt("ID_TIPO"), r.getInt("ID_PROVEEDOR"), r.getString("NOMBRE"), r.getString("ESTADO"), r.getInt("ID_MANIPULADOR"));
    }
}

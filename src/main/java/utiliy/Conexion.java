package utiliy;

import oracle.jdbc.pool.OracleDataSource;
import org.skife.jdbi.v2.DBI;

import java.sql.SQLException;

/**
 * Created by ronnie on 4/10/16.
 */
public class Conexion {

    private static final String HOST = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER = "RonnieDaveBDII";
    private static final String PASS = "7098";

    public static DBI get() {
        OracleDataSource ds = null;

        try {
            ds = new OracleDataSource();
            ds.setURL(HOST);
            ds.setUser(USER);
            ds.setPassword(PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new DBI(ds);
    }
}
package utiliy;

/**
 * Created by ronnie on 14/11/16.
 */
public class DBSentences {

    public final static String sqlGetAll = "SELECT * FROM MAQUINARIA";
    public final static String sqlGetById = sqlGetAll + " WHERE ID_MAQUINARIA = :id";

    public final static String sqlInsert = "INSERT INTO MAQUINARIA (" +
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
            ":m.idManipulador)";

    public final static String sqlUpdate = "UPDATE MAQUINARIA SET "         +
            "ID_PROVEEDOR = :m.idProveedor, "   +
            "NOMBRE = :m.nombre, "              +
            "ESTADO = :m.estado, "              +
            "ID_MANIPULADOR = :m.idManipulador "+
            "WHERE ID_MAQUINARIA = :m.id";

    public final static String sqlDelete = "DELETE FROM MAQUINARIA WHERE ID_MAQUINARIA = :id";
}
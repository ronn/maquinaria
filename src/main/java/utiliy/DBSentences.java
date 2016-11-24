package utiliy;

/**
 * Created by ronnie on 14/11/16.
 */
public class DBSentences {

    public final static String SQL_GET_ALL = "SELECT * FROM MAQUINARIA";
    public final static String SQL_GET_BY_ID = SQL_GET_ALL + " WHERE ID_MAQUINARIA = :id";

    public final static String SQL_INSERT = "INSERT INTO MAQUINARIA (" +
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

    public final static String SQL_UPDATE = "UPDATE MAQUINARIA SET "         +
            "ID_TIPO = :m.idTipo, " +
            "ID_PROVEEDOR = :m.idProveedor, "   +
            "NOMBRE = :m.nombre, "              +
            "ESTADO = :m.estado, "              +
            "ID_MANIPULADOR = :m.idManipulador "+
            "WHERE ID_MAQUINARIA = :m.id";

    public final static String SQL_DELETE = "DELETE FROM MAQUINARIA WHERE ID_MAQUINARIA = :id";
}
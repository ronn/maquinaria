package utiliy;

/**
 * Created by ronnie on 14/11/16.
 */
public class DBSentences {

    public final static String PARAMETERS = "(:m.id"
                                            + ", :m.idTipo"
                                            + ", :m.idProveedor"
                                            + ", :m.nombre"
                                            + ", :m.estado"
                                            + ", :m.idManipulador"
                                            + ", :m.idObra)";

    public final static String SQL_GET_ALL = "SELECT * FROM MAQUINARIA";

    public final static String SQL_GET_BY_ID = SQL_GET_ALL + " WHERE ID_MAQUINARIA = :id";

    public final static String SQL_INSERT = "CALL SP_INSERT_MAQUINARIA" +  PARAMETERS;

    public final static String SQL_UPDATE = "CALL SP_UPDATE_MAQUINARIA" + PARAMETERS;

    public final static String SQL_DELETE = "CALL SP_DELETE_MAQUINARIA(:id)";
}
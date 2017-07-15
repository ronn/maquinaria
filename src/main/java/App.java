import controller.MaquinariaController;
import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

public class App extends AbstractVerticle{

    private final static String JSON = "application/json";
    private MaquinariaController controller =  new MaquinariaController();

    @Override
    public void start() {
        Router router = Router.router(vertx);

        router.route("/maquinaria*").handler(BodyHandler.create());

        router.get("/maquinaria")
                .produces(JSON)
                .handler(controller::getAll)
                .failureHandler(this::handleError);

        router.get("/maquinaria/:id")
                .produces(JSON)
                .handler(controller::getById)
                .failureHandler(this::handleError);

        router.post("/maquinaria")
                .consumes(JSON)
                .produces(JSON)
                .handler(controller::save)
                .failureHandler(this::handleError);

        router.put("/maquinaria/:id")
                .consumes(JSON)
                .produces(JSON)
                .handler(controller::update)
                .failureHandler(this::handleError);

        router.delete("/maquinaria/:id")
                .handler(controller::delete)
                .failureHandler(this::handleError);

        vertx.createHttpServer().requestHandler(router::accept).listen(9087);
    }

    public void handleError(RoutingContext rc){
        rc.failure().printStackTrace();
        int sc = rc.statusCode();
        if (sc > 0){
            if (400 >= sc && sc < 500){
                rc.response()
                        .setStatusCode(sc)
                        .end("La solicitud no es correcta");
            }else {
                rc.response()
                        .setStatusCode(sc)
                        .end("Error interno al tratar de procesar la solicitud... Intenta más tarde");
            }
        }else {
            rc.response()
                    .setStatusCode(500).end("Ha ocurrido un error inesperado");
        }
    }
}
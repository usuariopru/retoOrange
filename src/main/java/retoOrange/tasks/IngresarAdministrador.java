package retoOrange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import retoOrange.userInterface.PaginaInicio;

public class IngresarAdministrador implements Task {

    private String strNombre;
    private String  strContrasena;

    public IngresarAdministrador (String strNombre,String strContrasena){

        this.strNombre = strNombre;
        this.strContrasena = strContrasena;
    }

    public static IngresarAdministrador enOrange(String strNombre, String strContrasena) {
        return Tasks.instrumented(IngresarAdministrador.class, strNombre , strContrasena);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strNombre).into(PaginaInicio.CAMPO_USUARIO),
                Enter.theValue(strContrasena).into(PaginaInicio.CAMPO_CONTRASENA),
                Click.on(PaginaInicio.BOTON_INGRESAR)
        );
    }
}

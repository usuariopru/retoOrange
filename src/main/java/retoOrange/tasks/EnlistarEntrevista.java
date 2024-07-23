package retoOrange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import retoOrange.userInterface.EnlistarCandidato;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnlistarEntrevista implements Task {

    private String  strNoteDos;

    public EnlistarEntrevista ( String  strNoteDos){

        this.strNoteDos = strNoteDos;

    }

    public static EnlistarEntrevista enlistarEntre( String  strNoteDos) {
        return Tasks.instrumented(EnlistarEntrevista.class, strNoteDos);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(EnlistarCandidato.BOTON_ENLISTAR, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(EnlistarCandidato.BOTON_ENLISTAR),

                Enter.theValue("Nota").into(EnlistarCandidato.CAMPO_NOTADOS)

        );

    }
}

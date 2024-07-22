package retoOrange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import retoOrange.userInterface.OrangePage;

public class Visitar implements Task {
    private OrangePage orangePage;
    public static Visitar paginaOrange() {

        return Tasks.instrumented(Visitar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Open.browserOn(orangePage));
    }
}

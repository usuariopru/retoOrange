package retoOrange.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import retoOrange.tasks.Visitar;

public class Proceso {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Usuario quiere agregar candidato")
    public void  usuarioQuiereAgregarCandidato() throws Exception{
        OnStage.theActorCalled("Usuario").wasAbleTo(
                Visitar.paginaOrange()
        );
    }

    @When("^usuario realiza la acción$")
    public void usuarioRealizaLaAccion() {
        // Aquí implementa las acciones que el usuario realiza después de visitar la página.
    }

    @Then("^se debe registrar el candidato$")
    public void seDebeRegistrarElCandidato() {
        // Aquí implementa la verificación o acción final para asegurar que el candidato se registre correctamente.
    }
}

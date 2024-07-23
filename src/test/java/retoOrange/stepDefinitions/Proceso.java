package retoOrange.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import retoOrange.model.ReclutarCandidato;
import retoOrange.questions.IngresoAlSitio;
import retoOrange.tasks.*;
import java.util.List;
import java.util.Map;



public class Proceso {


    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @DataTableType
    public ReclutarCandidato defineReclutarCandidato(Map<String, String> entry) {
        return new ReclutarCandidato(
                entry.get("strNombre"), entry.get("strContrasena"),entry.get("strTitulo"),
                entry.get("strPrimerNombre"),entry.get("strSegundoNombre"), entry.get("strApellido"),
                entry.get("strVacante"),entry.get("strCorreo"),entry.get("strNumero"),entry.get("strClaves"),
                entry.get("strNoteUno"), entry.get("strStatus"), entry.get("strNoteDos") );
    }

    @Given("Usuario quiere agregar candidato")
    public void userWantsToAddCandidate(List <ReclutarCandidato> reclutarCandidato) throws Exception{
        OnStage.theActorCalled("Usuario").wasAbleTo(
                Visitar.paginaOrange()
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarAdministrador.enOrange(
                        reclutarCandidato.get(0).getStrNombre(),
                        reclutarCandidato.get(0).getStrContrasena()
                )
        );
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                IngresoAlSitio.texto(
                        reclutarCandidato.get(0).getStrTitulo()
                )));
    }

    @When("ingrese datos al formulario")
    public void enterDataToForm(List <ReclutarCandidato> recandidato) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarCandidato.enReclutar(
                        recandidato.get(0).getStrPrimerNombre(),
                        recandidato.get(0).getStrSegundoNombre(),
                        recandidato.get(0).getStrApellido(),
                        recandidato.get(0).getStrVacante(),
                        recandidato.get(0).getStrCorreo(),
                        recandidato.get(0).getStrNumero(),
                        recandidato.get(0).getStrClaves(),
                        recandidato.get(0).getStrNoteUno()
                )
        );

    }

    @When("de clic en guardar")
    public void clickSave() throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("La notificación está visible",
                IngresoAlSitio.isVisible()
        ));
        Thread.sleep(15000);

    }

    @Then("^se debe registrar el candidato$")
    public void theCandidateMustRegister(DataTable dataTable) throws Exception {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String status = data.get(0).get("strStatus");
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                IngresoAlSitio.contieneRegistro("Usuario1 Orange Choucair",status, "test")
        ));

    }


    @Given("Usuario quiere enlistar candidato")
    public void userWantCandidate(DataTable dataTable) throws Exception {
        /*List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String notaDos = data.get(0).get("strNoteDos");

        OnStage.theActorInTheSpotlight().attemptsTo(
                EnlistarEntrevista.enlistarEntre(notaDos)*/

    }

    @When("^el candidato paso las pruebas$")
    public void theCandidateSuccessfull(    ) throws Exception {

    }

    @Then("^es contratado$")
    public void theFinish(    ) throws Exception {

    }
}

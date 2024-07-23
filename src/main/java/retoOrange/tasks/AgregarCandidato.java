package retoOrange.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import retoOrange.userInterface.VentanaReclutar;
import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarCandidato implements Task {

    private String  strPrimerNombre;
    private String  strSegundoNombre;
    private String strApellido;
    private String  strVacante;
    private String  strCorreo;
    private String strNumero;
    private String  strClaves;
    private String  strNoteUno;


    public AgregarCandidato (String  strPrimerNombre, String  strSegundoNombre, String strApellido,
                             String  strVacante, String  strCorreo, String strNumero, String  strClaves, String  strNoteUno){

        this.strPrimerNombre = strPrimerNombre;
        this.strSegundoNombre = strSegundoNombre;
        this.strApellido = strApellido;
        this.strVacante = strVacante;
        this.strCorreo = strCorreo;
        this.strNumero = strNumero;
        this.strClaves = strClaves;
        this.strNoteUno = strNoteUno;

    }

    public static AgregarCandidato enReclutar(String  strPrimerNombre, String  strSegundoNombre, String strApellido,
                                                 String  strVacante, String  strCorreo, String strNumero, String  strClaves, String  strNoteUno) {
        return Tasks.instrumented(AgregarCandidato.class, strPrimerNombre , strSegundoNombre,strApellido,
                strVacante,strCorreo,strNumero,strClaves,strNoteUno);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {


        Path fileToUpload = Paths.get("C:\\Users\\Usuario\\Downloads\\retoOrange\\src\\test\\resources\\data\\Doc1.docx");

        actor.attemptsTo(
                WaitUntil.the(VentanaReclutar.BOTON_RECLUTAR, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(VentanaReclutar.BOTON_RECLUTAR),
                Click.on(VentanaReclutar.BOTON_AGREGAR),
                Enter.theValue(strPrimerNombre).into(VentanaReclutar.CAMPO_PRIMERNOMBRE),
                Enter.theValue(strSegundoNombre).into(VentanaReclutar.CAMPO_SEGUNDONOMBRE),
                Enter.theValue(strApellido).into(VentanaReclutar.CAMPO_APELLIDO),
                Click.on(VentanaReclutar.OPCION_VACANTE),
                WaitUntil.the(VentanaReclutar.OPCION_VACANTE, isVisible()).forNoMoreThan(20).seconds(),
                SendKeys.of(strVacante).into(VentanaReclutar.OPCION_VACANTE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Enter.theValue(strCorreo).into(VentanaReclutar.CAMPO_CORREO),
                Enter.theValue(strNumero).into(VentanaReclutar.CAMPO_NUMERO),
                WaitUntil.the(VentanaReclutar.BOTON_ARCHIVO, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(VentanaReclutar.BOTON_ARCHIVO),
                Enter.theValue(strClaves).into(VentanaReclutar.CAMPO_CLAVE),
                Enter.theValue(strNoteUno).into(VentanaReclutar.CAMPO_NOTA),
                Click.on(VentanaReclutar.OPCION_AUTORIZAR),
                Click.on(VentanaReclutar.BOTON_GUARDAR),
                WaitUntil.the(VentanaReclutar.BOTON_GUARDAR, isClickable()).forNoMoreThan(1000).seconds()



        );

    }
}

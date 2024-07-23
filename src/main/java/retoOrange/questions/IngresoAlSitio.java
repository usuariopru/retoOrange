package retoOrange.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import retoOrange.userInterface.*;

import java.util.List;


public class IngresoAlSitio implements Question<Boolean>{
    private String strTitulo;

    public IngresoAlSitio(String strTitulo) {
        this.strTitulo = strTitulo;
    }

    public static Question<Boolean> texto(String strTitulo) {
        return new IngresoAlSitio(strTitulo);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String dashboard = BrowseTheWeb.as(actor).find(PaginaInicio.INGRESO).getText();
        if (strTitulo.equals(dashboard)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static Question<Boolean> isVisible() {
        return actor -> {
            WebElement element = VentanaReclutar.TOAST_NOTIFICATION.resolveFor(actor);
            return element.isDisplayed();
        };
    }


    public static Question<Boolean> contieneRegistro(String nombre, String status, String vacante) {
        return actor -> {
            WebElement formulario = VentanaReclutar.TABLA_CANDIDATOS.resolveFor(actor);


            String nombreActual = formulario.findElement(By.xpath("(//form//p)[1]")).getText();
            String vacanteActual = formulario.findElement(By.xpath("(//form//p)[2]")).getText();
            String estadoActual = formulario.findElement(By.xpath("(//form//p)[4]")).getText();


            System.out.println("Nombre Actual: " + nombre);
            System.out.println("Vacante Actual: " + status);
            System.out.println("Estado Actual: " + vacante);


            return nombreActual.equals(nombre) && estadoActual.equals(status) && vacanteActual.equals(vacante);
        };
    }



}

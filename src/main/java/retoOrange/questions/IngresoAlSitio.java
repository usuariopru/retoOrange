package retoOrange.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import retoOrange.userInterface.PaginaInicio;

public class IngresoAlSitio implements Question<Boolean>{
    private String strTitulo;

    public IngresoAlSitio(String strTitulo) {
        this.strTitulo = strTitulo;
    }

    public static Question<Boolean> texto(String strTitulo) {
        return new IngresoAlSitio(strTitulo);
    }

    private static final Target TOAST_NOTIFICATION = Target.the("toast notification").locatedBy("#oxd-toaster_1");

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Dashboard = BrowseTheWeb.as(actor).find(PaginaInicio.INGRESO).getText();
        if (strTitulo.equals(Dashboard)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static Question<Boolean> isVisible() {
        return actor -> {
            WebElement element = TOAST_NOTIFICATION.resolveFor(actor);
            return element.isDisplayed();
        };
    }

}

package retoOrange.userInterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicio extends PageObject {

    public static final Target CAMPO_USUARIO = Target.the("Ingresar Nombre Usuario").located(By.name("username"));

    public static final Target CAMPO_CONTRASENA = Target.the("Ingresar contraseña").located(By.name("password"));

    public static final Target BOTON_INGRESAR =
            Target.the("Permitira al usuario ingresar al sitio web").locatedBy("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");
    public static By INGRESO = By.xpath("//h6[text()='Dashboard']");
}

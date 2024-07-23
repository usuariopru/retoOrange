package retoOrange.userInterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EnlistarCandidato extends PageObject {


    public static final Target BOTON_ENLISTAR = Target.the("Listar candidato").locatedBy("//button[@class=\"oxd-button oxd-button--medium oxd-button--success\"]");

    public static final Target CAMPO_NOTADOS = Target.the("Ingresar una nota").located(By.xpath("//textArea[@placeholder='Type here']"));

}

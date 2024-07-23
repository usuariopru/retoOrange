package retoOrange.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VentanaReclutar {


    public static final Target BOTON_RECLUTAR =
            Target.the("PermitE AL USUARIO INGRESAR A LA INTERFAZ").located(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[5]"));

    public static final Target BOTON_AGREGAR =
            Target.the("Permite al usuario agregar candidato").locatedBy("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");

    public static final Target CAMPO_PRIMERNOMBRE = Target.the("Ingresar Primer Nombre").located(By.name("firstName"));

    public static final Target CAMPO_SEGUNDONOMBRE = Target.the("Ingresar Segundo Nombre").located(By.name("middleName"));

    public static final Target CAMPO_APELLIDO = Target.the("Ingresar Segundo Nombre").located(By.name("lastName"));

    public static final Target OPCION_VACANTE = Target.the("Seleccionar vacante").located(By.xpath("//div[@class='oxd-select-text-input']"));

    public static final Target CAMPO_CORREO = Target.the("Ingresar correo").located(By.xpath("(//input[@class='oxd-input oxd-input--active' and @data-v-1f99f73c])[2]"));

    public static final Target CAMPO_NUMERO = Target.the("Ingresar numero").located(By.xpath("(//input[@class='oxd-input oxd-input--active' and @data-v-1f99f73c or @placeholder='Type here'])[3]"));

    public static final Target CAMPO_CLAVE = Target.the("Ingresar palabra claves").located(By.xpath("(//input[@placeholder='Enter comma seperated words...'])"));

    public static final Target CAMPO_NOTA = Target.the("Ingresar una nota").located(By.xpath("//textArea[@placeholder='Type here']"));
    public static final Target BOTON_ARCHIVO = Target.the("Cargar Archivo").locatedBy("//div[@class=\"oxd-file-input-div\"]");

    public static final Target OPCION_AUTORIZAR = Target.the("Autorizar datos").located(By.xpath("//span[@data-v-6179b72a]"));

    public static final Target BOTON_GUARDAR = Target.the("Guardar CANDIDATO").locatedBy("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");

    public static final Target TABLA_CANDIDATOS = Target.the("tabla de candidatos").locatedBy("//div[@class=\"oxd-table-body oxd-card-table-body\"]");


    public static final Target TOAST_NOTIFICATION = Target.the("toast notification").locatedBy("#oxd-toaster_1");

}

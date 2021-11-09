package pruebaPortalDemoQA.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class WebTablePage {
    public static final Target BTN_ADD =
            Target.the("Boton Agregar").located(By.id("addNewRecordButton"));
    public static final Target TXT_FIRST_NAME =
            Target.the("Texto Nombre").located(By.id("firstName"));
    public static final Target TXT_LAST_NAME =
            Target.the("Texto Apellido").located(By.id("lastName"));
    public static final Target TXT_EMAIL =
            Target.the("Texto Email").located(By.id("userEmail"));
    public static final Target TXT_AGE =
            Target.the("Texto Edad").located(By.id("age"));
    public static final Target TXT_SALARY =
            Target.the("Texto Salario").located(By.id("salary"));
    public static final Target TXT_DEPARTAMENT =
            Target.the("Texto Departamento").located(By.id("department"));
    public static final Target BTN_SUBMIT =
            Target.the("Boton Guardar").located(By.id("submit"));
    public static final Target BTN_ELIMINAR =
            Target.the("Boton Eliminar").located(By.cssSelector("#delete-record-1 path"));
    public static final Target LBL_REGISTER =
            Target.the("Label Registro").located(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div/div[3]/div/div[2]/div[3]/div/div"));
}

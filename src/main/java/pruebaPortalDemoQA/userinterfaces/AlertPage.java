package pruebaPortalDemoQA.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AlertPage {

    public static final Target BTN_ALERT_1 =
            Target.the("Boton Alerta 1").located(By.id("alertButton"));
    public static final Target BTN_ALERT_2 =
            Target.the("Boton Alerta 2").located(By.id("timerAlertButton"));
    public static final Target BTN_ALERT_3 =
            Target.the("Boton Alerta 3").located(By.id("confirmButton"));
    public static final Target BTN_ALERT_4 =
            Target.the("Boton Alerta 4").located(By.id("promtButton"));
}

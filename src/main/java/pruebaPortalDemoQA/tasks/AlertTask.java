package pruebaPortalDemoQA.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pruebaPortalDemoQA.interactions.Wait;
import pruebaPortalDemoQA.userinterfaces.AlertPage;
import pruebaPortalDemoQA.userinterfaces.MenuPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;


public class AlertTask implements Task {

    @Step("{0} validar alertas")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Wait.forAbout(1),
                Scroll.to(MenuPage.CARD_ALERT),
                WaitUntil.the(MenuPage.CARD_ALERT, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(MenuPage.CARD_ALERT),
                Scroll.to(MenuPage.OPT_ALERT),
                WaitUntil.the(MenuPage.OPT_ALERT, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(MenuPage.OPT_ALERT),
                WaitUntil.the(AlertPage.BTN_ALERT_1, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(AlertPage.BTN_ALERT_1),
                WaitUntil.the(AlertPage.BTN_ALERT_2, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(AlertPage.BTN_ALERT_2),
                Wait.forAbout(6),
                WaitUntil.the(AlertPage.BTN_ALERT_3, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(AlertPage.BTN_ALERT_3),
                WaitUntil.the(AlertPage.BTN_ALERT_4, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(AlertPage.BTN_ALERT_4),
                Wait.forAbout(2)
        );
    }

    public static AlertTask validarAlertas() {
        return Tasks.instrumented(AlertTask.class);
    }
}

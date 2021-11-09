package pruebaPortalDemoQA.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pruebaPortalDemoQA.interactions.Wait;
import pruebaPortalDemoQA.models.WebTableModel;
import pruebaPortalDemoQA.userinterfaces.MenuPage;
import pruebaPortalDemoQA.userinterfaces.WebTablePage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class WebTableTask implements Task {

    WebTableModel registro;

    public WebTableTask(WebTableModel registro) {
        this.registro = registro;
    }

    @Override
    @Step("{0} ingresa los Datos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.forAbout(1),
                Scroll.to(MenuPage.CARD_ELEMENTS),
                WaitUntil.the(MenuPage.CARD_ELEMENTS, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(MenuPage.CARD_ELEMENTS),
                WaitUntil.the(MenuPage.OPT_WEBTABLES, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(MenuPage.OPT_WEBTABLES),
                WaitUntil.the(WebTablePage.BTN_ADD, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(WebTablePage.BTN_ADD),
                WaitUntil.the(WebTablePage.TXT_FIRST_NAME, isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(registro.getFirstname()).into(WebTablePage.TXT_FIRST_NAME),
                WaitUntil.the(WebTablePage.TXT_LAST_NAME, isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(registro.getLastname()).into(WebTablePage.TXT_LAST_NAME),
                WaitUntil.the(WebTablePage.TXT_EMAIL, isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(registro.getEmail()).into(WebTablePage.TXT_EMAIL),
                WaitUntil.the(WebTablePage.TXT_AGE, isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(registro.getAge()).into(WebTablePage.TXT_AGE),
                WaitUntil.the(WebTablePage.TXT_SALARY, isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(registro.getSalary()).into(WebTablePage.TXT_SALARY),
                WaitUntil.the(WebTablePage.TXT_DEPARTAMENT, isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(registro.getDepartament()).into(WebTablePage.TXT_DEPARTAMENT),
                WaitUntil.the(WebTablePage.BTN_SUBMIT, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(WebTablePage.BTN_SUBMIT),
                Wait.forAbout(2),
                WaitUntil.the(WebTablePage.BTN_ELIMINAR, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(WebTablePage.BTN_ELIMINAR)
        );
    }

    public static WebTableTask ingresarDatos(WebTableModel registro) {
        return Tasks.instrumented(WebTableTask.class, registro);
    }
}

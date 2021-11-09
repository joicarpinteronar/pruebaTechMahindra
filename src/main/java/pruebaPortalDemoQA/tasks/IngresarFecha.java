package pruebaPortalDemoQA.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pruebaPortalDemoQA.interactions.Wait;

import pruebaPortalDemoQA.models.Fecha;
import pruebaPortalDemoQA.userinterfaces.DatePickerPage;
import pruebaPortalDemoQA.userinterfaces.MenuPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IngresarFecha implements Task {

  Fecha fecha;

  public IngresarFecha(Fecha fecha) {
    this.fecha = fecha;
  }

  @Override
  @Step("{0} ingresa la fecha")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
       Wait.forAbout(5),
       Scroll.to(MenuPage.CARD_WIDGETS),
       WaitUntil.the(MenuPage.CARD_WIDGETS, isEnabled()).forNoMoreThan(5).seconds(),
       Click.on(MenuPage.CARD_WIDGETS),
       Scroll.to(MenuPage.OPT_DATEPICKER),
       WaitUntil.the(MenuPage.OPT_DATEPICKER, isEnabled()).forNoMoreThan(5).seconds(),
       Click.on(MenuPage.OPT_DATEPICKER),
       WaitUntil.the(DatePickerPage.SELECT_DATE, isEnabled()).forNoMoreThan(5).seconds(),
       Click.on(DatePickerPage.SELECT_DATE),
       WaitUntil.the(DatePickerPage.SELECT_MES, isEnabled()).forNoMoreThan(5).seconds(),
       SelectFromOptions.byVisibleText(fecha.getMes()).from(DatePickerPage.SELECT_MES),
       WaitUntil.the(DatePickerPage.SELECT_YEAR, isEnabled()).forNoMoreThan(5).seconds(),
       SelectFromOptions.byVisibleText(fecha.getYear()).from(DatePickerPage.SELECT_YEAR),
       Click.on(DatePickerPage.SELECT_DIA.of(fecha.getDia())),
       WaitUntil.the(DatePickerPage.SELECT_DATE_TIME, isEnabled()).forNoMoreThan(5).seconds(),
       Click.on(DatePickerPage.SELECT_DATE_TIME),
       Click.on(DatePickerPage.SELECT_DAY_TIME.of(fecha.getDia())),
       Click.on(DatePickerPage.SELECT_HORA.of(fecha.getHora())),
       Wait.forAbout(5)
        );
  }

  public static IngresarFecha ingresarFecha(Fecha fecha) {
    return Tasks.instrumented(IngresarFecha.class, fecha);
  }
}

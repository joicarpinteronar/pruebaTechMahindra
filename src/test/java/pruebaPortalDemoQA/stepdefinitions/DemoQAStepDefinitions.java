package pruebaPortalDemoQA.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;
import static org.hamcrest.Matchers.equalTo;
import static pruebaPortalDemoQA.utils.Utilities.getRandomDriver;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;
import pruebaPortalDemoQA.models.Fecha;
import pruebaPortalDemoQA.models.WebTableModel;
import pruebaPortalDemoQA.questions.ValidarRegistroCreado;
import pruebaPortalDemoQA.tasks.*;
import java.util.List;

public class DemoQAStepDefinitions {

  WebDriver driver = getWebdriverManager().getWebdriver(getRandomDriver());

  @Before
  public void setStage() {
    OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));

  }

  @Dado("^que (.*) ingresa a la url correspondiente")
  public void abrirUrl(String nombreActor) {

    theActorCalled(nombreActor).wasAbleTo(Navegar.a());

  }

  @Cuando("^ingresa los datos al formulario y elimina un dato de la lista")
  public void elingresaDatos(List<WebTableModel> registro) {
    theActorInTheSpotlight().attemptsTo(WebTableTask.ingresarDatos(registro.get(0)));

  }

  @Entonces("^el valida el resultado esperado$")
  public void validarRespuesta(){
    theActorInTheSpotlight().should(seeThat(ValidarRegistroCreado.isSuccesful(), equalTo(true)));

  }

  @Cuando("^ingresa las fechas seleccionadas$")
  public void elIngresaFechas(List<Fecha> fecha) {
    theActorInTheSpotlight().attemptsTo(IngresarFecha.ingresarFecha(fecha.get(0)));
  }

  @Cuando("^selecciona las alertas correspondientes$")
  public void seleccionarAlertas() {
    theActorInTheSpotlight().attemptsTo(AlertTask.validarAlertas());
  }




}

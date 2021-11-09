package pruebaPortalDemoQA.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static pruebaPortalDemoQA.userinterfaces.WebTablePage.LBL_REGISTER;

public class ValidarRegistroCreado implements  Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_REGISTER.resolveFor(actor).isVisible();
    }

    public static ValidarRegistroCreado isSuccesful(){
        return new ValidarRegistroCreado();
    }
}

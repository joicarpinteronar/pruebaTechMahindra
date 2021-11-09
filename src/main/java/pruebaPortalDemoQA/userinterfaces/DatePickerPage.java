package pruebaPortalDemoQA.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DatePickerPage {

    public static final Target SELECT_DATE =
            Target.the("Seleccionar Fecha").located(By.id("datePickerMonthYearInput"));
    public static final Target SELECT_DIA =
            Target.the("Seleccionar Dia").locatedBy("//div[2]/div[contains(text(), '{0}')]");
    public static final Target SELECT_MES =
            Target.the("Seleccionar Mes").located(By.className("react-datepicker__month-select"));
    public static final Target SELECT_YEAR =
            Target.the("Seleccionar Year").located(By.className("react-datepicker__year-select"));
    public static final Target SELECT_DATE_TIME =
            Target.the("Seleccionar Fecha y Hora").located(By.id("dateAndTimePickerInput"));
    public static final Target SELECT_DAY_TIME =
            Target.the("Seleccionar Dia y Hora").locatedBy("//div[2]/div//div[contains(text(), '{0}')]");
    public static final Target SELECT_HORA =
            Target.the("Seleccionar Hora").locatedBy("//li[contains(text(), '{0}')]");


}



package pruebaPortalDemoQA.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {
    public static final Target CARD_ELEMENTS =
            Target.the("Tarjeta de Elementos").located(By.cssSelector(".card:nth-child(1) svg"));
    public static final Target OPT_WEBTABLES =
            Target.the("Opcion WebTables").located(By.xpath("//span[contains(.,'Web Tables')]"));
    public static final Target CARD_WIDGETS =
            Target.the("Card Widgets").located(By.cssSelector(".card:nth-child(4) svg"));
    public static final Target OPT_DATEPICKER =
            Target.the("Opcion DatePicker").located(By.xpath("//span[contains(.,'Date Picker')]"));
    public static final Target CARD_ALERT =
            Target.the("Tarjeta de Alerta").located(By.cssSelector(".card:nth-child(3) svg"));
    public static final Target OPT_ALERT =
            Target.the("Opcion de Alerta").located(By.xpath("(//li[@id='item-1']/span)[2]"));


}

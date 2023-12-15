package com.luegopago.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class OffertUI {

    public static Target FIRTS_PRODUCT_OFFER = Target.the("Firts product offer").locatedBy("(//div/span[contains(text(),'$') and @class='font-bold tracking-wider md:text-xl'])[1]");
}

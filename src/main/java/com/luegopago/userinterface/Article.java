package com.luegopago.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Article {
    public static Target ADD_BTN = Target.the("Button add").locatedBy("//button[text()='Añadir al carrito']");

    public static Target PLUS_BTN = Target.the("Plus Button").locatedBy("//*[@data-icon='circle-plus']");

    public static Target LIST_AMOUNT=Target.the("Amount List").locatedBy("//li[text()='{0}']");
    public static Target BTN_AMOUNT=Target.the("Amount Button").locatedBy("//button[@aria-haspopup='listbox' ]/span");
    public static Target BTN_CLOSE=Target.the("CLose Button").locatedBy("//h5[text()='Carrito']/following-sibling::button");
    public static Target LBL_PRICE=Target.the("Price label").locatedBy("//div[@class='relative h-full']//h5");


}

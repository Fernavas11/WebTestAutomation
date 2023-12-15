package com.luegopago.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCar {
    public static Target TOTAL_PRICE =Target.the("Price label").locatedBy("//span[text()='Total']/following-sibling::span");

    public static Target UNIT_PRICE =Target.the("Price Unit").locatedBy("//span[@class='ml-4 text-xl font-bold']");

    public static Target SUBTOTAL =Target.the("Subtotal").locatedBy("//span[text()='Subtotal']/following-sibling::span");

    public static Target DISCOUNT =Target.the("Price Unit").locatedBy("//span[text()='Descuento']/following-sibling::span");





}

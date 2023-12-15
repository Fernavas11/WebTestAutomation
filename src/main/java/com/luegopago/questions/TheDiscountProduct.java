package com.luegopago.questions;

import com.luegopago.userinterface.ShoppingCar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheDiscountProduct implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        Integer subtotal= Integer.parseInt(ShoppingCar.SUBTOTAL.resolveFor(actor).getText()
                .replace("$", "")
                .replace(",", ""));

        Integer descuento= Integer.parseInt(ShoppingCar.DISCOUNT.resolveFor(actor).getText()
                .replace("$", "")
                .replace(",", "")
                .replace("-", "")
                .replace(" ", ""));

                Integer totalExpected=subtotal-descuento;
        Integer totalActual = Integer.parseInt(ShoppingCar.TOTAL_PRICE.resolveFor(actor).getText()
                .replace("$", "")
                .replace(",", ""));

        return totalActual.equals(totalExpected);
    }

    public static TheDiscountProduct isCorrect(){
        return new TheDiscountProduct();
    }
}

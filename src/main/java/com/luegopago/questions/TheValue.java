package com.luegopago.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class TheValue implements Question<Boolean> {
    Target target;

    public TheValue(Target target) {
        this.target = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Integer resultActual = Integer.parseInt(target.resolveFor(actor).getText()
                .replace("$", "")
                .replace(",", ""));
        Integer resultExpected=actor.recall("total");

        return resultActual.equals(resultExpected);
    }

    public static TheValue priceIsEqualTo(Target target) {
        return new TheValue(target);
    }
}

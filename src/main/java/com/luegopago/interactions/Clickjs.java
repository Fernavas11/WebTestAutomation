package com.luegopago.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Clickjs implements Interaction {

    private Target target;

    public Clickjs(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        JavascriptExecutor executor = (JavascriptExecutor) actor.abilityTo(BrowseTheWeb.class).getDriver();
        executor.executeScript("arguments[0].click();", BrowseTheWeb.as(actor).find(target));
    }
    public static Clickjs on(Target target){
        return new Clickjs(target);
    }
}

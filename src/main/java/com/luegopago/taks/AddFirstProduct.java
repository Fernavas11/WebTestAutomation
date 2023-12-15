package com.luegopago.taks;

import com.luegopago.interactions.Clickjs;
import com.luegopago.userinterface.Article;
import com.luegopago.userinterface.HomePageUI;
import com.luegopago.userinterface.OffertUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.luegopago.userinterface.HomePageUI.BTN_SHOPPING_CAR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AddFirstProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomePageUI.BTN_OFFER)
                , Clickjs.on(OffertUI.FIRTS_PRODUCT_OFFER)
                , Click.on(Article.ADD_BTN)
                , WaitUntil.the(Article.BTN_CLOSE, WebElementStateMatchers.isPresent())
                        .forNoMoreThan(Duration.ofSeconds(5))
                , Click.on(Article.BTN_CLOSE),
                WaitUntil.the(BTN_SHOPPING_CAR, WebElementStateMatchers.isPresent())
                        .forNoMoreThan(Duration.ofSeconds(10)));
        theActorInTheSpotlight().attemptsTo(Click.on(BTN_SHOPPING_CAR));
    }

    public static AddFirstProduct onOffer(){
        return new AddFirstProduct();
    }



}

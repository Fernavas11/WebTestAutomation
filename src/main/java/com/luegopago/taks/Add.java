package com.luegopago.taks;

import com.luegopago.interactions.Clickjs;
import com.luegopago.models.Product;
import com.luegopago.userinterface.Article;
import com.luegopago.userinterface.HomePageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickAndHold;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.matchers.statematchers.IsPresentMatcher;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.luegopago.userinterface.HomePageUI.BTN_SHOPPING_CAR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Add implements Task {

    private List<Product> products;

    public Add(List<Product> products) {
        this.products = products;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Integer>totalPrice=new ArrayList<>();
        products.forEach(e -> {
            actor.attemptsTo(Click.on(HomePageUI.CATEGORY_MENU)
                    , ClickAndHold.on(HomePageUI.CATEGORY_NAME.of(e.getCategory()))
                    , Click.on(HomePageUI.SUBCATEGORY_NAME.of(e.getSubCategory()))
                    , Click.on(HomePageUI.PRODUCT_NAME.of(e.getProduct())));

          totalPrice.add(Integer.parseInt(Article
                  .LBL_PRICE.resolveFor(actor)
                  .getText()
                  .replace("$","")
                  .replace(",","")
          )* e.getAmount());

                    actor.attemptsTo(WaitUntil.the(Article.BTN_AMOUNT, WebElementStateMatchers.isPresent())
                            .forNoMoreThan(Duration.ofSeconds(5))
                    ,Click.on(Article.BTN_AMOUNT)
                    , Click.on(Article.LIST_AMOUNT.of(String.valueOf(e.getAmount())))
                    , Click.on(Article.ADD_BTN)
                    , WaitUntil.the(Article.BTN_CLOSE, WebElementStateMatchers.isPresent())
                            .forNoMoreThan(Duration.ofSeconds(5))
                    ,Click.on(Article.BTN_CLOSE)
            );
        });
        int suma = totalPrice.stream().mapToInt(Integer::intValue).sum();
        actor.remember("total",suma);
        actor.attemptsTo( WaitUntil.the(BTN_SHOPPING_CAR, WebElementStateMatchers.isPresent())
                .forNoMoreThan(Duration.ofSeconds(10)));
        theActorInTheSpotlight().attemptsTo(Click.on(BTN_SHOPPING_CAR));
    }

    public static Add the(List<Product> products) {
        return new Add(products);
    }
}

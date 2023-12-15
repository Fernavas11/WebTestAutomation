package com.luegopago.definitions;

import com.luegopago.interactions.Clickjs;
import com.luegopago.models.Product;
import com.luegopago.questions.TheDiscountProduct;
import com.luegopago.questions.TheValue;
import com.luegopago.taks.Add;
import static com.luegopago.userinterface.HomePageUI.BTN_SHOPPING_CAR;

import com.luegopago.taks.AddFirstProduct;
import com.luegopago.userinterface.Article;
import com.luegopago.userinterface.ShoppingCar;
import com.luegopago.utils.Jsonfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;
import java.util.List;

import static com.luegopago.drivers.Driver.chrome;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyDefinition {

    @Given("{string} that I am on the homepage of luegopago.com")
    public void theActorThatIAmOnTheHomepageOfLuegopagoCom(String actor ) {
        theActorCalled(actor).whoCan(BrowseTheWeb.with(chrome(Jsonfile.getValue("url"))));
    }
    @When("I select products list and add them to the shopping cart")
    public void iSelectProductsListAndAddThemToTheShoppingCart(List<Product>products) {
        theActorInTheSpotlight().attemptsTo(Add.the(products)
               );
    }
    @Then("I can verify that the total number of products and the price are correct")
    public void iCanVerifyThatTheTotalNumberOfProductsAndThePriceAreCorrect() {
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheValue.priceIsEqualTo(ShoppingCar.TOTAL_PRICE)));
    }

    @Then("should see the product value for unit is correct")
    public void shouldSeeTheProductValueForUnitIsCorrect() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheValue.priceIsEqualTo(ShoppingCar.UNIT_PRICE)));
    }

    @When("the user select the firts product on offer")
    public void theUserSelectTheFirtsProductOnOffer(){
        theActorInTheSpotlight().attemptsTo(AddFirstProduct.onOffer());
    }
    @Then("should see the discount is applied correctly")
    public void shouldSeeTheDiscountIsAppliedCorrectly() {
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheDiscountProduct.isCorrect()));
    }

}

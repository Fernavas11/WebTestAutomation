package com.luegopago.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/Buy.feature",
        glue = "com.luegopago",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@prueba"
)

public class Buyrunner {


}

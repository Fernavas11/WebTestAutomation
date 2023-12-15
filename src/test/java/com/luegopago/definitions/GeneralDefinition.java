package com.luegopago.definitions;

import com.luegopago.models.Product;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Map;

public class GeneralDefinition {

    @Before
    public void setup(){
        OnStage.setTheStage(Cast.ofStandardActors());
    }

    @DataTableType
    public Product setProduct(Map<String,String> data){
        Product product = new Product();
        product.setCategory(data.get("category"));
        product.setSubCategory(data.get("subcategory"));
        product.setProduct(data.get("product"));
        product.setAmount(Integer.parseInt(data.get("amount")));

        return product;
    }
}

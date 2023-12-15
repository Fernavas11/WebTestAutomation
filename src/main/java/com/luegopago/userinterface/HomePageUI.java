package com.luegopago.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUI {

    public static Target CATEGORY_MENU = Target.the("Category Menu").located(By.xpath("//span[contains(text(),'Más categorías')]"));

    public static Target CATEGORY_NAME = Target.the("Category Name").locatedBy("//span[contains(text(),'{0}')]");
    public static Target SUBCATEGORY_NAME = Target.the("SubCategory Name").locatedBy("//a[contains(text(),'{0}')]");

    public static Target PRODUCT_NAME = Target.the("Product Name").locatedBy("//img[@title='{0}']");
    public static Target BTN_SHOPPING_CAR = Target.the("Shopping car").locatedBy("//div[@class='hidden flex-none xl:block']//*[@data-icon='cart-shopping']");

    public static Target BTN_OFFER = Target.the("Button Offer").locatedBy("//a[contains(text(),'Ofertas')]");



}

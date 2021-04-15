/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Uma
 */
public class AutoPage {

    WebDriver driver;

    public AutoPage(WebDriver driver) {
        this.driver = driver;

    }
    //@FindBy(xpath = "//a[@id='HorizontalMenuLink_1']/span")
    @FindBy(xpath = "//a[@data-pt-name='mid_shop']")
    private WebElement horizontalmenulink;

    @FindBy(id = "Shop_Section1_ShopNow")
    private WebElement shopnow;
    
    @FindBy(xpath = "//a[@id='Homepage_Tile1_Btn']")
    private WebElement firstshopnow;

    public void clickShop() {
        try {
            horizontalmenulink.click();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void clickShopNow() {
        shopnow.click();
    }
    
     public void clickFirstShopNow() {
        firstshopnow.click();
    }
}

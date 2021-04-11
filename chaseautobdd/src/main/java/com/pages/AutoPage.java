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
    @FindBy(xpath = "//a[@id='HorizontalMenuLink_1']/span")
    private WebElement horizontalmenulink;

    @FindBy(id = "Shop_Section1_ShopNow")
    private WebElement shopnow;

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
}

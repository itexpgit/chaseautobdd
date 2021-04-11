/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Uma
 */
public class CompareVehicles {

    WebDriver driver;

    public CompareVehicles(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(linkText = "Message Concierge")
    private WebElement message;

    public void message() throws InterruptedException {
        message.click();

    }

}

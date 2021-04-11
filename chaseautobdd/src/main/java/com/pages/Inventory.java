/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pages;

import com.definition.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Uma
 */
public class Inventory {
    
    WebDriver driver;
    
     public Inventory(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "//button[@class='compare-btn']")
    private WebElement compare;
    
      
    @FindBy(xpath = "//button[@class='g-button g-button--medium']")
    private WebElement compare2;
       
       public void comparecar() throws InterruptedException
       {
        compare.click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).build().perform();
        actions.sendKeys(Keys.TAB).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        actions.sendKeys(Keys.TAB).build().perform();
        actions.sendKeys(Keys.TAB).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        
       }
       
       public void compare(){
        compare2.click();   
       }
  
    
}

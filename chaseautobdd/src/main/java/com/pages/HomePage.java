/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Uma
 */
public class HomePage {
     WebDriver driver;
     
    public HomePage(WebDriver driver) {
        this.driver = driver;
        
    }
     
     @FindBy(xpath = "(//button[@type='button'])[3]")
     private WebElement arrow;
     
     @FindBy(xpath= "//div[@id='slick-slide05']/a/div")
     private WebElement auto;
     
     public void enterChaseAuto(String URL) throws IOException
     {
         try
         {             
             driver.get(URL);
                      
         }
         catch (Exception ex) {
            ex.printStackTrace();
        }
     }
     
     public void clickArrow(){
         arrow.click();
     }
     
     public void clickAuto(){
         
         auto.click();
         
     }
     
     
     

    
}
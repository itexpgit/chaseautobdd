/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pages;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Uma
 */
public class MessageDealer {
    WebDriver driver;

    public MessageDealer(WebDriver driver) {
        this.driver = driver;
    }
   
@FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstname;

@FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastname;

@FindBy(xpath = "//input[@id='email']")
    private WebElement email;

@FindBy(xpath = "//input[@id='phone']")
    private WebElement phno;

@FindBy(id = "contact_agreement")
    private WebElement contactagment;

@FindBy(id = "sharing_agreement")
    private WebElement sharingagment;

@FindBy(xpath = "//button[@class='g-button formsubmit chaseanalytics-track-element']")
    private WebElement submit;

@FindBy(xpath = "//button[@data-pt-name='af_lower_price']")
    private WebElement lowerprice;





 public void enterFirstName(String ftname) throws InterruptedException
       {
          
          WebDriverWait wait = new WebDriverWait(driver, 30);
          wait.until(ExpectedConditions.visibilityOf(lowerprice)); 
          Actions a = new Actions(driver);
          a.moveToElement(submit);
          a.perform();
          firstname.sendKeys(ftname);
        
           
       }
  
    
 public void enterLastName(String ltname) throws InterruptedException
       {
           lastname.clear();
           lastname.sendKeys(ltname);
           
       }
 
  public void enterEmail(String cemail) throws InterruptedException
       {
           email.clear();
           email.sendKeys(cemail);
           
       }

   public void enterPhoneNumber(String pno) throws InterruptedException
       {
           phno.clear();
           phno.sendKeys(pno);
           
       }
   
   public void enterContactagreement() throws InterruptedException
       {
           //contactagment.click();
           Actions actions = new Actions(driver);
           actions.sendKeys(Keys.TAB).build().perform();
           actions.sendKeys(Keys.TAB).build().perform();
           actions.sendKeys(Keys.SPACE).build().perform();
           
           
       }

   public void enterSharingagreement() throws InterruptedException
       {
           //sharingagment.click();
           Actions actions = new Actions(driver);
           actions.sendKeys(Keys.TAB).build().perform();
           actions.sendKeys(Keys.SPACE).build().perform();
           
           
       }


    public void finish() throws InterruptedException
       {
          driver.quit();
           
           
       }

            
  /*             driver.findElement(By.xpath("//input[@type='text']")).clear();
       -- driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Test");
      --  driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
      --  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Test");
       -- driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
     --   driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("abc@abc.com");
       -- driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
       -- driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("234-432-6758");
       -- driver.findElement(By.id("contact_agreement")).click();
       -- driver.findElement(By.id("sharing_agreement")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
     
    */
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pages;

import com.workflow.ChaseAuto;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Uma
 */
public class SearchPage {

    WebDriver driver;
    ChaseAuto chaseauto = new ChaseAuto();
    String header;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "//*[@id='form']/div[1]/h2")
    private WebElement readytobuyform;

    @FindBy(xpath = "//*[@id='form']")
    private WebElement form;

    @FindBy(id = "new")
    private WebElement new1;

    @FindBy(id = "zipcode")
    private WebElement zipcode;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit;

    @FindBy(xpath = "//div[@class='g-error-tooltip']")
    private WebElement error;

    @FindBy(id = "body-style")
    private WebElement bodystyle;

    @FindBy(id = "make")
    private WebElement make;

    @FindBy(id = "model")
    private WebElement model;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElement guest;
    
   
    
   
    public void switchFocus() throws IOException {

        
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //Switch webdriver focus to second tab
        driver.switchTo().window(tabs.get(1));

    }

    public void waitForReadyToBuy() {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(readytobuyform));

    }

    public void assertTitle(String chasetitle) {

        String title = driver.getTitle();
        assertEquals(chasetitle, title);
    }

    public void getHeaderContent() {

        header = form.getText();

    }

    public void setGetReadytoBuy(String readytobuy) {
        header = form.getText();
        chaseauto.setReadytobuy(header.contains(readytobuy));
        Assert.assertTrue(chaseauto.getReadytobuy());
    }

    public void setGetZipcode(String zipcode) {

        chaseauto.setZipcode(header.contains(zipcode));
        Assert.assertTrue(chaseauto.getZipcode());

    }

    public void setGetCondition(String condition) {
        chaseauto.setCondition(header.contains(condition));
        Assert.assertTrue(chaseauto.getCondition());
    }

    public void setGetNew(String new1) {
        chaseauto.setNew(header.contains(new1));
        Assert.assertTrue(chaseauto.getNew());
    }

    public void setGetUsed(String used) {
        chaseauto.setUsed(header.contains(used));
        Assert.assertTrue(chaseauto.getUsed());
    }

    public void setGetBodyStyle(String bodystyle) {
        chaseauto.setBodystyle(header.contains(bodystyle));
        Assert.assertTrue(chaseauto.getBodystyle());
    }

    public void setGetAllBodyStyle(String allbodystyle) {
        chaseauto.setAllbodystyle(header.contains(allbodystyle));
        Assert.assertTrue(chaseauto.getAllbodystyle());
    }

    public void setGetCarMake(String carmake) {
        chaseauto.setCarmake(header.contains(carmake));
        Assert.assertTrue(chaseauto.getCarmake());
    }

    public void setGetAllMakes(String allmakes) {
        chaseauto.setAllmakes(header.contains(allmakes));
        Assert.assertTrue(chaseauto.getAllmakes());
    }

    public void setGetCarModel(String carmodel) {
        chaseauto.setCarmodel(header.contains(carmodel));
        Assert.assertTrue(chaseauto.getCarmodel());
    }

    public void setGetAllModel(String allmodel) {
        chaseauto.setAllmodels(header.contains(allmodel));
        Assert.assertTrue(chaseauto.getAllmodels());
    }

    public void setGetSearch(String search) {
        chaseauto.setSearch(header.contains(search));
        Assert.assertTrue(chaseauto.getSearch());
    }
    
    public void setGetDream(String dream) {
        chaseauto.setDream(header.contains(dream));
        Assert.assertTrue(chaseauto.getDream());
    }
       
  public void setGetMatch(String matches) {
        chaseauto.setMatch(header.contains(matches));
        Assert.assertTrue(chaseauto.getMatch());
    }
       
  
   public void setGetStarted(String started) {
        chaseauto.setStarted(header.contains(started));
        Assert.assertTrue(chaseauto.getStarted());
    }
   
   
    public void setGetSelected() {
        chaseauto.setSelected(new1.isSelected());
        Assert.assertTrue(chaseauto.getSelected());
    }
  
    
   public void setGetPlaceHolder(String placeholder, String zipcodetext) {
        chaseauto.setPlaceholder(zipcode.getAttribute(placeholder));
        assertEquals(zipcodetext, chaseauto.getPlaceholder());
    }
   
   
  
    
    public void setValidZip(String errortext) {
        chaseauto.setValidzip(error.getText());
        assertEquals(errortext,chaseauto.getValidzip());
    }
    
    public void setChkBodyStyle() {
        chaseauto.setChkbodystyle(bodystyle.isEnabled());
        Assert.assertFalse(chaseauto.getChkbodystyle());
    }
      
    public void setChkcarmake() {
        chaseauto.setChkcarmake(make.isEnabled());
        Assert.assertFalse(chaseauto.getChkcarmake());
    }
       
    public void setChkcarmodel() {
        chaseauto.setChkcarmodel(model.isEnabled());
        Assert.assertFalse(chaseauto.getChkcarmodel());
    }
    
    public void enterZipCode(String zipcodenum){ 
            zipcode.sendKeys(zipcodenum);
            

    } 
    
    public void setGetCarMake1(String carmake1) {
        chaseauto.setCarmake1(make.getText());
        assertEquals(carmake1,chaseauto.getCarmake1());
    }

    public void setChkcarmodel1() {
        chaseauto.setChkcarmodel1(model.isEnabled());
        Assert.assertFalse(chaseauto.getChkcarmodel1());
    }
    
    public void clickMake(String carname) {
     make.click();
      new Select(make).selectByVisibleText(carname);
      make.click();
    }
    
     public void setChkcarmodel2() {
        chaseauto.setChkcarmodel2(model.isEnabled());
        Assert.assertTrue(chaseauto.getChkcarmodel2());
    }
   
      
   public void searchCarModel(String carmodel) {
       model.click();
       new Select(model).selectByVisibleText(carmodel);
       model.click();
       
      
        
    }
   
   public void clickSubmit() {
     submit.click();
    }
   public void clickGuest(){
      guest.click();
   }
   
}
     
    
    
    
        

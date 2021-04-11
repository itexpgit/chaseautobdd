/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.definition;

import com.excel.ReadExcel;
import com.pages.AutoPage;
import com.pages.CompareVehicles;
import com.pages.HomePage;
import com.pages.Inventory;
import com.pages.MessageDealer;
import com.pages.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Uma
 */
public class StepDefinitions {

    private static WebDriver driver;
    ReadExcel readexcel = new ReadExcel();
    AutoPage autopage = PageFactory.initElements(driver, AutoPage.class);
    SearchPage searchpage = PageFactory.initElements(driver, SearchPage.class);
    Inventory invent = PageFactory.initElements(driver, Inventory.class);
    CompareVehicles comparevehicles = PageFactory.initElements(driver, CompareVehicles.class);
    MessageDealer messagedealer = PageFactory.initElements(driver, MessageDealer.class);

    @Given("^User is already on Chase Home Page$")
    public void user_is_already_on_Chase_Home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.enterChaseAuto(readexcel.getExcelTestData(1, 1));
    }

    @When("^Interact 4th Slick-dot to display Auto Icon$")
    public void interact_4th_Slick_dot_to_display_Auto_Icon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.clickArrow();
    }

    @Then("^Select Auto Icon$")
    public void select_Auto_Icon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.clickAuto();
        System.out.println("Home Page Completed");
    }

    @When("^Select Shop Icon$")
    public void select_Shop_Icon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        autopage.clickShop();
    }

    @Then("^Select Shop Now Button$")
    public void select_Shop_Now_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        autopage.clickShopNow();
        System.out.println("Auto Page Completed");
    }

    @Given("^Window focus switched to new window$")
    public void window_focus_switched_to_new_window() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.switchFocus();
    }

    @Given("^Ready to buy section available$")
    public void ready_to_buy_section_available() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.waitForReadyToBuy();
    }

    @Given("^Window title is Chase Auto$")
    public void window_title_is_Chase_Auto() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.assertTitle(readexcel.getExcelTestData(2, 1));
    }

    @When("^Get Header content$")
    public void get_Header_content() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.getHeaderContent();
    }

    @When("^Set GetReady,Zipcode,Condition,New,Used,Body Style,All Body Style,Car Make,All Make,Car Model,All Model,Search,Dream,Match,Get Started$")
    public void set_GetReady_Zipcode_Condition_New_Used_Body_Style_All_Body_Style_Car_Make_All_Make_Car_Model_All_Model_Search_Dream_Match_Get_Started() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.setGetReadytoBuy(readexcel.getExcelTestData(3, 1));
        searchpage.setGetZipcode(readexcel.getExcelTestData(4, 1));
        searchpage.setGetCondition(readexcel.getExcelTestData(5, 1));
        searchpage.setGetNew(readexcel.getExcelTestData(6, 1));
        searchpage.setGetUsed(readexcel.getExcelTestData(7, 1));
        searchpage.setGetBodyStyle(readexcel.getExcelTestData(8, 1));
        searchpage.setGetAllBodyStyle(readexcel.getExcelTestData(9, 1));
        searchpage.setGetCarMake(readexcel.getExcelTestData(10, 1));
        searchpage.setGetAllMakes(readexcel.getExcelTestData(11, 1));
        searchpage.setGetCarModel(readexcel.getExcelTestData(12, 1));
        searchpage.setGetAllModel(readexcel.getExcelTestData(13, 1));
        searchpage.setGetSearch(readexcel.getExcelTestData(14, 1));
        searchpage.setGetDream(readexcel.getExcelTestData(15, 1));
        searchpage.setGetMatch(readexcel.getExcelTestData(16, 1));
        searchpage.setGetStarted(readexcel.getExcelTestData(17, 1));
    }

    @When("^New is Selected$")
    public void new_is_Selected() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.setGetSelected();
    }

    @When("^Verify Zipcode text box$")
    public void verify_Zipcode_text_box() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.setGetPlaceHolder(readexcel.getExcelTestData(18, 1), readexcel.getExcelTestData(19, 1));
    }

    @When("^Click submit$")
    public void click_submit() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.clickSubmit();
    }

    @When("^Verify Zipcode error message$")
    public void verify_Zipcode_error_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.setValidZip(readexcel.getExcelTestData(20, 1));
    }

    @When("^Verify Body Style$")
    public void verify_Body_Style() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.setChkBodyStyle();
    }

    @When("^Verify Car Make Exist$")
    public void verify_Car_Make_Exist() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.setChkcarmake();
    }

    @When("^Verify Car Model Exist$")
    public void verify_Car_Model_Exist() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.setChkcarmodel();

    }

    @When("^Enter Zipcode$")
    public void enter_Zipcode() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.enterZipCode(readexcel.getExcelTestData(21, 1));

    }

    @When("^Verify Car Make text$")
    public void verify_Car_Make_text() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.setGetCarMake1(readexcel.getExcelTestData(22, 1));
    }

    @When("^Verify Car Model text$")
    public void verify_Car_Model_text() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.setChkcarmodel1();
    }

    @When("^Select Car Make as Acura$")
    public void select_Car_Make_as_Acura() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.clickMake(readexcel.getExcelTestData(23, 1));

    }

    @When("^Verify Car Model is Enable$")
    public void verify_Car_Model_is_Enable() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.setChkcarmodel2();
    }

    @When("^Select TLX as Car Model$")
    public void select_TLX_as_Car_Model() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.searchCarModel(readexcel.getExcelTestData(24, 1));
    }

    @When("^Click Submit$")
    public void click_Submit() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.clickSubmit();
    }

    @Then("^Guest Box Appears and Click to complete$")
    public void guest_Box_Appears_and_Click_to_complete() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchpage.clickGuest();
        System.out.println("Search Page Completed");
    }

    @When("^Select cars to compare$")
    public void select_cars_to_compare() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        invent.comparecar();

    }

    @Then("^Compare selected cars to see results$")
    public void compare_selected_cars_to_see_results() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        invent.compare();
        System.out.println("Inventory Page Completed");
    }

    @When("^Send Message to dealer$")
    public void send_Message_to_dealer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        comparevehicles.message();
        System.out.println("Compare Vehicles Page Completed");

    }

    @When("^Enter First Name$")
    public void enter_First_Name() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        messagedealer.enterFirstName(readexcel.getExcelTestData(25, 1));
    }

    @When("^Enter Last name$")
    public void enter_Last_name() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        messagedealer.enterLastName(readexcel.getExcelTestData(26, 1));
    }

    @When("^Enter Email$")
    public void enter_Email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        messagedealer.enterEmail(readexcel.getExcelTestData(27, 1));
    }

    @When("^Enter PhoneNumber$")
    public void enter_PhoneNumber() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        messagedealer.enterPhoneNumber(readexcel.getExcelTestData(28, 1));
        
    }

    @When("^Enter Contact Agreement$")
    public void enter_Contact_Agreement() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        messagedealer.enterContactagreement();
        
    }

    @When("^Enter Sharing Agreement$")
    public void enter_Sharing_Agreement() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        messagedealer.enterSharingagreement();
        
    }

    @Then("^close$")
    public void close() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        messagedealer.finish();
        System.out.println("Message Dealer Page Completed");
    }

}

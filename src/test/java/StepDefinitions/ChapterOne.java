package StepDefinitions;

import DriverScript.DriverSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChapterOne {


    DriverSetup driverSetup;
    WebDriver driver;

    @FindBy(css = "a[href='/chapter1']")
    WebElement chapter1Link;
    @FindBy(css = "div.mainbody p")
    WebElement actualSeleniumIDEText;

    @Before
    public void launchDriver() {
        driverSetup = new DriverSetup();
        driver = driverSetup.setupDriver();
        PageFactory.initElements(driver, this);
    }

    @Given("user is on homepage")
    public void launchURL() {
        driver.get("http://book.theautomatedtester.co.uk");
        System.out.println("The url is launched");
    }

    @When("the user clicks on the Chapter1 link")
    public void clickChapterOneLink() throws InterruptedException {
        Thread.sleep(5);
        chapter1Link.click();
    }

    @Then("the user is navigated to Chapter one page")
    public void verifyChapterOnePage() {
        Assertions.assertEquals("If you have arrived here then you have installed Selenium IDE and are ready to start recording your first test.", actualSeleniumIDEText.getText());
    }

    @After
    public void teardown() {
        driver.close();
    }

    @Given("^user is on Chapter One page$")
    public void navigateToChapter1Page() throws InterruptedException {
        launchURL();
        clickChapterOneLink();
        System.out.println("User navigated to Chapter 1 page");
    }

    @When("^the user selects the \"([^\"]*)\" value from dropdown$")
    public void dropdownOptionSelection(String dropdownOption) {
        Select select = new Select(driver.findElement(By.id("selecttype")));
        select.selectByVisibleText(dropdownOption);
    }

    @Then(("the desired value should be selected and displayed"))
    public void verifySelectedDropdownValue() {
        System.out.println("The dropdown selected");
    }
}

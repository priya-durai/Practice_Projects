package DriverScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {

    public WebDriver driver;

    public WebDriver setupDriver() {
        System.setProperty("webdriver.edge.driver", "lib/msedgedriver");
        driver = new EdgeDriver();
        return driver;
    }

}

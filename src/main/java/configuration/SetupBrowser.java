package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SetupBrowser {
    private static WebDriver driver;

    public SetupBrowser(WebDriver driver) {
        SetupBrowser.driver = driver;
    }

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void get(String s) {
        driver.get(s);
    }
}

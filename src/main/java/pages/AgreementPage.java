package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgreementPage {
    public AgreementPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}

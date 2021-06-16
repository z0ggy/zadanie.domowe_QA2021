package pages;

import configuration.SetupBrowser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgreementPage {
    public AgreementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    // Create action witch allow to click on pseudo element ::before , ::after
    Actions action = new Actions(SetupBrowser.getDriver());
    @FindBy(id = "id_zgoda_1") WebElement zgoda1;
    public void checkAgree_1() {
        action.moveToElement(zgoda1).click().build().perform();

    }

    @FindBy(id = "id_zgoda_2") WebElement zgoda2;
    public void checkAgree_2() {
        action.moveToElement(zgoda2).click().build().perform();
    }
    @FindBy(id = "id_zgoda_3") WebElement zgoda3;
    public void checkAgree_3() {
        action.moveToElement(zgoda3).click().build().perform();
    }

    @FindBy(id = "form_button_next") WebElement nextButton;
    public void clickNextButton(){
        nextButton.click();
    }
}


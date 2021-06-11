package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    public FormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id_first_name") WebElement firstName;
    public void inputFirstName(String myFirstName){
        firstName.click();
        firstName.sendKeys(myFirstName);
    }

    @FindBy(id = "id_last_name") WebElement lastName;
    public void inputLastName(String myLastName){
        lastName.click();
        lastName.sendKeys(myLastName);
    }

    @FindBy(id = "id_email") WebElement email;
    public void inputEmail(String myEmail){
        email.click();
        email.sendKeys(myEmail);
    }

    @FindBy(id = "id_phone") WebElement phone;
    public void inputPhone(String myPhone){
        phone.click();
        phone.sendKeys(myPhone);
    }

    @FindBy(id = "id_pesel") WebElement pesel;
    public void inputPesel(String myPesel){
        pesel.click();
        pesel.sendKeys(myPesel);
    }

    @FindBy(id = "id_id_numer") WebElement id;
    public void inputId(String myID){
        id.click();
        id.sendKeys(myID);
    }

    @FindBy(id = "id_date") WebElement date;
    public void inputDate(String myDate){
        date.click();
        date.sendKeys(myDate);
    }

    @FindBy(id = "form_button_next") WebElement next;
    public void clickNext(){
        next.click();
    }

    @FindBy(className = "input-group-text") WebElement calendar;
    public void clickCalendar(){
        calendar.click();
    }

    public String getMyFirstName()    { return firstName.getAttribute("value"); }
    public String getMyLastName() {return lastName.getAttribute("value");}
    public String getMyEmail()    {return email.getAttribute("value");}
    public String getMyPhone()    {return phone.getAttribute("value");}
    public String getMyPesel()    { return pesel.getAttribute("value");}
    public String getMyId()       {return id.getAttribute("value");}
    public String getMyDate()     {return date.getAttribute("value");}

}

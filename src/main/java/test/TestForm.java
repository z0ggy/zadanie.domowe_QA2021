package test;

import configuration.SetupBrowser;
import org.junit.After;
import static org.junit.Assert.assertEquals;

import pages.AgreementPage;
import pages.FormPage;
import org.junit.Before;
import org.junit.Test;

public class TestForm {
    SetupBrowser driver = new SetupBrowser(SetupBrowser.getDriver());
    FormPage formPage;
    AgreementPage agreementPage;

    @Before
    public void startBrowser() {
        driver.setUp();
        driver.get("https://app.bluealert.pl/ba/form/formularz-testowy");
        formPage = new FormPage(SetupBrowser.getDriver());
        agreementPage = new AgreementPage(SetupBrowser.getDriver());
    }

    @Test
    public void fillForm() {
        formPage.inputFirstName("Dominik");
        assertEquals("Dominik",formPage.getMyFirstName());

        formPage.inputLastName("Zochniak");
        assertEquals("Zochniak", formPage.getMyLastName());

        formPage.inputEmail("kowalski@gmail.com");
        assertEquals("kowalski@gmail.com", formPage.getMyEmail());

        formPage.inputPhone("123456789");
        assertEquals("123456789", formPage.getMyPhone());

        formPage.inputPesel("80013133016");
        assertEquals("80013133016", formPage.getMyPesel());

        formPage.inputId("AOL239650");
        assertEquals("AOL239650", formPage.getMyId());

        formPage.inputDate("1980-01-31");
        assertEquals("1980-01-31", formPage.getMyDate());

        formPage.clickCalendar();
        formPage.clickNext();

        //agreementPage.clickAgreement1();



    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        SetupBrowser.getDriver().quit();
    }
}

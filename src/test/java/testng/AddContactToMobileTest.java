package testng;

import io.appium.java_client.android.AndroidDriver;



import model.User;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddContactPage;
import pages.HomePage;
import utility.DeviceSetup;
import utility.FakeUserGenerator;
import utility.FindPath;

import java.net.MalformedURLException;
import java.net.URL;

// * save to mobile label
public class AddContactToMobileTest extends AddContactToHomeTest{


    // * class constructor
    public AddContactToMobileTest(){
        fake = new FakeUserGenerator();
        user = new User();
        user.setFullName(fake.fakeFullName());
        user.setEmail(fake.fakeEmail());
        user.setPhone(fake.fakePhone());
    }

    // * setup test
    @Override
    @BeforeClass()
    public void setup() throws MalformedURLException {

        capabilities = new DesiredCapabilities();

        capabilities = DeviceSetup.DeviceCapabilitites("src/test/resources/capabilities/android-oreo.json");
        capabilities.setCapability("app", FindPath.returnAppPath());

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
        homePage = new HomePage();
        addContactPage = new AddContactPage();
    }

    // * check home page
    @Test(priority = 0)
    public void checkHomePageTest(){
        String titleText = homePage.getHomePageTitle().getText();
        String invisibleCheckText = homePage.getInvisibleCheck().getText();
        String addContactButtonText = homePage.getAddContactButton().getText();

        Assert.assertEquals(titleText,"Contact Manager");
        Assert.assertEquals(invisibleCheckText,"Show Invisible Contacts (Only)");
        Assert.assertEquals(addContactButtonText,"Add Contact");
    }

    // * open and check add contact page
    @Test(priority = 1)
    public void openAddContactTest(){

        homePage.getAddContactButton().click();

        String titleText = addContactPage.getTitle().getText();
        String targetAccountText = addContactPage.getTargetAccountTitle().getText();
        String contactNameText = addContactPage.getContactNameTitle().getText();
        String contactPhoneText = addContactPage.getContactPhoneTitle().getText();
        String contactEmailText = addContactPage.getContactEmailTitle().getText();

        Assert.assertEquals(titleText, "Add Contact");
        Assert.assertEquals(targetAccountText, "Target Account");
        Assert.assertEquals(contactNameText, "Contact Name");
        Assert.assertEquals(contactPhoneText, "Contact Phone");
        Assert.assertEquals(contactEmailText, "Contact Email");
    }

    // * check mobile label
    @Test(priority = 2)
    public void checkHomeLabels(){

        addContactPage.getPhoneTypeSpinner().click();
        addContactPage.getHomeLabelPhone().click();

        addContactPage.getEmailTypeSpinner().click();
        addContactPage.getHomeLabelEmail().click();

        String phoneSpinnerText = addContactPage.getPhoneSpinnerText().getText();
        String emailSpinnerText = addContactPage.getEmailSpinnerText().getText();

        Assert.assertEquals(phoneSpinnerText, "Home");
        Assert.assertEquals(emailSpinnerText, "Home");

    }
    // * save contact to mobile label
    @Test(priority = 3)
    public void addContactTest(){
        addContactPage.getContactNameField().sendKeys(user.getFullName());
        addContactPage.getContactPhoneField().sendKeys(user.getPhone());
        addContactPage.getContactEmailField().sendKeys(user.getEmail());

        addContactPage.getSaveButton().click();

        String name = user.getFullName();
        Assert.assertEquals(name, user.getFullName());

    }
}


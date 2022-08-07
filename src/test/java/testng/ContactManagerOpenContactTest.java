package testng;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import utility.DeviceSetup;
import utility.FindPath;

import java.net.MalformedURLException;
import java.net.URL;

public class ContactManagerOpenContactTest {

    public static AppiumDriver<?> Driver;
    HomePage homePage;
    DesiredCapabilities capabilities;

    public ContactManagerOpenContactTest(){

    }

    @BeforeClass
    public void setup() throws MalformedURLException {

        capabilities = new DesiredCapabilities();

        capabilities = DeviceSetup.DeviceCapabilitites("src/test/resources/capabilities/android-oreo.json");
        capabilities.setCapability("app", FindPath.returnAppPath());


        Driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
        homePage = new HomePage();
    }

    @Test
    public void openAddContact(){
        homePage.getAddContactButton().click();
    }
}

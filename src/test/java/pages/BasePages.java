package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import testng.AddContactToHomeTest;


public class BasePages {
    public BasePages(){
        PageFactory.initElements(new AppiumFieldDecorator(AddContactToHomeTest.driver), this);
    }
}

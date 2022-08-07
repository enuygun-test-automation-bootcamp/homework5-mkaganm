package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;
import testng.ContactManagerOpenContactTest;

@Data
public class HomePage {

    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(ContactManagerOpenContactTest.Driver), this);
    }

    @AndroidFindBy(id = "android:id/title")
    private MobileElement homePageTitle;

    @AndroidFindBy(id = "showInvisible")
    private MobileElement invisibleCheck;

    @AndroidFindBy(id = "addContactButton")
    private MobileElement addContactButton;

}

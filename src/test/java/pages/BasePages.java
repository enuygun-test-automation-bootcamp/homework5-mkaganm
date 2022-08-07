package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;
import testng.AddContactToHomeTest;

@Data
public class BasePages {
    public BasePages(){
        PageFactory.initElements(new AppiumFieldDecorator(AddContactToHomeTest.driver), this);
    }
}

package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Data;

@Data
public class AddContactPage extends BasePages{

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.TextView")
    private MobileElement title;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Target Account\"]")
    private MobileElement targetAccountTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Contact Name\"]")
    private MobileElement contactNameTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Contact Phone\"]")
    private MobileElement contactPhoneTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Contact Email\"]")
    private MobileElement contactEmailTitle;

    @AndroidFindBy(id = "contactPhoneTypeSpinner")
    private MobileElement phoneTypeSpinner;

    @AndroidFindBy(id = "contactEmailTypeSpinner")
    private MobileElement emailTypeSpinner;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[1]")
    private MobileElement homeLabelPhone;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[2]")
    private MobileElement workLabelPhone;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[3]")
    private MobileElement mobileLabelPhone;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[1]")
    private MobileElement homeLabelEmail;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[2]")
    private MobileElement workLabelEmail;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[3]")
    private MobileElement mobileLabelEmail;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.TableLayout/android.widget.TableRow[6]/android.widget.Spinner/android.widget.TextView")
    private MobileElement phoneSpinnerText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.TableLayout/android.widget.TableRow[8]/android.widget.Spinner/android.widget.TextView")
    private MobileElement emailSpinnerText;

    @AndroidFindBy(id = "contactNameEditText")
    private MobileElement contactNameField;

    @AndroidFindBy(id = "contactPhoneEditText")
    private MobileElement contactPhoneField;

    @AndroidFindBy(id = "contactEmailEditText")
    private MobileElement contactEmailField;

    @AndroidFindBy(id = "contactSaveButton")
    private MobileElement saveButton;


}

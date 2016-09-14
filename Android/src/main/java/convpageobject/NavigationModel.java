package convpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 9/14/16.
 */
public class NavigationModel {

    private static final String navPath="//" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.view.ViewGroup[1]/";

    @FindBy(xpath=navPath+"android.widget.ImageButton[1]")
    public WebElement bnt_GoBack;

    @FindBy(xpath=navPath+"android.widget.TextView[1]")
    public WebElement txt_ConverterName;

    @FindBy(xpath=navPath+"android.support.v7.widget.dh[1]/android.widget.TextView[1]")
    public WebElement btn_Settings;

    @FindBy(xpath=navPath+"android.support.v7.widget.dh[1]/android.widget.TextView[2]")
    public WebElement btn_Search;

    public NavigationModel(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}

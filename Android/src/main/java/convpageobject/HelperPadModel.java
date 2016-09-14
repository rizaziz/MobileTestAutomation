package convpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 9/14/16.
 */
public class HelperPadModel {

    private static final String padPath="//" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.LinearLayout[2]/" +
            "android.widget.LinearLayout[2]";

    @FindBy(xpath = padPath+"/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]")
    public WebElement btn_BackSpace;

    @FindBy(xpath = padPath+"/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]")
    public WebElement btn_Switch;

    @FindBy(xpath = padPath+"/android.widget.RelativeLayout[1]"+"/android.widget.ImageButton[1]")
    public WebElement btn_Calculator;

    public HelperPadModel(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}

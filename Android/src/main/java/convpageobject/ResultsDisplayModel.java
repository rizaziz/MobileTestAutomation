package convpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 9/14/16.
 */
public class ResultsDisplayModel {

    private static final String dispPath="//" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.LinearLayout[1]";

    private static final String fromPath="";
    private static final String toPath="";

    @FindBy(xpath = dispPath+"android.widget.LinearLayout[1]/" +
                             "android.widget.RelativeLayout[1]/" +
                             "android.widget.EditText[1]")
    public WebElement disp_From;

    @FindBy(xpath = dispPath+"android.widget.LinearLayout[3]/" +
                             "android.widget.RelativeLayout[1]/" +
                             "android.widget.EditText[1]")
    public WebElement disp_To;

    public ResultsDisplayModel(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}

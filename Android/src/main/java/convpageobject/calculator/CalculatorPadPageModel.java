package convpageobject.calculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 9/14/16.
 */
public class CalculatorPadPageModel {

    private static final String path="//" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout[1]/" +
            "android.view.ViewGroup[1]/" +
            "android.widget.LinearLayout[1]/";

    private static final String navPath=path+"android.view.ViewGroup[1]";

    private static final String dispPath=path+"android.widget.RelativeLayout[1]";

    private static final String padPath=path+"android.widget.LinearLayout[1]";

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]")
    public WebElement btn_Devide;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]")
    public WebElement btn_Multiply;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]")
    public WebElement btn_Minus;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]")
    public WebElement btn_Plus;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]")
    public WebElement btn_7;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]")
    public WebElement btn_8;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]")
    public WebElement btn_9;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]")
    public WebElement btn_4;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]")
    public WebElement btn_5;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]")
    public WebElement btn_6;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]")
    public WebElement btn_1;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.RelativeLayout[2]")
    public WebElement btn_2;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.RelativeLayout[3]")
    public WebElement btn_3;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.RelativeLayout[1]")
    public WebElement btn_BackSpace;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.RelativeLayout[2]")
    public WebElement btn_0;

    @FindBy(xpath=padPath+"/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.RelativeLayout[3]")
    public WebElement btn_DecimalSeperator;

    @FindBy(xpath = dispPath+"/android.widget.RelativeLayout[1]")
    public WebElement disp_Expression;

    @FindBy(xpath = dispPath+"/android.widget.RelativeLayout[2]/android.widget.EditText[1]")
    public WebElement disp_Result;

    @FindBy(xpath = navPath+"/android.widget.ImageButton[1]")
    public WebElement nav_Back;

    @FindBy(xpath = navPath+"/android.widget.TextView[1]")
    public WebElement nav_Title;

    @FindBy(xpath = navPath+"/android.support.v7.widget.dh[1]/android.widget.TextView[1]")
    public WebElement nav__SendResult;

    public CalculatorPadPageModel(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}

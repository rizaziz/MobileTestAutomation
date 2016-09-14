package convpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 9/14/16.
 */
public class NumberPadModel {

    private static final String padPath="//" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.LinearLayout[2]/" +
            "android.widget.LinearLayout[1]";

    private static final String rowPath="android.widget.LinearLayout";
    private static final String btnPath="android.widget.RelativeLayout";

    @FindBy(xpath=padPath+rowPath+"[1]"+btnPath+"[1]")
    public WebElement btn_7;

    @FindBy(xpath=padPath+rowPath+"[1]"+btnPath+"[2]")
    public WebElement btn_8;

    @FindBy(xpath=padPath+rowPath+"[1]"+btnPath+"[3]")
    public WebElement btn_9;

    @FindBy(xpath=padPath+rowPath+"[2]"+btnPath+"[1]")
    public WebElement btn_4;

    @FindBy(xpath=padPath+rowPath+"[2]"+btnPath+"[2]")
    public WebElement btn_5;

    @FindBy(xpath=padPath+rowPath+"[2]"+btnPath+"[3]")
    public WebElement btn_6;

    @FindBy(xpath=padPath+rowPath+"[3]"+btnPath+"[1]")
    public WebElement btn_1;

    @FindBy(xpath=padPath+rowPath+"[3]"+btnPath+"[2]")
    public WebElement btn_2;

    @FindBy(xpath=padPath+rowPath+"[3]"+btnPath+"[3]")
    public WebElement btn_3;

    @FindBy(xpath=padPath+rowPath+"[4]"+btnPath+"[1]")
    public WebElement btn_PlusMinus;

    @FindBy(xpath=padPath+rowPath+"[4]"+btnPath+"[2]")
    public WebElement btn_0;

    @FindBy(xpath=padPath+rowPath+"[4]"+btnPath+"[3]")
    public WebElement btn_DecimalSeperator;

    public NumberPadModel(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


}

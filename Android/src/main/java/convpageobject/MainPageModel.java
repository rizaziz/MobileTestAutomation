package convpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by admin on 9/14/16.
 */
public class MainPageModel {

    private static final String genPath="//" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.widget.FrameLayout[1]/" +
            "android.widget.LinearLayout[1]/" +
            "android.support.v4.widget.DrawerLayout[1]/" +
            "android.view.ViewGroup[1]/" +
            "android.support.v4.view.ViewPager[1]/" +
            "android.widget.ScrollView[1]/" +
            "android.widget.RelativeLayout[1]/" +
            "android.support.v7.widget.RecyclerView[1]/" +
            "android.widget.LinearLayout";

    @FindBy(xpath = genPath+"[1]"+"/android.widget.FrameLayout[1]")
    public WebElement btn_Temperature;

    @FindBy(xpath = genPath+"[2]"+"/android.widget.FrameLayout[1]")
    public WebElement btn_Weight;

    @FindBy(xpath = genPath+"[3]"+"/android.widget.FrameLayout[1]")
    public WebElement btn_Length;

    @FindBy(xpath = genPath+"[4]"+"/android.widget.FrameLayout[1]")
    public WebElement btn_Speed;

    @FindBy(xpath = genPath+"[5]"+"/android.widget.FrameLayout[1]")
    public WebElement btn_Currency;

    @FindBy(xpath = genPath+"[6]"+"/android.widget.FrameLayout[1]")
    public WebElement btn_Volume;

    @FindBy(xpath = genPath+"[7]"+"/android.widget.FrameLayout[1]")
    public WebElement btn_Time;

    @FindBy(xpath = genPath+"[8]"+"/android.widget.FrameLayout[1]")
    public WebElement btn_Area;



    public MainPageModel(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}

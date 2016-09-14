package convtests;

import common.Base;
import convpageobject.*;
import org.testng.annotations.*;


public class AppMainPageFunctTesting  extends Base{

    MainPageModel cpsm=null;
    NavigationModel nm=null;

    @BeforeClass
    public void initCl(){

        cpsm=new MainPageModel(ad);
        nm=new NavigationModel(ad);

    }

    @Test
    public void testTempereatureButton(){
        cpsm.btn_Temperature.click();
    }

    @Test
    public void testWeightButton(){
        cpsm.btn_Weight.click();
    }

    @Test
    public void testLengthButton(){
        cpsm.btn_Length.click();
    }

    @Test
    public void testSpeedButton(){
        cpsm.btn_Speed.click();
    }

    @Test
    public void testAreaButton(){
        cpsm.btn_Area.click();
    }

    @Test
    public void testTimeButton(){
        cpsm.btn_Time.click();
    }

    @AfterMethod
    public void goMainPage(){
        nm.bnt_GoBack.click();
    }

}

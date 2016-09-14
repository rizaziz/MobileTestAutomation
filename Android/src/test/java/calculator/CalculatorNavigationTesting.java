package calculator;

import common.Base;
import convpageobject.HelperPadModel;
import convpageobject.MainPageModel;
import convpageobject.NavigationModel;
import convpageobject.calculator.CalculatorPadPageModel;
import org.testng.annotations.*;


/**
 * Created by admin on 9/14/16.
 */
public class CalculatorNavigationTesting extends Base{

    MainPageModel mpm=null;
    HelperPadModel hpm=null;
    CalculatorPadPageModel cppm=null;
    NavigationModel nm=null;

    @BeforeTest
    public void createNecessaryObjects(){
        mpm=new MainPageModel(ad);
        hpm=new HelperPadModel(ad);
        cppm=new CalculatorPadPageModel(ad);
        nm=new NavigationModel(ad);

    }

    @BeforeClass
    public void getCalcPage(){
        mpm.btn_Temperature.click();
        hpm.btn_Calculator.click();
    }

    @AfterClass
    public void goMainPage(){
        cppm.nav_Back.click();
        nm.bnt_GoBack.click();

    }

    @AfterMethod
    public void goCalcPage(){
        hpm.btn_Calculator.click();
    }

    @Test
    public void navigationBackButtonTest(){
        cppm.nav_Back.click();

    }

    @Test
    public void navigationSendResultButtonTest(){
        cppm.nav__SendResult.click();
    }

}

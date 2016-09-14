package calculator;

import common.Base;
import convpageobject.HelperPadModel;
import convpageobject.MainPageModel;
import convpageobject.NavigationModel;
import convpageobject.calculator.CalculatorPadPageModel;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by admin on 9/14/16.
 */
public class CalculatorElementsTesting extends Base {

    MainPageModel mpm=null;
    NavigationModel nm=null;
    HelperPadModel hpm=null;
    CalculatorPadPageModel cppm=null;

    @BeforeTest
    public void createNecessaryObjects(){
        mpm=new MainPageModel(ad);
        nm=new NavigationModel(ad);
        hpm=new HelperPadModel(ad);
        cppm=new CalculatorPadPageModel(ad);

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


    @Test
    public void btn_0ClickableTesting(){
        cppm.btn_0.click();
    }

    @Test
    public void btn_1ClickableTesting(){
        cppm.btn_1.click();
    }

    @Test
    public void btn_2ClickableTesting(){
        cppm.btn_2.click();
    }

    @Test
    public void btn_3ClickableTesting(){
        cppm.btn_3.click();
    }

    @Test
    public void btn_4ClickableTesting(){
        cppm.btn_4.click();
    }

    @Test
    public void btn_5ClickableTesting(){
        cppm.btn_5.click();
    }

    @Test
    public void btn_6ClickableTesting(){
        cppm.btn_6.click();
    }

    @Test
    public void btn_7ClickableTesting(){
        cppm.btn_7.click();
    }

    @Test
    public void btn_8ClickableTesting(){
        cppm.btn_8.click();
    }

    @Test
    public void btn_9ClickableTesting(){
        cppm.btn_9.click();
    }

    @Test
    public void btn_BackSpaceClickableTesting(){
        cppm.btn_BackSpace.click();
    }

    @Test
    public void btn_DecimalSeperatorClickableTesting(){
        cppm.btn_DecimalSeperator.click();
    }

    @Test
    public void btn_DevideClickableTesting(){
        cppm.btn_Devide.click();
    }

    @Test
    public void btn_MultiplyClickableTesting(){
        cppm.btn_Multiply.click();
    }

    @Test
    public void btn_PlusClickableTesting(){
        cppm.btn_Plus.click();
    }

    @Test
    public void btn_MinusClickableTesting(){
        cppm.btn_Minus.click();
    }

}

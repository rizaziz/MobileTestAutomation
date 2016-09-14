package calculator;

import common.Base;
import convpageobject.HelperPadModel;
import convpageobject.MainPageModel;
import convpageobject.ResultsDisplayModel;
import convpageobject.calculator.CalculatorPadPageModel;
import data.DataProviderClass;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static common.Base.ad;

/**
 * Created by admin on 9/14/16.
 */
public class CalculationAccuracyTesting extends Base {

    static CalculatorPadPageModel cppm=null;
    static MainPageModel mpm=null;
    static HelperPadModel hpm=null;

    @BeforeClass
    public void initObjects(){
        cppm=new CalculatorPadPageModel(ad);
        mpm=new MainPageModel(ad);
        hpm=new HelperPadModel(ad);

        mpm.btn_Temperature.click();
        hpm.btn_Calculator.click();

    }

    @AfterMethod
    public void clear(){
        cppm.nav_Back.click();
        hpm.btn_Calculator.click();
    }

    @Test(dataProviderClass = DataProviderClass.class, dataProvider = "plus")
    public void plusOperationAccuracyTesting(double operand1, double operand2, double expected){
        clickMultiDigitNumber(operand1);
        cppm.btn_Plus.click();
        clickMultiDigitNumber(operand2);
        Assert.assertEquals(Double.parseDouble(cppm.disp_Result.getText()), expected, 0.01);
    }

    @Test(dataProviderClass = DataProviderClass.class, dataProvider = "minus")
    public void minusOperationAccuracyTesting(double operand1, double operand2, double expected){
        clickMultiDigitNumber(operand1);
        cppm.btn_Minus.click();
        clickMultiDigitNumber(operand2);
        Assert.assertEquals(Double.parseDouble(cppm.disp_Result.getText()), expected, 0.01);
    }

    @Test(dataProviderClass = DataProviderClass.class, dataProvider = "multiply")
    public void multiplyOperationAccuracyTesting(double operand1, double operand2, double expected){
        clickMultiDigitNumber(operand1);
        cppm.btn_Multiply.click();
        clickMultiDigitNumber(operand2);
        Assert.assertEquals(Double.parseDouble(cppm.disp_Result.getText()), expected, 0.01);
    }

    @Test(dataProviderClass = DataProviderClass.class, dataProvider = "divide")
    public void divideOperationAccuracyTesting(double operand1, double operand2, double expected){
        clickMultiDigitNumber(operand1);
        cppm.btn_Devide.click();
        clickMultiDigitNumber(operand2);
        Assert.assertEquals(Double.parseDouble(cppm.disp_Result.getText()), expected, 0.01);
    }


    public static void clickMultiDigitNumber(double number){

        char[] ch=String.valueOf(number).toCharArray();

        for(char c:ch){

            switch(c){

                case '0': cppm.btn_0.click(); break;
                case '1': cppm.btn_1.click(); break;
                case '2': cppm.btn_2.click(); break;
                case '3': cppm.btn_3.click(); break;
                case '4': cppm.btn_4.click(); break;
                case '5': cppm.btn_5.click(); break;
                case '6': cppm.btn_6.click(); break;
                case '7': cppm.btn_7.click(); break;
                case '8': cppm.btn_8.click(); break;
                case '9': cppm.btn_9.click(); break;
                case '.': cppm.btn_DecimalSeperator.click(); break;

            }
        }
    }

}

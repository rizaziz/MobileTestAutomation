package data;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by admin on 9/14/16.
 */
public class DataProviderClass {

    static Object[][] data=null;
    static final String path="/Users/admin/IdeaProjects/Venus/Android/external_data/TestData.xls";
    static FileInputStream fis=null;
    static HSSFWorkbook wkb=null;
    static HSSFSheet sheet=null;

    @DataProvider(name="plus")
    public static Object[][] getDataPlus(){

        try{
            fis=new FileInputStream(path);
            wkb=new HSSFWorkbook(fis);
            sheet=wkb.getSheet("PlusOperationData");

            int rowsCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
            data=new Object[rowsCount][3];

            HSSFRow row=null;

            for(int i=0; i<rowsCount; i++){

                row=sheet.getRow(i+1);

                data[i][0]=row.getCell(0).getNumericCellValue();
                data[i][1]=row.getCell(1).getNumericCellValue();
                data[i][2]=row.getCell(2).getNumericCellValue();
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(wkb!=null){
                    wkb.close();
                }
            }catch(IOException e){}
            try{
                if(fis!=null){
                    fis.close();
                }
            }catch(IOException e){}
        }

        return data;

    }

    @DataProvider(name="minus")
    public static Object[][] getDataMinus(){

        try{
            fis=new FileInputStream(path);
            wkb=new HSSFWorkbook(fis);
            sheet=wkb.getSheet("PlusOperationData");

            int rowsCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
            data=new Object[rowsCount][3];

            HSSFRow row=null;

            for(int i=0; i<rowsCount; i++){

                row=sheet.getRow(i+1);

                data[i][0]=row.getCell(0).getNumericCellValue();
                data[i][1]=row.getCell(1).getNumericCellValue();
                data[i][2]=row.getCell(3).getNumericCellValue();
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(wkb!=null){
                    wkb.close();
                }
            }catch(IOException e){}
            try{
                if(fis!=null){
                    fis.close();
                }
            }catch(IOException e){}
        }

        return data;

    }

    @DataProvider(name="multiply")
    public static Object[][] getDataMultiply(){

        try{
            fis=new FileInputStream(path);
            wkb=new HSSFWorkbook(fis);
            sheet=wkb.getSheet("PlusOperationData");

            int rowsCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
            data=new Object[rowsCount][3];

            HSSFRow row=null;

            for(int i=0; i<rowsCount; i++){

                row=sheet.getRow(i+1);

                data[i][0]=row.getCell(0).getNumericCellValue();
                data[i][1]=row.getCell(1).getNumericCellValue();
                data[i][2]=row.getCell(4).getNumericCellValue();
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(wkb!=null){
                    wkb.close();
                }
            }catch(IOException e){}
            try{
                if(fis!=null){
                    fis.close();
                }
            }catch(IOException e){}
        }

        return data;

    }

    @DataProvider(name="divide")
    public static Object[][] getDataDivide(){

        try{
            fis=new FileInputStream(path);
            wkb=new HSSFWorkbook(fis);
            sheet=wkb.getSheet("PlusOperationData");

            int rowsCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
            data=new Object[rowsCount][3];

            HSSFRow row=null;

            for(int i=0; i<rowsCount; i++){

                row=sheet.getRow(i+1);

                data[i][0]=row.getCell(0).getNumericCellValue();
                data[i][1]=row.getCell(1).getNumericCellValue();
                data[i][2]=row.getCell(5).getNumericCellValue();
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(wkb!=null){
                    wkb.close();
                }
            }catch(IOException e){}
            try{
                if(fis!=null){
                    fis.close();
                }
            }catch(IOException e){}
        }

        return data;

    }

    public static void main(String[] args){
        System.out.println(Arrays.deepToString(DataProviderClass.getDataPlus()));
        System.out.println(Arrays.deepToString(DataProviderClass.getDataMinus()));
        System.out.println(Arrays.deepToString(DataProviderClass.getDataMultiply()));
        System.out.println(Arrays.deepToString(DataProviderClass.getDataDivide()));
    }

}

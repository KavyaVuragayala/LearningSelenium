package com.kavya.C13_DataDrivenTesting_POI;

import com.kavya.utils.UtilExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P2_DDT2_TestNG_POI {

    @Test(dataProvider = "getDataExcel")
    public static void test_vwo_ddt(String username , String password){
        System.out.println(username +"-"+ password);
        System.out.println();
    }

    @DataProvider
    public Object[][] getDataExcel(){
        // read data from Excel
        //convert to 2D array Object
        //return that array
        return UtilExcel.getTestDataFromExcel("sheet1"); // will return 2D array
    }
}

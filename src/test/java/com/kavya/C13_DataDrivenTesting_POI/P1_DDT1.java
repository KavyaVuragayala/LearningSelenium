package com.kavya.C13_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P1_DDT1 {


   @Test(dataProvider = "getData")
    public static void test_vwo(String username,String password){

       System.out.println("Running");
       System.out.println(username + "-"+ password);

   }


     // excel - 2D file with rows and columns
    // create a function with 2D
    // this function is providing data so testng should know

    @DataProvider
    public Object[][] getData(){
       //dummy data
        return new Object[][]{
                new Object[]{"admin@admin.com","password123"},
                new Object[]{"admin@admin.com","password123"},
                new Object[]{"admin@admin.com","password123"},
                new Object[]{"admin@admin.com","password123"}

        };
    }

}


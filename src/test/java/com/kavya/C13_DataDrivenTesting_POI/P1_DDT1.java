package com.kavya.C13_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P1_DDT1 {

    @Test(dataProvider = "getData")
    public static void ddt(String username,String password,String ER){

            System.out.println("Running  ");
            System.out.println(username + " - " + password +" - "  +ER);
            System.out.println();
        }

        //
        @DataProvider
        public Object[][] getData(){
            return new Object[][]{
                    new Object[]{"admin@admin.com","pwd123","Expected Result 1"},
                    new Object[]{"admin@admin.com","pwd123","Expected Result 2"},
                    new Object[]{"admin@admin.com","pwd123","Expected Result 3"}
            };
        }
    }


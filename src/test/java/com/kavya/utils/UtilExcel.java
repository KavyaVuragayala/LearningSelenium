package com.kavya.utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class UtilExcel {

    // file path
    //System.getProperty("user.dir") = C:/Users/pc/IdeaProjects/LearningSelenium
    public static String sheet_Path = System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx";
    static Workbook workbook;
    static Sheet sheet;

    public static Object[][] getTestDataFromExcel(String sheetName){

        // this has to read the data - testdata.xlsx
        // 1. create workbook
        // 2. work with sheet
        // 3. reading data from rows and column
        // 4. convert to 2D - getData()

        //reading a file
        FileInputStream fileInputStream= null;
        try{
            fileInputStream = new FileInputStream(sheet_Path);
            workbook = WorkbookFactory.create(fileInputStream); // creates a temporary copy only
            sheet = workbook.getSheet(sheetName);

        }catch(IOException e){
            System.out.println("File Not found");
        }

        // fetch the data from sheet ie row and column
        Object[][] data =new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        // put the data
        for(int i=0;i<sheet.getLastRowNum();i++){
            for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){

                // first username , password -> coulmn name skip -> i+1
                data[i][j]=sheet.getRow(i+1).getCell(j).toString();
            }
        }

        return data;
    }
}

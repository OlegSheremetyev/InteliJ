package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        //location of file
        String path="/Users/macbookpro/Documents/SDETBatch13.xlsx";
        //navigate to this file
        FileInputStream fileInputStream=new FileInputStream(path);
        //class that understands how excel work
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
//excel files are devided in sheets we can access by providing its name
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        //sheets have rows and cells (columns) we need to specify the row and cell number
        //rows start from index 0 columns strat from index 1

        Row row=sheet.getRow(1);
        Cell cell=row.getCell(0);
       // System.out.println(row);
        System.out.println(cell);
        fileInputStream.close();


    }
}

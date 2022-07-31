package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        //location of file
        String path = "/Users/macbookpro/Documents/SDETBatch13.xlsx";
        //navigate to this file
        FileInputStream fileInputStream = new FileInputStream(path);
        //class that understands how excel work
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
//excel files are devided in sheets we can access by providing its name
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        int NoOfRows = sheet.getPhysicalNumberOfRows();
        System.out.println(NoOfRows);
        for (int i = 0; i < NoOfRows; i++) {
           // System.out.println(sheet.getRow(i));
            Row row =sheet.getRow(i);
           // Cell cell=row.getCell(0);
            int noOfCells=row.getPhysicalNumberOfCells();
            for(int j=0;j<noOfCells;j++){
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }
        fileInputStream.close();
    }
}
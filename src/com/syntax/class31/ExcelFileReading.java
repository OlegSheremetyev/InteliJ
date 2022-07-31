package com.syntax.class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileReading {
    public static void main(String[] args) throws IOException {


        String path = "/Users/macbookpro/IdeaProjects/SDETBatch13/Files/SDETBatch13.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        //how many rows contain the data in a sheet
        int noOfRows = sheet.getPhysicalNumberOfRows();
        //we will store the data of cells in the map and will store those maps in a list
        List<Map<String, String>> excelData = new ArrayList<>();
        HashMap<String, String> rowData;
        //contains all the keys that we will use in map
        Row headerRow = sheet.getRow(0);

        for (int i = 1; i < noOfRows; i++) {
            Row row = sheet.getRow(i);
            rowData = new HashMap<>();
            //how many cells contain the data in a row
            int noOfCells = row.getPhysicalNumberOfCells();
            /*
            below loop prints all the data from cells in a single line
             */
            for (int j = 0; j < noOfCells; j++) {
                rowData.put(headerRow.getCell(j).toString(), row.getCell(j).toString());
            }
            excelData.add(rowData);
        }

        System.out.println(excelData);



        fileInputStream.close();

    }}

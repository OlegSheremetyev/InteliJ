package com.syntax.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ExcelHw {
    public static void main(String[] args) throws IOException {
String path="/Users/macbookpro/IdeaProjects/SDETBatch13/Files/HW.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("browser"));

    }
}

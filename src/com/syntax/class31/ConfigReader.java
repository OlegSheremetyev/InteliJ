package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static  Properties read (String path) throws IOException {
        //navigate to that location
        FileInputStream fileInputStream=new FileInputStream(path);
        //Properties class that handles the .properties files
        Properties properties=new Properties();
        //loads the data from the hardDrive to Ram
        properties.load(fileInputStream);
        return properties;



    }
}
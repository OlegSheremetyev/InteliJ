package com.syntax.class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo {
    public static void main(String[] args) throws IOException {
        //this demo shows how to read Properties file
        //1 we need to know the path/location of that file
        String path="Files/Config.properties";
        //we need to have a special software that understand that file that we can use to open and edit that file
        //Navigation to that path where file is stored
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        //loading all the data from the file inside the properties objects
        properties.load(fileInputStream);
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("Url"));
    }
}

package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public  static Properties read(String path)  {


        Properties properties = new Properties();
        FileInputStream fileInputStream=null;

        try {

         fileInputStream = new FileInputStream(path);


           properties.load(fileInputStream);
           return properties;
       }catch(IOException io){
           System.out.println("Please check the file at this path if it is present : "+path);
       }finally {
           if(fileInputStream!=null){
               try {fileInputStream.close();

               }
               catch (IOException ioException){
                   System.out.println("Error while closing the file");
               }
           }


        }
       return properties;



    }
}

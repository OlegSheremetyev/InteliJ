package com.syntax.homework.Interfaces;
/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public class Interfaces {
    interface Webdriver{
        void openBrowser();
        void closeBrowser();
        void maximizeWindow();
        void findElement();

    }
    static class ChromeDriver implements Webdriver{

        @Override
        public void openBrowser() {
            System.out.println("Opening Ch browser");

        }

        @Override
        public void closeBrowser() {
            System.out.println("Closing Ch browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximizing  Ch browser window");

        }

        @Override
        public void findElement() {
            System.out.println("Finds element in Ch browser");

        }
    }
    static class FirefoxDriver implements Webdriver{

        @Override
        public void openBrowser() {
            System.out.println("Closing FF browser");

        }

        @Override
        public void closeBrowser() {
            System.out.println("Closing FF browser");

        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximizing  FF browser window");


        }

        @Override
        public void findElement() {
            System.out.println("Finds element in FF browser");

        }
    }

    public static void main(String[] args) {
        Webdriver[] webdriver={new ChromeDriver(), new FirefoxDriver()};

        for (Webdriver webdriver1:webdriver){
            webdriver1.openBrowser();
            webdriver1.closeBrowser();
            webdriver1.maximizeWindow();
            webdriver1.findElement();
        }


    }
}

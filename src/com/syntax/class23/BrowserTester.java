package com.syntax.class23;

public class BrowserTester {
    public static void main(String[] args) {
        /*Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.openUrl("www.google.com");
        chrome.closeBrowser();
        Firefox firefox=new Firefox();
        firefox.startBrowser();
        firefox.openUrl("www.google.com");
        firefox.closeBrowser();

         */
   // WebDriver chrome=new Safari();
    //chrome.startBrowser();
    //chrome.openUrl("www.google.com");
    //chrome.closeBrowser();
    WebDriver[] browsers={new Chrome(),new Safari(),new Firefox(),new IE()};
    //for(WebDriver driver:browsers){
        //driver.startBrowser();
       // driver.openUrl("www.google.com");
        //driver.closeBrowser();
        for(int i=0;i< browsers.length;i++){
            browsers[i].startBrowser();
            browsers[i].openUrl("www.google.com");
            browsers[i].testLoadingPage();
            browsers[i].closeBrowser();


    }
    }

}

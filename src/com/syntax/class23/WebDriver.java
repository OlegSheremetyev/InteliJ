package com.syntax.class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting browser");
    }
    public void openUrl(String url){
        System.out.println("opening "+url);
    }
    public void testLoadingPage(){
        System.out.println("checking if login age is visible");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening google chrome");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening url "+url+" on chrome");
    }

    @Override
    public void testLoadingPage() {
        System.out.println("testing login page on chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the google chrome");
    }
}
class Firefox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting  firefox");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening url "+url+" on firefox");
    }

    @Override
    public void testLoadingPage() {
        System.out.println("testing login page on firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the google firefox");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting  Safari");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening url "+url+" on Safari");
    }

    @Override
    public void testLoadingPage() {
        System.out.println("testing login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the  Safari");
    }
}
class IE extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting  IE");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening url "+url+" on IE");
    }

    @Override
    public void testLoadingPage() {
        System.out.println("testing login page on IE");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the  IE");
    }
}
package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
        //Car car=new Tesla();
       // car=new Toyota();
       // car.start();
        /*BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();
        Tesla tesla=new Tesla();
        tesla.start();
        tesla.park();
        tesla.stop();
        Toyota toyota=new Toyota();
        toyota.start();
        toyota.stop();
        toyota.park();
         */
        Car car=new Tesla();
        car.start();
        car.start();
        car.park();
        Car[] cars={new BMW(),new Tesla(),new Toyota()};
        for(Car c:cars){
            c.start();
            c.stop();
            c.park();
        }

    }
}

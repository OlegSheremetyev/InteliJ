package com.syntax.homework.OverridingOverloading;

import javax.imageio.stream.ImageInputStream;

///*
//Create 1 class in which create a methods that will calculate the area (volume in case of box) of
//Rectangle
//Square
//Box
// */
public class OverloadingTask1 {
  static  void area(double length,double width){
        System.out.println("Area of Rectangle "+(length*width));
    }
      static  void area(double length){
            System.out.println("Area "+(length*length));
        }
      static  void volume(double len, double wid,double hi){
            System.out.println("Volume is "+(len*wid*hi));

    }

    public static void main(String[] args) {
        area(10);
    }
}

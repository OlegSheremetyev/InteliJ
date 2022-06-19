package com.syntax.class19;

public class Laptop {
    String make;
    String model;
    String storage;
    String memory;
    double screenSize;
    public Laptop(){
        System.out.println("Basic construction is happening");
    }


    public Laptop(String make, String model, String storage, String memory, double screenSize) {
        this.make = make;
        this.model = model;
        this.storage = storage;
        this.memory = memory;
        this.screenSize = screenSize;
    }
    public Laptop(String make, String model, String storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;

        this.screenSize = screenSize;
}
    public Laptop(String make, String model) {
        this.make = make;
        this.model = model;
        this.storage = storage;
        this.memory = memory;
        this.screenSize = screenSize;}
    public Laptop(String make, String model, String memory, double screenSize) {
        //this.make = make;
       // this.model = model;
        this(make,model);
        this.storage = storage;
        this.memory = memory;
        this.screenSize = screenSize;}

    public static void main(String[] args) {
        Laptop app=new Laptop("Apple","Pro","512","512",1200);
    }}
package com.syntax.class19;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;

    public Cow(String breed, String color, int age, double weight) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

        }
    public String getCowInfo() {
        return "Breed " + breed + " Color " + color + " Age " + age + " weight " + weight;
    }
}

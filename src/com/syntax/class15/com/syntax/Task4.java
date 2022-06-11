package com.syntax.class15.com.syntax;

public class Task4 {
    void sayHello(String country) {
        String hello;
        switch (country) {
            case "Usa":
                hello = "Hola";
                break;
            case "Russia":
                hello = "Privet";
                break;
            case "France":
                hello = "Bonjour";
                break;
            case "Pakistan":
                hello = "Assalam o Alykum";
                break;
            case "India":
                hello = "Namasty";
                break;
            default:
                hello = "country not found";
        }
        System.out.println(hello);
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.sayHello("France");

    }


        }


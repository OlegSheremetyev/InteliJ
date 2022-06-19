package com.syntax.class16;

public class AccessModifiresDemo1 {
    private String password="pass123";
    public int ssn=123456;
    public String name="Karla";

    public static void main(String[] args) {
        AccessModifiresDemo1 ac= new AccessModifiresDemo1();
        System.out.println(ac.password);
        System.out.println(ac.ssn);
        System.out.println(ac.name);

    }
}

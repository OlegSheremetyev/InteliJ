package Replits;
/*
declare 3 instance variables to hold an integer, double and char values.
Create 2 instances of the class and assign values to variables and the print them
Expected Output:
10
10.23
a
100
100.23
s
 */


public class Replit121 {
    int number;
    double num;
    char character;
    public static void main(String[] args) {
      Replit121 m = new Replit121();
        m.number = 10;
        m.num = 10.23;
        m.character = 'a';
        System.out.println(m.number);
        System.out.println(m.num);
        System.out.println(m.character);
        Replit121 x = new Replit121();
        x.number = 100;
        x.num = 100.23;
        x.character = 's';
        System.out.println(x.number);
        System.out.println(x.num);
        System.out.println(x.character);
    }
}


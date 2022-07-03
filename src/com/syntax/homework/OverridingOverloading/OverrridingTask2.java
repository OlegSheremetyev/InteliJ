package com.syntax.homework.OverridingOverloading;

public class OverrridingTask2 {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(100,15);
        creditCard.calculateInterest();
        Visa visa=new Visa(200,20);
        visa.calculateInterest();
        AX ax=new AX(100,15);
        ax.calculateInterest();
    }
}
class CreditCard{
    double balance;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    double interest;

    public  void calculateInterest(){
        System.out.println("Interest "+(balance*interest/100));


    }
}
class Visa extends CreditCard{
    Visa(double balance,double interest){
        super(balance,interest);
    }
}
class AX extends CreditCard{

    public AX(double balance, double interest) {
        super(balance, interest);
    }
    public void calculateInterest(){
        System.out.println("Interest "+(balance*interest/100+5));
    }
}
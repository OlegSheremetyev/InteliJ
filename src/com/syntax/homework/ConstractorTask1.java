package com.syntax.homework;
/*
/*
Write program: userClass  that has a constructor that
initializes instance variable name and mobile number.
Create a subclass  userInfo that will have user address variable
and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method. Test your code.
 */


public class ConstractorTask1 {
}
class UserClass{
    String name;
    String mobileNumber;

    public UserClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends UserClass{
    String userAddress;


    public UserInfo(String name, String mobileNumber,String userAddress) {
        super(name, mobileNumber);
            this.userAddress = userAddress;

    }
    void printInfo(){
        System.out.println("name "+name+" mobile number "+mobileNumber+" User addresse "+userAddress);
    }
}

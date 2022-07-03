package review08;

import javax.print.Doc;

public class Doctor {
//variables instance
    String firstName, lastName, speciality;
    int experience;
    double salary;
    static  String hospital;

    public Doctor(String firstName,String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;

    }
Doctor(String firstName,String lastName,String speciality,int experience){
        this(firstName,lastName);
        this.speciality=speciality;
        this.experience=experience;

}
//method
void printInfo(){
    System.out.println("Doctor's name is "+firstName+" "+lastName+" and speciality is  "+speciality);
}
void work(){
    System.out.println("Doctor's last name "+lastName+" works at "+hospital);
}
}

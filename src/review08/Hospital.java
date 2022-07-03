package review08;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc= new Doctor("Jane","Smith");
        System.out.println(doc.firstName);
        System.out.println(doc.lastName);
       Doctor.hospital="UCSF";
       doc.printInfo();
       doc.work();
        System.out.println("=================================================");
       Doctor doc1=new Doctor("Joe","Doe","cardiologyst",10);
       doc1.printInfo();
       doc1.work();
        System.out.println("changing static variable");
        //changing static variable
        doc1.hospital="George Washington";
        doc.work();
        doc1.work();
        System.out.println("changing value of instance variable");
        //changing value of instance variable
        doc.lastName="Obama";
        doc.printInfo();
        doc1.printInfo();

    }
}

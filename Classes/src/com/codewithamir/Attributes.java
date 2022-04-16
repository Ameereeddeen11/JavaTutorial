package com.codewithamir;

public class Attributes {
    int x = 657;
    int y;
    int z = 35;
    //final int a = 438;


    int n = 5;

    String fname = "Abdullaev";
    String lname =  "Amiriddin";
    int age = 17;
    public static void main(String[] args) {
        Attributes myObj_2 = new Attributes();
        System.out.println(myObj_2.x);

        //Modify Attributes
        Attributes myObj_3 = new Attributes();
        myObj_3.y = 69;
        System.out.println(myObj_3.y); //will print 69

        Attributes myObj_4 = new Attributes();
        myObj_3.z = 76; //now it is 76
        System.out.println(myObj_4.z);

        /* Attributes myObj_5 = new Attributes();
        myObj_5.a = 548; // it will generate an error: connot assign a value to a final variable
        System.out.println(myObj_5.a); */


        //Multiple objects
        Attributes myObj1 = new Attributes();  //Object 1
        Attributes myObj2 = new Attributes();  //Object 2
        myObj2.n = 78;
        System.out.println(myObj1.n);  //will print 5
        System.out.println(myObj2.n);    //will print 65


        //Multiple attributes
        Attributes myObj = new Attributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}

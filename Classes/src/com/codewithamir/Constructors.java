package com.codewithamir;

import com.sun.tools.javac.Main;

public class Constructors {
    int x;   //Create a class attribute

    public Constructors() {
        x = 34;  //Set the initial value for the class attribute x
    }


    //Constructor parameters

    int modelYear;  //Create a class attribute
    String modelName;  //Create a class attribute

    //Create a class constructor for the Constructors class
    public Constructors(int year, String name) {

        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructors myObj = new Constructors();     //Create an object of class Constructs (this will call constructor)
        System.out.println(myObj.x);  //Print the value of x

        //Constructor parameters
        Constructors myCar = new Constructors(2018, "BMW I8");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }

}

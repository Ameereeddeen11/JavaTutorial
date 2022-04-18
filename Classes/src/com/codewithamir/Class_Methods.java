package com.codewithamir;

import com.sun.tools.javac.Main;

public class Class_Methods {
    //This is method
    static void myMethod() {
        System.out.println("Hello Amir");
    }

    //Static vs Non=Static Methods

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Access Methods with an object
    //create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    //Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    //multiple class
    public void multipleMethod1() {
        System.out.println("The moto is going as fast as it can!");
    }

    public void ClassSpeed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        myMethod();  //will print Hello Amir
        myStaticMethod(); //call the static method
        //if I will write myPublicMethod(); This would compile an error

        Class_Methods myObj = new Class_Methods();  // Create an object of Class_Method
        myObj.myPublicMethod();  // Call the public method on the object

        Class_Methods myCar = new Class_Methods();  //Create a myCar object
        myCar.fullThrottle();    //Call the fullThrottle() method
        myCar.speed(300);    //Call the speed() method
    }
}

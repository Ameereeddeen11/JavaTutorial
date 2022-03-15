package com.codewithamir;

public class Java_Arrays {
    public static void main(String[] args) {
        //Access the element of an array
        String[] cars = {"Audi", "BMW", "Mercedes-Benz"};
                        //  0      1            2
        System.out.println(cars[1]);
        //print BMW

        //Change an array element
        String[] brand = {"Audi", "BMW", "Mercedes-Benz"};
        brand[0] = "Ford";
        System.out.println(brand[0]);
        //Now it will print Ford

        //Array length
        String[] auto = {"Audi", "BMW", "Mercedes-Benz", "Ford"};
        System.out.println(auto.length);
        //print 4
    }
}

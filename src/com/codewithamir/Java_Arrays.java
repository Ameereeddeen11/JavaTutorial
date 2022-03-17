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


        //Arrays loop
        String[] cars_x = {"Audi", "BMW", "Mercedes-Benz", "Ford"};
        for (int i = 1; i < cars_x.length; i++) {
            System.out.println(cars_x[i]);
        }
        //it will not print Audi and others will


        //loop though an array with for-each
        //it is used exclusively to loop through elements in arrays
        System.out.println("This is Loop through an array with for-each");
        String[] cars_y = {"Audi", "BMW", "Mercedes-Benz", "Ford", "Volvo"};
        for (String y : cars){
            System.out.println(y);
        }

    }
}

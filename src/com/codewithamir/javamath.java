package com.codewithamir;

public class javamath {
    public static void main(String[] args) {
        System.out.println(Math.max(34, 587));
        //Math.min(x,y) can find the lowest value of x and y

        System.out.println(Math.sqrt(256));  //sqrt ---> square

        System.out.println(Math.abs(-2.6));  // returns the absolute (positive) value of x

        System.out.println(Math.random());   //returns a random number between 0.0 and 1.0

        int randomNum = (int)(Math.random() * 101);  //returns a random number between 0 to 100
        System.out.println(randomNum);
    }
}

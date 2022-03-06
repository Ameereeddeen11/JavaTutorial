package com.codewithamir;

public class Main {

    public static void main(String[] args) {
        // this is single-line commet
        /* this is multi-line commet */
        System.out.println("Hello world");
        // variables string, int, float
        // string
        String name = "Amir";
        System.out.println(name);

        // int
        int myNum = 15;
        System.out.println(myNum);

        // float
        float myFloatNum = 54.3f;
        System.out.println(myFloatNum);

        // display variables
        String text = "Amir";
        System.out.println("Hello " + text);

        String firstName = "Amiriddin ";
        String lastName = "Abdullaev";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 63;
        int y = 89;
        int z = 32;
        System.out.println(x + y + z);

        // java type casting
        // widening cating
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        // narrowing casting
        double myDouble2 = 8.32;
        int myInt2 = (int) myDouble; // casting double to int
        System.out.println(myDouble2);
        System.out.println(myInt2);

        // java operators
        /*
         * example: int e = 5678 + 243;
         * System.out.println(e);
         */

    }
}

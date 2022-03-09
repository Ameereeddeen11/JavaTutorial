package com.codewithamir;

public class java_if_else {
    public static void main(String[] args) {
        //the if statement
        int x = 2456;
        int y = 8765;
        if (x < y) {
            System.out.println("x is greater than y");
        }
        //the same is if you write if (43 > 32) {...}

        //the else statement
        int z = 3654;
        if (z > 6770) {
            System.out.println("Good day");
        }  else  {
            System.out.println("Good evening");
        } //print "good evening"

        //the else if statement
        int time = 54;
        if (time < 96) {
            System.out.println("good morning");
        }  else if (time < 65) {
            System.out.println("Good day");
        } else {
            System.out.println("good evening");
        }  //print "good evening"

        //short hand if...else
        int zone = 3854;
        String javob = (zone > 7098) ? "good day" : "good evening";
        System.out.println(javob);
    }
}

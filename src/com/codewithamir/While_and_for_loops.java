package com.codewithamir;

import java.awt.desktop.SystemSleepEvent;

public class While_and_for_loops {
    public static void main(String[] args) {
        int x = 0;
        while (x < 17){
            System.out.println(x);
            x++;
        }
        System.out.println("End of while loop");
        //The do/while loop ---> The loop will always be executed at least once,
                                // even if the condition is false,
                                // because the code block is executed before the condition is tested
        int y = 4;
        do {
            System.out.println(y);
            y++;
        }
        while (y < 17);
        System.out.println("End of Do/While loop");

        //Java For Loop
        for (int z = 2; z <= 20; z = z + 3){
            System.out.println(z);
        }
        System.out.println("End of for loop");

        //for-each loop
        String[] cars = {"Audi", "BMW", "Mercedes-Benz", "Ford"};
        for (String a : cars) {
            System.out.println(a);
        }
        System.out.println("End of for-each loop");
    }
}

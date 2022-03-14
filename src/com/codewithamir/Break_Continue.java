package com.codewithamir;

public class Break_Continue {
    public static void main(String[] args) {
        //Java break
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;

            }
            System.out.println(i);
        }

        //Java Continue
        System.out.println("This is Java Continue");
        for (int x = 3; x < 15; x++){
            if (x == 8) {
                continue;
            }
            System.out.println(x);
        }

        //Break and Continue in while loop
        System.out.println("This is the break in while loop");
        int a = 5;
        while (a < 12) {
            System.out.println(a);
            a++;
            if (a == 8) {
                break;
            }
        }

        System.out.println("This is the continue");
        int b = 2;
        while (b < 9) {
            if (b == 6) {
                b++;
                continue;
            }
            System.out.println(b);
            b++;
        }
    }
}

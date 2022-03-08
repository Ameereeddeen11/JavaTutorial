package com.codewithamir;

import java.util.Locale;

public class strings {
    public static void main(String[] args) {
        //Method
            // length
            String text = "qwertyuiopasdfg";
            System.out.println("The length of the text sting is: " + text.length());
            //Upper case
            String txt = "Amiriddin";
            System.out.println(txt.toUpperCase(Locale.ROOT));
            System.out.println(txt.toLowerCase(Locale.ROOT));


            //string concatenation
            String lastName = "Abdullaev";
            String firstName = "Amiriddin ";
            System.out.println(firstName.concat(lastName));

            /* /n new line
            * /r
            * /t
            * /b
            * /f
            */
    }
}

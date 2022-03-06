package com.codewithamir;

public class operators {
    public static void main(String[] args) {
        // += ---> x + = 4 ---> x = x + 4 or -= ---> x - = 4 ---> x = x - 4 the same is
        // with a * and /
        int x = 39;
        x += 4;
        System.out.println(x);

        // %= ---> x % = 7 ---> x = x % 7 or
        int y = 73;
        y %= 4;
        System.out.println(y);

        /*
         * == --> equal to
         * != --> not equal
         * > --> greater than
         * < --> less than
         * >= --> greater than or equal to
         * <= --> less than or equal to
         */

        // Logical
        // && returns true if both statements are true
        int z = 23;
        System.out.println(z > 3 && z < 30); // returns true because 23 is greater than 3 AND 23 is less than 30

        // || returns true if one of the statements is true
        int a = 46;
        System.out.println(a > 4 || a < 39); // returns true because one of the conditions are true (46 is greater than
                                             // 4, but 39 is not less than 46)

        // ! reverse the result returns false if the result is true
        int b = 89;
        System.out.println(!(b > 42 && b < 99));
    }
}

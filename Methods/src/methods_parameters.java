public class methods_parameters {
    //this method has one parameter
    public static class method_parameters {
        static int myMethod(int x) {
            return 5 + x;
        }
    }
    //this method has two parameters
    public static class Main {
        static int myMethod_2(int a, int b) {
            return a + b;
        }
    }
    //this method store the result in a variable
    public class Main_2 {
        static int myMethod_3(int c, int d) {
            return c + d;
        }
    }

    //this is method with if else statements
    public class Test {
        static void checkAge(int age) {
            if (age < 18) {
                System.out.println("Access denied - You are not old enough");
            } else {
                System.out.println("Access granted - You are old enough");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Main.myMethod_2(7, 34));
        System.out.println(method_parameters.myMethod(3));
        //can also store the result in a variable
        int z = Main_2.myMethod_3(34, 65);
        System.out.println(z);
        //with if else methods
        Test.checkAge(39);
    }
}


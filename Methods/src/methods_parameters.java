public class methods_parameters {
    public static class method_parameters {
        static int myMethod(int x) {
            return 5 + x;
        }
    }

    public static class Main {
        static int myMethod_2(int a, int b) {
            return a + b;
        }
    }

    public class Main_2 {
        static int myMethod_3(int c, int d) {
            return c + d;
        }
    }

    public static void main(String[] args) {
        System.out.println(Main.myMethod_2(7, 34));
        System.out.println(method_parameters.myMethod(3));
        int z = Main_2.myMethod_3(34, 65);
        System.out.println(z);
    }
}


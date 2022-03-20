public class method_overloading {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(23, 36);
        double myNum2 = plusMethod(3.68, 7.23);
        System.out.println("int: " +myNum1);
        System.out.println("double: " +myNum2);
    }
}

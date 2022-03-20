public class scope_and_recursion {
    public static void main(String[] args) {

        //here code can't use a

        int a = 2453;

        //here code can use
        System.out.println(a);

        //code b here can't use
        {   //this is a block
            //code b here can't use
            int b = 64378;
            //code b can use here
            System.out.println(b);
        }   //block ends here
        //here code b can't use

        System.out.println("This is Java recursion");
        //recursion example
        int result = sum(12);
        System.out.println(result);

        System.out.println("This is Halting condition");
        //halting condition
        int result_2 = sum_2(2, 12);
        System.out.println(result_2);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    //halting condition method
    public static int sum_2(int start, int end) {
        if (end > start) {
            return end +sum_2(start, end - 1);
        } else {
            return end;
        }
    }
}

public class Method {
    static void myMethod() {
        System.out.println("This is myMethod method");
    }

    static void myMethod_2() {
        System.out.println("This is next method");
    }

    static void myMethod_parameters(String family_name) {
        System.out.println(family_name + " Siddkov");
    }

    public static void main(String[] args) {
        myMethod();
        //print "This is myMethod method"

        myMethod_2();
        myMethod_2();
        myMethod_2();
        //3 time is print "This is next method"

        System.out.println("This is beginning Java method parameters");
        myMethod_parameters("Amir");
        myMethod_parameters("Abror");
        myMethod_parameters("Dilafruz");
    }
}

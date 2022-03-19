public class Method {
    static void myMethod() {
        System.out.println("This is myMethod method");
    }

    static void myMethod_2() {
        System.out.println("This is next method");
    }

    static void myMethod_parameters_age(String family_name, int age) {
        System.out.println(family_name + " Siddkov is " + age);
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
        //or
        myMethod_parameters_age("Amir", 17);
        myMethod_parameters_age("Abror", 44);
        myMethod_parameters_age("Dilafruz", 43);
    }
}

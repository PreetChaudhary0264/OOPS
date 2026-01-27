package Practice.packages;

public class StaticExample {
    static int a = 2;
    int b = 5;

    static{
        System.out.println("I am static blocked");
    }

    //static block is loaded only 1 time when class is loaded.
    //all static methods or variables will be loaded only once. when class is loaded

    public void greet(){
        System.out.println("Hiii");
    }

    public static void hobby(){
        System.out.println("I like to do workout int the gym.");
    }
}

package pkg.Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();

        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();

        //all three will point to the same object
        System.out.println();
    }
}

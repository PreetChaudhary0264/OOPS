package Practice.interfaces;

public interface Engine {
    //by default all variables are static and final
    //all methods should be abstract
    //default methods are all possible but they are ,ainly for, they are like added functionalityy

    int a = 3;
    public void start();
    void stop();
    void acc();

    public default void display(){
        System.out.println("i am default function in interface");
    }

    static void method(){
        System.out.println("I am static method");
    }
}

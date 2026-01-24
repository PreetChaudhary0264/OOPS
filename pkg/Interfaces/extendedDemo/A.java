package pkg.Interfaces.extendedDemo;

public interface A {
    void fun();

    static void greet(){
        System.out.println("Hello");
    }
//  static methods cant be overriden so they should has a body

    default void test(){
        System.out.println("This is default");
    }
    //by using default methods we are again creating problem of ultiple inheritance.
    //this is like an extra feature
    //it is designed to extend the codebases like an interface is implementd by many classes so while changing codebase u will add a new method in every class? No
    //avoid this default method

//    ******************************

    //the access modifier of the overriden function should be same or best...like if we have using protected then while override we cannot use private because it is more restrictive we should use something better
}

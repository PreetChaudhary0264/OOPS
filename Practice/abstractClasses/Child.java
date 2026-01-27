package Practice.abstractClasses;

abstract public class Child extends Human{

    abstract public void display2();

    @Override
    void display() {
        System.out.println("I am implemented in Child class");
    }

    void faa(){
        System.out.println("Hi");
    }
}

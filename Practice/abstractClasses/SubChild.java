package Practice.abstractClasses;

import Practice.principles.inheritance.Parent;

public class SubChild extends Child{
    @Override
    public void display2() {
        System.out.println("I am implemented in subChild class");
    }

//    @Override
//    void display() {
//
//    }
public static void main(String[] args) {
    SubChild a = new SubChild();
    a.display2();
    a.display();

//    Parent obj = new Parent();
}
}

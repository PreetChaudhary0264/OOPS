package pkg.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        Daughter d = new Daughter(22);

        son.career();
        son.hobby();

        Parent obj = new Daughter(23);  //runtime polymorphism

//      Parent p = new parent(33);  we cannot create the objects of the abstract class because then we can access the abstract method which has no body

    }
}

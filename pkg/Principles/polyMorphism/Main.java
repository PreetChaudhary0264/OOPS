package pkg.Principles.polyMorphism;

public class Main {
    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.area();
        //Reference type tells which obj has the access of which fields and object type decides which method to run......This is known as UpCasting
        //Eg => in above obj has reference type of Shape (means it can use area function) but area func is overriden in circle class so now object Type(circle) decides which method to run ....so are of circle class will be executed

//      Shape.greetings();
        Circle.greetings();

        //Static methods can be inherited but cant be overriden ********************************
        //because static method belongs to class so no maytter from which obj u try to access that gloval method will be run
        //or we can say that overriden depends on object and static in indepenednt of objetcs so static method cant be overriden
        //final method also prevents function from being overriden and eclass from being inherited
    }
}
//this is runtime polymorphism =>  achieved by Override
//compile time poly is already dono in inheritance. Eg=> Many constructors with different parameters achieved by Overloading
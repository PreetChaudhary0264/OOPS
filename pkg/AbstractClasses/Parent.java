package pkg.AbstractClasses;

public abstract class Parent {  //we also cannot have final abstract classes because final will prevent them from being overriden and abstract classes must be overriden
    int age;

  //abstract int age; we cannot have abstract variables

  //abstract Parent();  we cannot have abstract constructor


     Parent(int age){   //we can have constructors because we can call them from their child classes using super()
         this.age = age;
     }

     static void test(){  //can have static methods because object cant be created
         System.out.println("I am a tester");
     }

    abstract void career();
    abstract void hobby();

//  abstract static void testing();  we cannoit have abstract static methods because they have no body and if they can be static then they can be called wiothout creating the object.
}

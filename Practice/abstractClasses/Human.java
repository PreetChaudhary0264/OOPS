package Practice.abstractClasses;

abstract public class Human {
    int a = 5;
    abstract void display();

    Human(){
        this.a += 5;
    }

    public void open(){
        System.out.println("I am non-abstarct function in Abstract class");
    }

//     abstract static int sum();   we cant have abstract static methods

//    abstract Human(){}   no we cant


}

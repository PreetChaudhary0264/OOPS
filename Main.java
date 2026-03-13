public class Main {
    static void show(){
        System.out.println("A");
    }
}

class B extends  Main{
    static void show(){
        System.out.println("B");
    }
}

class A{
    public static void main(String[] args) {
        Main obj = new B();
        obj.show();
    }
}

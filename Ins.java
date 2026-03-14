public class Ins {
    static {
        System.out.println("Parent static block");
    }

    Ins(int val){
        System.out.println("Value" + val);
    }
}

class Child{
    static {
        System.out.println("child class static block");
    }

    Ins obj = new Ins(10);

    Child(int val){
        obj = new Ins(val);
    }

    public static void main(String[] args) {
        Child obj = new Child(11);

//        short a = 10;
//        short b = 20;
//        short c = a+b;
    }
}

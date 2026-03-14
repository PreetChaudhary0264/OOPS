public class ABC {
    ABC(){
        System.out.println("Cons");
    }

    ABC a = new ABC();

    public static void main(String[] args) {
        ABC obj = new ABC();
    }
}

class Parent{
     private void display(){
        System.out.println("hi");
     }
}

class ChildA extends Parent{
     void display(){
        System.out.println("hi child");
     }
}



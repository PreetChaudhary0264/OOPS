public class Dum {
    private final void show(){
        System.out.println("show");
    }

    void dis(){
        System.out.println("parent dis");
    }
}

class Chj extends Dum{
    void show(){
        System.out.println("show2");
    }
    @Override
    void dis(){
        System.out.println("child dis");
    }

    public static void main(String[] args) {
        Dum obj = new Chj();
//        obj.show();   priavte method hai access nhi ho payga
        obj.dis();
    }
}

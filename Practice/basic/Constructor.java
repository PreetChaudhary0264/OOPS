package Practice.basic;

public class Constructor {
    final int a;
    String b;

    Constructor(int a, String b){
        this(a);
        this.b = b;
    }

    public Constructor(int a){
        this.a = a;   //BTS => obj.a = a;
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(1,"preet");
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}

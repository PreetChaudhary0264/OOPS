package pkg.staticMeaning;

public class StaticBlock {
    static int a =4;
//    static int b = a*5;
    static int b;
    static int c = 5;

    static {
        System.out.println("I am inside the static block");  //it will be called only once when class is loaded
        b = a * 5;
    }

    public StaticBlock(int c){
        StaticBlock.c = c;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock(5);
        System.out.println(StaticBlock.a + " " + StaticBlock.b + " " + obj.c);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock(10);  //we will not see output => "I am iside the static block" because that static block will be loaded only once
//        obj2.c = 10;
        System.out.println(StaticBlock.a + " " + StaticBlock.b + " " + obj2.c);
        System.out.println(StaticBlock.a + " " + StaticBlock.b + " " + obj.c);

    }
}

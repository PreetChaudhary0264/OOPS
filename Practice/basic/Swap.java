package Practice.basic;

public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        //wrapper classes are immutable on avary modification a new object is created ****************
        final int c = 34;
//        c = c + 34;
//        System.out.println(c);

        //for primitives we cannot change the value.
        //but for non-primitives we can change the value of the objects but cant change the refernce of the objects

        final StringBuilder sb = new StringBuilder("hi ");
        sb.append("i am appended");

        final Constructor obj = new Constructor(1,"preet");
        System.out.println(obj.b);
        obj.b = "Hello";     //for objects we can change the value

//        obj = new Constructor(1,"changed");   //we cannot change the refernce
        System.out.println(obj.b);
        System.out.println(sb.toString());


        swap(a,b);
        System.out.println(a + " " + b);
    }
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

package Practice.packages;

public class InnerClasses {
    public static class Inner{
        static int a = 2;
        int b = 5;
        String name;
//        static String name;

        Inner(String name){
            this.name = name;
        }

        public static void greet(){
            System.out.println("Hiii");
//            System.out.println(this.a);

            //u cant use this keyword inside a static function bcoz this keyword depends oin objects and static does not depends ob objects
        }
    }

    public static void main(String[] args) {
        Inner a = new Inner("preet");
        Inner b = new Inner("nabh");

        System.out.println(a.name + " " + b.name);
//        sum(1.2);
    }
    public void sum(int a,int b){
        System.out.println(a+b);
        multiply(2,3);
    }
    public void multiply(int a,int b){
        System.out.println(a*b);
    }
}

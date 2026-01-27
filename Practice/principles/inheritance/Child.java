package Practice.principles.inheritance;

public class Child extends Parent{
    int common = 200;
    String name = "child";
    int num;

    Child(){}

    Child(int x,int y,int z,int num){
        super(x,y,z);
        this.num = num;
    }

    public void method(){
        System.out.println("I am child");
        System.out.println(super.common);
    }

    public static void main(String[] args) {
        Parent a = new Parent();
        a.faa();
        Child b = new Child();
        b.method();
        b.faa();

        Parent c = new Child();   //upcasting
        c.faa();

//        Child d = new Parent();   //downcasting(unsafe)

//        Child d = (Child) new Parent();
        //upcasting is safe and allowed automatically but downcasting is unsafe and requires casting and then also it may fail
        //ClassCastException

        System.out.println(a.common);
        System.out.println(b.common);

//        this  → current object
//        super → same object ka parent section

        

    }
}

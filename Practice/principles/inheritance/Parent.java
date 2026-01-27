package Practice.principles.inheritance;

public class Parent {
    int age = 40;
    String name = "parent";
    int common = 100;
    int x,y,z;

    Parent(){}

    Parent(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void faa(){
        System.out.println("I am parent");
    }
}

package Practice.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    Human(int age,String name){
        this.age = 23;
        this.name = "preet";
        arr = new int[23];
    }
    Human(Human old){         //Constructor based cloning
        this.age = old.age;
        this.name = old.name;
//        this.arr = old.arr;
        this.arr = old.arr.clone();  //this is deep copying
    }

    public Human clone() throws CloneNotSupportedException{
        Human twin = (Human)super.clone();

        twin.arr = new int[twin.arr.length];
        for(int i = 0; i < arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}

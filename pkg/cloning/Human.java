package pkg.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    Human(int age,String name){
        this.age = age;
        this.name = name;
        arr = new int[]{1,2,3};
    }
    Human(Human old){
        this.age = old.age;
        this.name = old.name;
        this.arr = old.arr;
    }

    public Object clone() throws CloneNotSupportedException{
//        return super.clone();


        //This is deep copy

        Human twin = (Human)super.clone();

        twin.arr = new int[twin.arr.length];
        for(int i = 0; i < arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}

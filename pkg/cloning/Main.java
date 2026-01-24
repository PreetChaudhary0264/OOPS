package pkg.cloning;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human kunal = new Human(12,"Kunal");
//      Human twin = new Human(kunal);

        Human twin = (Human) kunal.clone();


        //Shallow copy => primitives will be copied but for non primitives it will refer to the sane object
        //in above example twin will point to thesame array kunal is potining to and same for name
        //if an object itself contains another object then the cloned will point to the same inner object

        System.out.println(Arrays.toString(kunal.arr));
//        twin.arr[0] = 100;
//        System.out.println(Arrays.toString(kunal.arr));          SHALLOW COPY


    }
}

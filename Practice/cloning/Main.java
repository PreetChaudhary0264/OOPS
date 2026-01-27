package Practice.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human a = new Human(22,"preet");
        Human b = new Human(a);   //shallow copy
        a.arr[0] = 10;
        System.out.println(a.arr[0]);
        System.out.println(b.arr[0]);

        //Primitives → always deep copied
        //Immutable objects (String, Integer) → safe even if reference copied
        //Mutable objects (arrays, List, Map, custom classes) → need deep copy

        Human c = a.clone();

    }
}

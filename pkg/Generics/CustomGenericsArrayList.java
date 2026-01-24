package pkg.Generics;

import java.util.Arrays;
import java.util.List;

//public class CustomGenericsArrayList<T> {
public class CustomGenericsArrayList<T extends Number> { //Here T should be either number or Numbers's subClass
    Object[] data;
    int initialCpacity = 20;
    int size = 0;

    CustomGenericsArrayList(){
        data = new Object[initialCpacity];   //you cannot create a instance of generic type so we use Object class
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public void getList(List<? extends Number> list){  //This is Wildcard

    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T get(int index){
        T removed = (T)data[index];  //casting is required because we cannotlike add element from Object class to Type T(bigger into smaller is not possible)
        return removed;
    }

    public void selfMadeMethod(){
        for(int i = 0; i < this.data.length; i++){
            System.out.println(this.data[i]);
        }
    }

    public static void main(String[] args) {
        CustomGenericsArrayList<Integer> list = new CustomGenericsArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
//        list.add("preet");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        list.selfMadeMethod();

        CustomGenericsArrayList<Float> list2 = new CustomGenericsArrayList<>();
    }
}

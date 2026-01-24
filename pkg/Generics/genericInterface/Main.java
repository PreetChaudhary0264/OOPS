package pkg.Generics.genericInterface;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12,34);
        Student rahul = new Student(13,35);

        if(kunal.compareTo(rahul) < 0){
            System.out.println("Rahul has higher marks");
        }
    }
}

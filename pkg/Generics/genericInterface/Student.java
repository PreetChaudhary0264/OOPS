package pkg.Generics.genericInterface;

public class Student implements Comparable<Student>{
    int rno;
    int marks;

    Student(int rno,int marks){
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}

import java.util.Arrays;

class Student{
    int rollNo;
    String name;

    Student(){
        this(13,"preet");  //calling constructor inside a constructor
    }
    Student(int rno,String name){
        this.rollNo = rno;
        this.name = name;
    }
    
}
class First{
    public static void main(String[] args) {
        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));
        
        int[][] arr = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(arr));
        final int b = 10; //change is not allowed for primitives

        final Student a = new Student();
        a.name = "another name";   //this is allowed for NON PRIMITIVES
        // a = new Student();    //Re-Assighning the final non promitives is not allowed  ...means value can be changed but refernce cant be change
    }
}
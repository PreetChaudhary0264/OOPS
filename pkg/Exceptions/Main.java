package pkg.Exceptions;

public class Main {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 0;

        try{
            divide(a,b);
        }catch(MyException e) {
            System.out.println(e.getMessage());
        }catch(ArithmeticException s){  //we need to use arithmeticException above then Exception beacuse if we use Eception above then all exceprion will come under Exception class below catch will never get executed
            System.out.println(s);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void divide(int a,int b) throws Exception{
        if(b == 0){
//            throw new Exception("Please do not divide by zero");
            throw new MyException("This is my Exception");
        }
        System.out.println(a/b);
    }
}

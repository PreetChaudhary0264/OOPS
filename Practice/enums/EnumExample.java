package Practice.enums;

public class EnumExample {
    enum Week implements A{
        mon,tue,wed,thr,fri,sat,sun;

        public void display(){
            System.out.println("This is enum");
        }

        @Override
        public void fun() {
            System.out.println("I am implemented");
        }
    }

    public static void main(String[] args) {
        Week week = Week.mon;

        for(Week day:  Week.values()){
            System.out.println(day);
        }

        week.fun();
    }
}

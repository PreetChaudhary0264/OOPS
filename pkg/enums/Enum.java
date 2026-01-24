package pkg.enums;

public class Enum {
    enum Week implements A{
        mon,tue,wed,thr,fri,sat,sun;

        @Override
        public void fun() {
            System.out.println("Enum can implements interfaces");
        }

        void display(){

        }
        //since enums cant be inherited so abstract functoon are not allowed
    }
    //enums are public static and final
    //enums are constants

    public static void main(String[] args) {
        Week week;
        week = Week.mon;
        System.out.println(week);

        for(Week day : Week.values()){
            System.out.println(day);
        }

        week.fun();
        System.out.println(week.ordinal());  //position
    }
}

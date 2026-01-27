package Practice.packages;

public class Human {
    int age;
    String name;
    static int population;

    Human(int age,String name){
        this.age = age;
        this.name = name;
//        this.population +=1;
        Human.population += 1;
    }

    public static void main(String[] args) {
        Human a = new Human(1,"preet");
        Human b = new Human(2,"nabh");

        System.out.println(a.population + " " + b.population);
        System.out.println(Human.population + " " + Human.population);

        //first it will check does a has population ? no its not then it will check does class has population yes it is

    }
}

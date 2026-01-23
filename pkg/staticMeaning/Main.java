package pkg.staticMeaning;
class Human{
    int age;
    String name;
    static int population;

    Human(int age,String name){
        this.age = age;
        this.name = name;
//        this.population += 1;
        Human.population += 1;   //best practice(this is convention
    }
}
public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22,"Kunal Kushwaha");
        Human rahul = new Human(22,"rahul Kushwaha");
//        System.out.println(kunal.population);
//        System.out.println(rahul.population);    it will work because first it will check does rahul has population? no its not then does Human has population ? yes it is and it is static
         //static belongs to class not objects
        System.out.println(Human.population);   //best practice
        System.out.println(Human.population);
    }
}

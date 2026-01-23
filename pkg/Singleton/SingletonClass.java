package pkg.Singleton;

public class SingletonClass {
    private SingletonClass(){

    }
    private static SingletonClass instance;
    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
//        faltu();
        return instance;
    }
//    public static SingletonClass faltu(){
//        System.out.println("hi");
//        return instance;
//    }

}

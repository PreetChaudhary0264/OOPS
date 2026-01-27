package Practice.packages;

public class Main2 {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj.getInstance();
    }
}

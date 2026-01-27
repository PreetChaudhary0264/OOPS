package Practice.interfaces.nestedDemo;

public class Main {
    public interface Nested {
        boolean isOdd(int num);
    }
}

//top level interface can only have public or default

class B implements Main.Nested{
    public static void main(String[] args) {
        B obj = new B();
        obj.isOdd(23);
    }

    @Override
    public boolean isOdd(int num) {
        return num%2 == 1;
    }
}

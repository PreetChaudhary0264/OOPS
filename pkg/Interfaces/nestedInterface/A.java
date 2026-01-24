package pkg.Interfaces.nestedInterface;

public class A {
     public interface Nested{
        boolean isOdd(int num);
    }

    //difference between this nested and top level interface is that top level should always be public or default
    //nested interface can be public private default or protected
}
class B implements A.Nested{

    @Override
    public boolean isOdd(int num) {
        return num % 2 == 1;
    }
}

package Practice.packages;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StaticExample a = new StaticExample();
        System.out.println(a.a);
        a.hobby();  //warning
        StaticExample.hobby();

        System.out.println(a.b);

        StaticExample b = new StaticExample();

        //Static fields are bound to class not objects....

    }
}

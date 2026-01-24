package pkg.Interfaces;

import java.sql.SQLOutput;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Media started");
    }

    @Override
    public void stop() {
        System.out.println("Media stopped");
    }
}

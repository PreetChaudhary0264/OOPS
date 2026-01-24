package pkg.Interfaces;

public class Car implements Engine, Break,Media{

    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("Engine accelerated");
    }
}

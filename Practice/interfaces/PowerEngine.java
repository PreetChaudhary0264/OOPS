package Practice.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Engioe started");
    }

    @Override
    public void stop() {
        System.out.println("engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("engine accelerated");
    }

}

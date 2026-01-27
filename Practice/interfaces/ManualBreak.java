package Practice.interfaces;

public class ManualBreak implements Break{
    @Override
    public void stop() {
        System.out.println("Break pulled");
    }

    @Override
    public void acc() {
        System.out.println("Brealk released");
    }
}

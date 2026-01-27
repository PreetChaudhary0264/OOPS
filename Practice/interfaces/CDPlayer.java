package Practice.interfaces;

public class CDPlayer implements Media{
    @Override
    public void play() {
        System.out.println("Music started");
    }

    @Override
    public void pause() {
        System.out.println("music stopped");
    }
}

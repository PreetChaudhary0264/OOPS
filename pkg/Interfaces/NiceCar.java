package pkg.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media media;

    NiceCar(){
       engine = new PowerEngine();
       media = new CDPlayer();
    }

    public void startEngine(){
        engine.start();
    }
    public void stopEngine(){
        engine.stop();
    }
    public void startMusic(){
        media.start();
    }
    public void stopMusic(){
        media.stop();
    }
}

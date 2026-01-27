package Practice.interfaces;

public class NiceCar {
    PowerEngine engine;
    CDPlayer media;
    ManualBreak brake;
    NiceCar(){
        engine = new PowerEngine();
        media = new CDPlayer();
        brake = new ManualBreak();
    }
    public static void main(String[] args) {
        NiceCar obj = new NiceCar();
        obj.engine.start();
        obj.media.play();
        obj.brake.stop();
        obj.media.pause();
        obj.engine.stop();
        obj.brake.acc();
//        obj.engine.method();
        Engine.method();
        obj.engine.display();
    }
}

package pkg.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.acc();
//
//        Media media = new Car();
//        media.stop();  //music stop krne prr engine stop ho gya


        NiceCar nc = new NiceCar();
        nc.startEngine();
        nc.startMusic();
        nc.stopMusic();
    }
}

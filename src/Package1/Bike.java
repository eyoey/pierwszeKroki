package Package1;

public class Bike implements Vehicle {


    @Override
    public void jazda(int speed) {
        System.out.println("riding bike with speed: " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Stopping the bike");

    }

    @Override
    public String info() {
        return "Bicykle";
    }
}

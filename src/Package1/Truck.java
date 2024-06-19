package Package1;

public class Truck implements Vehicle {


    @Override
    public void jazda(int speed) {
        System.out.println("Driving a truck with speed: " + speed);
    }

    @Override
    public void stop() {
        System.out.println("stop the truck");
    }

    @Override
    public String info() {
        return "Truck maschine";
    }

    public void zatankuj() {
        System.out.println("need supplies");
    }

}

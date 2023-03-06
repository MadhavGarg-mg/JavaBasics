package Inheritance;

public class Car extends Machine{

    @Override
    public void start() {
        System.out.println("Car started");
    }

    public void cleanWindshield(){
        System.out.println("Cleaning windshield");
    }
}

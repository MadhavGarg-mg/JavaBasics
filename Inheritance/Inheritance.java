package Inheritance;

public class Inheritance {

    public static void main(String[] args) {

        Machine m = new Machine();
        Car c = new Car();

        m.start();
        m.stop();
        System.out.println();
        c.start();
        c.cleanWindshield();
        c.stop();
    }
}

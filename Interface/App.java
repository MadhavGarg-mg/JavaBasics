package Interface;

public class App {
    public static void main(String[] args) {
        Machine m = new Machine();
        Person p = new Person("Madhav");

        m.start();
        p.greet();

        Info i1 = new Machine(); // First way to implement
        Info i2 = m; // Second way to implement

        Info i3 = new Person("Madhav Garg"); // Can do same as machine (Using p instead of Person())

        i1.showInfo();
        i2.showInfo();
        i3.showInfo();
    }
}

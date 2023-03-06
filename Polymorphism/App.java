package Polymorphism;

public class App {

    public static void main(String[] args) {
        Plant p1 = new Plant();
        Tree t1 = new Tree();

        Plant p2 = t1; // This is polymorphism

        p1.grow();
        p2.grow(); // Will give tree grow instead of the plant.

        t1.shedLeaves();
        // Crash p2.shedleaves(); As plant does not have a shedleaves function. Even if it points to tree it is still type plant.

        // Can do this instead.
        Plant p3 = new Tree();
        Tree t2 = (Tree)p3;

        t2.shedLeaves();

    }
}

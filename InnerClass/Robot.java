package InnerClass;

public class Robot {
    private final int id;

    private class Brain{
        public void think(){
            System.out.println("Robot " + id + " is thinking.");
        }
    }

    private class Legs{
        public void move(){
            System.out.println("Robot " + id + " is moving");
        }
    }

    public Robot(int id){
        this.id = id;
    }

    public void start(){
        System.out.println("Robot " + id + " is starting");
        Brain brain = new Brain();
        Legs leg = new Legs();
        brain.think();
        leg.move();
    }
}

package Constructor;

class Machine{
    private String name;
    public Machine() {
        System.out.println("Constructor running!");

        name = "Arnie";
    }

    public Machine(String name) {
        System.out.println("2nd Constructor running!");

        this.name = name;
    }
}

public class ConstructorTutorial {
    public static void main(String[] args){
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("a");
    }
}

package Static;

class Thing{
    public String name;
    public static String description;
    public final static int number = 17;

    public static int count = 0; // As count is static the count for all the objects will be the same

    public Thing(){
        count++; // As an object is created count increases by 1.
    }

    public void showName() {
        System.out.println(description + " " + name);
    }

    public static void showInfo(){
        System.out.println("Hello!");
        System.out.println(description);
        // Static function can only take static instance from a class.
    }
}

public class StaticTutorial {
    public static void main(String[] args){

        Thing.description = "I am a thing.";

        System.out.println(Thing.description);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Madhav";
        thing2.name = "Diksha";

        System.out.println(thing1.name);
        System.out.println(thing2.name);

        thing1.showName();
        thing1.showName();

        Thing.showInfo();

        System.out.println(Math.PI);

        System.out.println(Thing.number);

        System.out.println(Thing.count);
    }
}

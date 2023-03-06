package Enum;

public class App {
    public static void main(String[] args) {
        Animal animal = Animal.DOG;

        switch (animal){
            case CAT -> System.out.println("This is a cat");

            case DOG -> System.out.println("This is a dog");

            case MOUSE -> System.out.println("This is a mouse");
        }
        System.out.println(Animal.CAT);
        System.out.println(Animal.CAT.name()); // Will give object type.
    }
}

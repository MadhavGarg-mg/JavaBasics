package Enum;

public enum Animal {
    CAT("Pebbles"), DOG("Bruno"), MOUSE("Jerry");

    private String name;

    Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return "This animal's name is: " + name;
    }
}

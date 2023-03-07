package Transient;

import java.io.Serializable;

public class Person implements Serializable{
    private transient int id; // id becomes 0 in serialization
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person[id=" + id + ", name=" + name + "]";
    }
}
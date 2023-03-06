package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public static void main(String[] args){
        System.out.println("Writing objects");

        Person[] people = {new Person(1,"Madhav"), new Person(2, "Diksha"), new Person(3, "Rashed")};

        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));



        try(FileOutputStream fr = new FileOutputStream("src\\Serialization\\people.txt")){

            ObjectOutputStream os = new ObjectOutputStream(fr);
            os.writeObject(people);
            os.writeObject(peopleList);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("Input Output error");
        }

    }
}

package Transient;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public static void main(String[] args){
        System.out.println("Writing objects");

        try(FileOutputStream fr = new FileOutputStream("src\\Transient\\people.txt")){

            ObjectOutputStream os = new ObjectOutputStream(fr);
            Person person = new Person(3, "Bob");
            os.writeObject(person);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("Input Output error");
        }

    }
}

package Transient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading Objects");

        try(FileInputStream fi = new FileInputStream("Transient\\people.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);){

            Person person = (Person) oi.readObject();
            System.out.println(person);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("IO exception");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}

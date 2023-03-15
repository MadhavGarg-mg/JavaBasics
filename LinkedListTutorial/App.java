package LinkedListTutorial;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); // Better if you want to add/remove stuff from the end of a list.
        LinkedList<Integer> linkedList = new LinkedList<Integer>(); // Better in all the other cases

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }
    private static void doTimings(String type, List<Integer> list){

        for(int i = 0; i<1E5; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();

        // Adding items at the end of the list. ArrayList faster than LinkedList.
//        for(int i = 0; i<1E6; i++){
//            list.add(i);
//        }

        // Add items at the start of the list. LinkedList much faster than the ArrayList.
//        for(int i = 0; i<1E5; i++){
//            list.add(0, i);
//        }

        // Add items in the middle of the list. LinkedList much faster than ArrayList.
        for(int i = 0; i<1E5; i++){
            list.add(1000, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + "ms for " + type);
    }
}

package Sets;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args){
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();

        set1.add("dog");
        set1.add("cat");
        set1.add("turtle");
        set1.add("cow");
        set1.add("lion");

        set2.add("dog");
        set2.add("cat");
        set2.add("Human");

        System.out.println(set1);

        if (set1.contains("dog")) System.out.println(1);
        if (set1.isEmpty()) System.out.println(2);

        // Can use LinkedHashSet, TreeSet for the same functionality as Sorted Maps.
    }
}

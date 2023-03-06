package ArrayTutorial;

public class App {
    public static void main(String[] args) {

//        int value = 7;

        int[] values;

        // Gives the number of elements in the array
        values = new int[10]; // using int so the values can only be an integer.

//        System.out.println(values[0]);

        // Assigning the values of the array
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        // This can also be used to assign uniform values and print all values.
        for(int i = 0; i < values.length; i ++)
        {
            values[i] = (i + 2) * 20;
            System.out.println(values[i]);
        }

        // This is another way to assign elements to an array.
        int[] numbers = {1, 2, 3, 4, 5};

        for(int i = 0; i < numbers.length; i ++)
        {
            System.out.println(numbers[i]);
        }

        // Using String to putting string values to the array word.
        String[] word = new String[3];

        word[0] = "Hello ";
        word[1] = "to ";
        word[2] = "you ";

        System.out.println(word[0] + word[1] + word[2] + "Madhav.");

        // Putting fruits into the array fruits.
        String[] fruits = {"apple", "orange", "pear"};

        System.out.println(fruits[2]);

        // Prints all the elements. Basically printing all the i in the array fruits.
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        // Creating default values for value and text.
//        int value = 0;
        String text = null;
        System.out.println(text);

        String[] texts = new String[2];
        texts[0] = "one";
        texts[1] = "Two";

        System.out.println(texts[0]);
        System.out.println(texts[1]);
    }
}

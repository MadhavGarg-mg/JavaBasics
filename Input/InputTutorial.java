package Input;

import java.util.Scanner;
public class InputTutorial {
    public static void main(String[] args) {

        // Create the scanner object.
        Scanner input = new Scanner(System.in);

//            // Output the prompt.
//            System.out.println("Enter a line of text: ");
//
//            // Wait for the user to enter a line of text.
//            String line = input.nextLine();
//
//            // Tells them what they entered.
//            System.out.println("You entered: " + line);



//            System.out.println("You entered: " + value);
//            float value_float = input.nextFloat();
//            System.out.println("You entered: " + value_float);

        int value = 0;
        do {
            System.out.println("Enter a number: ");
            value = input.nextInt();
        }
        while(value != 5);
//                System.out.println("Enter a number: ");

        System.out.println("Got 5!");
    }
}

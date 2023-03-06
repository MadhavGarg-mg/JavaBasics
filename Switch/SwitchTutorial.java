package Switch;

import java.util.Scanner;

public class SwitchTutorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        switch (text) {
            case "start" -> System.out.println("Constructor.Machine started");
            case "stop" -> System.out.println("Constructor.Machine stopped");
            default -> System.out.println("Command not recognised");
        }
    }
}

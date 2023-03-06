package Recusion;

public class App {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(15));
    }

    private static int calculateFactorial(int value){
        if (value == 0){
            return 0;
        }
        if (value == 1){
            return 1;
        }
        return calculateFactorial(value - 1) * value;
    }
}

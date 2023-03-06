package LoopTutorial;

public class App {
    public static void main(String[] args){
        int myInt = 9;
        int myLoop = 1;
        while(myInt < 20) // The while loop
        {
            System.out.println(myLoop);
            myInt = myInt + 1;
            myLoop = myLoop + 1;
        }
        for(int i = 0; i < 5; i ++)
        {
            System.out.printf("The value of i is: %d\n", i);
        }
    }
}

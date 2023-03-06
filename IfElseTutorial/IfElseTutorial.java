package IfElseTutorial;

public class IfElseTutorial {
    public static void main(String[] args){
        for(int i = 0; i < 5; i ++)
        {
            System.out.printf("The value of i is: %d\n", i);
            if(i < 2) {
                System.out.println("i < 2");
            }
            else if (i == 2) {
//          break;
                System.out.println("i == 2");
            }
            else{
                System.out.println("i > 2");
            }
        }
    }
}

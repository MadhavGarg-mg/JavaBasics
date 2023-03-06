package Multidimentional;

public class App {
    public static void main(String[] args) {
        int[] values = {3, 5, 2343};
        System.out.println(values[2]);

        // Multi-Dimensional array.
        int[][] grid = {
                {3, 5, 2343},
                {2, 4},
                {1, 2, 3, 4}
        };
        System.out.println(grid[2][2]);

        String[][] texts = new String[2][3];

        texts[0][0] = "Hello there";
        System.out.println(texts[0][0]);

        texts = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}, {"1"}, {"4"}};


        for (int[] ints : grid) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        for (String[] text : texts) {
            for (String s : text) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}

package ScannerReadFile;

import java.io.File;
import java.util.Scanner;

public class ScannerTutorial {
    public static void main(String[] args) throws Exception{
        String fileName = "C:\\Users\\madha\\Desktop\\Text.txt";

        File textFile = new File(fileName);

        Scanner sc = new Scanner(textFile);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}

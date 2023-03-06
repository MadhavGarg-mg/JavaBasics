package WriteFiles;

import java.io.*;
public class App {
    public static void main(String[] args) {
        File file = new File("src/WriteFiles/test.txt");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write("1");
            bw.newLine();
            bw.write("2");
        }
        catch (IOException e) {
            System.out.println("Unable to read file");
        }
    }
}

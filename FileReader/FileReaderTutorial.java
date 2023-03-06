package FileReader;

import java.io.*;

public class FileReaderTutorial {

    public static void main(String[] args) {
        File file = new File("src/FileReader/test.txt");

        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + file);
        }
        catch (IOException e) {
            System.out.println("Unable to read file");
        }
    }
}

package lab10.task03;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("files/text1.txt");
        File file2 = new File("files/text2.txt");
        File file3 = new File("files/text3.txt");
        recordInOneFile(file1, file2, file3);
    }

    public static void recordInOneFile(File file1, File file2, File file3){
        try(BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file3, true))){
            String input;
            while((input = reader1.readLine()) != null){
                writer.write(input + "\n");
            }
            while ((input = reader2.readLine()) != null){
                writer.write(input + "\n");
            }
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

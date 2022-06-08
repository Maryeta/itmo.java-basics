package lab10.task04;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File ("files/text1.txt");
        replaceToDollar(file);
    }
    public static void replaceToDollar(File file){
        File fileCopy = new File("files/textCopy.txt");
        try(BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileCopy))){
            String input;
            while((input = reader.readLine()) != null){
                writer.write((input.replaceAll("[^a-zA-Zа-яА-Я\\d]","\\$")) + "\n");
            }
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

}

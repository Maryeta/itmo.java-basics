package lab10.task02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/text2.txt");
        writeStringToFile(file,"Hello three\n");
    }

    public static void writeStringToFile(File file, String string){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))){
            writer.write(string);
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

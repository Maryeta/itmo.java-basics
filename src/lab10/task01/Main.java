package lab10.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/text1.txt");
        System.out.println(readingFile(file));
    }
    public static List<String> readingFile (File file){
        List<String> resultList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String input;
            while((input = reader.readLine()) != null){
                resultList.addAll(Arrays.asList(input.split(" ")));
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return resultList;
    }
}

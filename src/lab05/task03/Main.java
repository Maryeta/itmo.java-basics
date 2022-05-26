package lab05.task03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Это бяка, это тоже бяка";
        String regex = "бяка";
        System.out.println(replaceWord(text, regex));
    }

    public static String replaceWord(String text, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll("[вырезано цензурой]");
    }
}

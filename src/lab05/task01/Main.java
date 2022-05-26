package lab05.task01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "Существует довольно большое количество алгоритмов сортировки, многие из них весьма специфические и разрабатывались для решения узкого круга задач и работы с конкретными типами данных";
        System.out.println(searchLongWord(text));
        String text2 = "Самое длинное слово";
        System.out.println(searchLongWord(text2));
        System.out.println((searchLongWord(text2)).length());
    }

    public static String searchLongWord(String text){
        text = text.replace(",", "");
        String[] split = text.split(" ");
        String longWord = "";
        for(String word: split){
            if (word.length() > longWord.length()){
                longWord = word;
            }
        }
        return longWord;
    }
}

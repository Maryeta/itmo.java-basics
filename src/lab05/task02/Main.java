package lab05.task02;

public class Main {
    public static void main(String[] args) {
        String word = "Шалаш";
        palindrome(word);
    }

    public static void palindrome(String word){
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        System.out.println(word.equalsIgnoreCase(builder.toString()));
    }
}

package lab05.task05;

public class Main {
    public static void main(String[] args) {
        String text = "This is a test string";
        System.out.println(reverse(text).toString());
    }

    public static StringBuilder reverse(String text) {
        String[] split = text.split(" ");
        StringBuilder finString = new StringBuilder();
        for(String word: split){
            StringBuilder builder = new StringBuilder(word);
            finString.append(builder.reverse())
                    .append(" ");
        }
        return finString;

    }
}

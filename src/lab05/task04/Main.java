package lab05.task04;

public class Main {
    public static void main(String[] args) {
        String text = "abcddddabc";
        String regex = "abc";
        System.out.println(count(text, regex));
    }

    public static int count(String text, String regex){
        int count = 0;
        for (int idx = text.indexOf(regex); idx >=0; idx = text.indexOf(regex, idx + 1)){
            count++;
        }
        return count;
    }
}

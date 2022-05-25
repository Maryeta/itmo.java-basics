package lab04.part01.task02;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        while (a < 100) {
            a++;
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + a);
            } else if (a % 5 == 0) {
                System.out.println("Делится на 5: " + a);
            } else if (a % 3 == 0) {
                System.out.println("Делится на 3: " + a);
            }
        }
    }
}

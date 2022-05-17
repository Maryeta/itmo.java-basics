package lab01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        double a = (46 + 10) * (10 * 1.0 / 3);
        int b = (29) * (4) * (-15);
        System.out.println(a);
        System.out.println(b);

        int number = 10500;
        double result = (number * 1.0 / 10) / 10;
        System.out.println(result);

        float c = 3.6f;
        float d = 4.1f;
        float e = 5.9f;
        float result2 = c * d * e;
        System.out.println(result2);

        Scanner scanner = new Scanner(System.in);
        int next = scanner.nextInt();
        int next2 = scanner.nextInt();
        int next3 = scanner.nextInt();
        System.out.println(next);
        System.out.println(next2);
        System.out.println(next3);


        Scanner scanner2 = new Scanner(System.in);
        int b1 = scanner2.nextInt();

        if (b1 % 2 == 0 && b1 > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (b1 % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

    }

}

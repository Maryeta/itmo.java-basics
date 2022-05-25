package lab04.part01.task04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int number3 = scanner.nextInt();

        boolean s = false;
        if (number2 > number1 && number3 > number2){
            s = true;
        }
        System.out.println("Результат: " + s);
    }
}

package lab06.task05;

import java.util.Scanner;

public class Parent {
    private int age;

    public String getScanner(){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        return value;
    }

    public void getInfo(){
        System.out.println("Введите возраст: ");
        int age = Integer.parseInt(getScanner());
        this.age = age;
        System.out.println("Возраст: " + age);
    }
}

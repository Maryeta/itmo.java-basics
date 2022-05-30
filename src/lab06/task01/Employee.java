package lab06.task01;

import java.util.Scanner;

public class Employee extends Person implements QueryAge {

    private String nameBank;

    public Employee(String firstName, String lastName, String nameBank) {
        super(firstName, lastName);
        this.nameBank = nameBank;
    }

    @Override
    void printInfo() {
        System.out.println("Employee " + super.getFirstName() + " " + super.getLastName() + " " + "Банк " + nameBank);
    }

    @Override
    public void printAge() {
        System.out.println("Сколько полных лет: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        super.setAge(age);
        System.out.println("Employee " + super.getFirstName() + " " + super.getLastName() + " " + super.getAge() + " лет");
    }
}

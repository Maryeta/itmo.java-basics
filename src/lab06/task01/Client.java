package lab06.task01;

import javax.management.Query;
import java.util.Scanner;

public class Client extends Person implements QueryAge {

    private String nameBank;

    public Client(String firstName, String lastName, String nameBank) {
        super(firstName, lastName);
        this.nameBank = nameBank;
    }

    @Override
    void printInfo() {
        System.out.println("Client" + super.getLastName() + " " + super.getFirstName());
    }

    @Override
    public void printAge() {
        System.out.println("Сколько полных лет: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        super.setAge(age);
        System.out.println("Client " + super.getFirstName() + " " + super.getLastName() + " " + super.getAge() + " лет");
    }
}

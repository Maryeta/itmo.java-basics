package lab06.task01;

public class Main {
    public static void main(String[] args) {
        Person person = new Employee("Tom", "Grant", "BIC");
        person.printInfo();
        QueryAge printage = new Client("Pol", "Martin", "Standart");
        printInfoAge (new Employee("Jack", "Gibson", "AAA"));
    }

    public static void printInfoAge(QueryAge queryAge){
        queryAge.printAge();
    }
}

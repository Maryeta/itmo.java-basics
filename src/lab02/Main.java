package lab02;

public class Main {
    public static void main(String[] args) {
//      Задание 1:
        Calculator calc = new Calculator();
        System.out.println(calc.Multiplication(3.9, 8));
        System.out.println(calc.Division(10500, 10));
        System.out.println(calc.Subtraction(4, 2));
        System.out.println(calc.Sum(3.6, 5.8));

//      Задание 2:
        Person person = new Person("Tom", "Smith",40, 170, 80);
        System.out.println(person);
    }
}

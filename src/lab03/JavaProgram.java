package lab03;

public class JavaProgram {
    public static void main(String[] args) {
//      Задание 1:
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

//      Задание 2:
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setColor("Red");
        car1.setName("BMV");
        car1.setWeight(0.5);
        car2.setColor("Green");
        car2.setName("Ford");
        car2.setWeight(5);
        System.out.println(car1);
        System.out.println(car2);

        Car car3 = new Car("Black");
        Car car4 = new Car("Red", 500);

//      Задание 3:
        Home home1 = new Home();
        home1.setInit(25, 2005, "North");
        Home home2 = new Home();
        home2.setInit(10, 2001, "West");
        System.out.println(home1);
        System.out.println(home2);
        System.out.println(home1.countYear());
        System.out.println(home2.countYear());

//      Задание 4:
        Tree tree1 = new Tree(500, "Pine");
        Tree tree2 = new Tree(30, true, "Apple tree");
        Tree tree3 = new Tree();
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}

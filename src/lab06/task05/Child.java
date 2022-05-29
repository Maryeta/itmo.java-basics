package lab06.task05;

public class Child extends Parent{
    private String name;

    @Override
    public void getInfo(){
        System.out.println("Введите имя: ");
        this.name = super.getScanner();
        System.out.println("Имя пользователя: " + name);
    }
}

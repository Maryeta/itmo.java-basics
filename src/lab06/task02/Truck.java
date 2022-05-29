package lab06.task02;

public class Truck extends Car{
    private int wheels;
    private double maxWeight;

    public void newWheels(int wheels){
        this.wheels = wheels;
        System.out.println("Количество колес: " + wheels);
    }

    public Truck(int w, String m, char c, float s, int wheels, double maxWeight){
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }
}

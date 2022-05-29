package lab07;

public class Main {
    public static void main(String[] args) {
        Plane.Wing wing1 = new Plane.Wing();
        wing1.setWeight(150.4);
        wing1.printWeight();
        Plane.Wing wing2 = new Plane.Wing();
        wing2.setWeight(150.23);
        wing2.printWeight();
    }
}

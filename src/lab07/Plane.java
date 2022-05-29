package lab07;

public class Plane {
    static class Wing {
        private double weight;

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void printWeight(){
            System.out.println("Вес крыла: " + weight);
        }
    }
}

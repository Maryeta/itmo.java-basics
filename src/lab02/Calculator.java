package lab02;

public class Calculator {
    public Calculator(){
    }
    public int Sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public double Sum(double a, double b){
        double sum = a + b;
        return sum;
    }
    public long Sum(long a, long b){
        long sum = a + b;
        return sum;
    }
    public double Division(int a, int b){
        double div = a*1.0 / b;
        return div;
    }
     public double Division(double a, double b){
        double div = a /b;
        return div;
     }
     public double Division(long a, long b){
        double div = a*1.0/b;
        return div;
     }
     public int Multiplication(int a, int b){
        int mult = a * b;
        return mult;
     }
    public double Multiplication(double a, double b){
        double mult = a * b;
        return mult;
    }
    public long Multiplication(long a, long b){
        long mult = a * b;
        return mult;
    }
    public int Subtraction(int a, int b){
        int subtr = a - b;
        return subtr;
    }
    public double Subtraction(double a, double b){
        double subtr = a - b;
        return subtr;
    }
    public long Subtraction(long a, long b){
        long subtr = a - b;
        return subtr;
    }
}

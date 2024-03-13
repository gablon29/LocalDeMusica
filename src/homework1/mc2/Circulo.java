package homework1.mc2;

public class Circulo {
    private final double PI = 3.1416;

    public double circunferencia(int num) {
        return this.PI * (num * 2);
    }
    public double area(int num) {
        return this.PI * (Math.pow(num, 2));
    }

}

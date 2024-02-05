package homework_3.LSP;

public class Triangle extends Polygon{
    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double pp = (a + b + c) / 2.0;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}

package homework_3.ISP;

public class Triangle implements Shape{
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double pp = (a + b + c) / 2.0;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}

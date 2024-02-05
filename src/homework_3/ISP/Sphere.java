package homework_3.ISP;

public class Sphere implements Shape3D{
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4*Math.PI*Math.pow(radius, 3))/3;
    }
}

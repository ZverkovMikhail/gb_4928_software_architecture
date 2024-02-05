package homework_3.LSP;

public class Rectangle extends Polygon{
    public double height;
    public double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return this.height * this.width;
    }
}

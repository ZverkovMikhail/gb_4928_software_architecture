package homework_3.LSP;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(5, 5, 5);
        printAreaOfPolygon(square);
        printAreaOfPolygon(rectangle);
        printAreaOfPolygon(triangle);
    }

    public static void printAreaOfPolygon(Polygon polygon) {
        System.out.println("area = " + String.format("%.1f",polygon.area()));
    }
}
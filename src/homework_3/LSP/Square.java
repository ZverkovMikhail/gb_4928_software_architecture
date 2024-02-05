package homework_3.LSP;

public class Square extends Polygon{
    public double len;

    public Square(double len) {
        this.len = len;
    }

    @Override
    public double area() {
        return this.len * this.len;
    }
}

package inheritance;

public class Rectangle {
    protected double length;
    protected double width;
    protected int side = 4;

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public void print() {
        System.out.println("This is rectangle");
    }
}

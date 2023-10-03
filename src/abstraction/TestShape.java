package abstraction;

public class TestShape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 6);
        System.out.println(rectangle.calculateArea());
        rectangle.print();
    }
}

package inheritance;

public class Square extends Rectangle {
    @Override
    public double calculatePerimeter() {
        return side * length;
    }

    // method overloading
    public void print(String what) {
        System.out.println("This is " + what);
    }
}

package abstraction;

public abstract class Shape {
    // abstract class should be used as template only
    abstract double calculateArea();

    public void print() {
        System.out.println("I am a shape");
    }
}

package inheritance;

public class Cake {
    private String flavors;
    private double price;

    public Cake() {
        setFlavors("Vanilla");
    }

    public Cake(String flavors) {
        setFlavors(flavors);
        setPrice(9.99);
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavors() {
        return flavors;
    }

    public void setFlavors(String flavors) {
        this.flavors = flavors;
    }
}

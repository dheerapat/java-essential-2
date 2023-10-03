package inheritance;

public class InheritanceCheck {
    public static void main(String[] args) {
//        Person person = new Person();
//        Employee employee = new Employee();
//
//        Rectangle rectangle = new Rectangle();
//        Square square = new Square();
//
//        square.print();
//        square.print("box");
//
//        Coupe myCar = new Coupe();
//        myCar.setColor("red");
//        System.out.printf("My car is %s and has %d doors%n",
//                myCar.getColor(), myCar.getDoors());

        Cake cake = new Cake();
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavors());
        System.out.println("Cake price: " + cake.getPrice());

        BirthDayCake birthDayCake = new BirthDayCake();
        System.out.println("Cake flavor: " + birthDayCake.getFlavors());
        System.out.println("Cake price: " + birthDayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(349.99);
        weddingCake.setFlavors("Pina Colada");
        System.out.println("Cake flavor: " + weddingCake.getFlavors());
        System.out.println("Cake price: " + weddingCake.getPrice());
    }
}

package polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.makeSound();
        rocky.fetch();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        
        sasha = new Cat();
        sasha.makeSound();

        // sasha cannot access scratch() method because sasha is type Animal
        ((Cat)sasha).scratch(); // down casting to type Cat
        feed(sasha);
    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("giving dog food");
        } else if (animal instanceof Cat) {
            System.out.println("giving cat food");
        }
    }
}

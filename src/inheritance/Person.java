package inheritance;

public class Person {
    private String name;
    private int age;
    private String gender;

    // default constructor
    public Person() {
        System.out.println("Person created");
    }

    public Person(String name) {
        System.out.println("Person name is set.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { this.age = age; }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) { this.gender = gender; }
}

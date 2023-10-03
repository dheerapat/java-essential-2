package interfaces;

public class Library {
    public static void main(String[] arghs) {
        Product book = new Book();
        book.setName("In the Kitchen");

        System.out.println(book.getName());
        System.out.println(book.getPrice());
    }
}

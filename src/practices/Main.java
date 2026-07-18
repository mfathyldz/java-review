package practices;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("The Alchemist", "Paulo Coelho", 15.99);

        Book book2 = new Book("Atomic Habits", "James Clear", 18.5);

        Book book3 = new Book("Clean Code", "Robert C. Martin", 32.0);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(new Book("Java", "Kuzzat Altay", 25.86));

        System.out.println(books);

    }

}

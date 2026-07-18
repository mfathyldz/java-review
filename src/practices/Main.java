package practices;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Books book1 = new Books("The Alchemist", "Paulo Coelho", 15.99);

        Books book2 = new Books("Atomic Habits", "James Clear", 18.5);

        Books book3 = new Books("Clean Code", "Robert C. Martin", 32.0);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        //book3.setPrice(-28.5);


        ArrayList<Books> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(new Books("Java", "Kuzzat Altay", 25.86));

        System.out.println(books);

        System.out.println("-------------------------------------------------");

        for (Books eachBook : books) {
            System.out.println(eachBook.getTitle() + " : $" + eachBook.getPrice());
        }

    }

}

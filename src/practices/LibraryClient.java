package practices;

public class LibraryClient {

    public static void main(String[] args) {

        Library library1 = new Library("Sarasota County Public Library");

        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 14.99);
        Book book2 = new Book("1984", "George Orwell", 11.50);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 11.50);
        Book book4 = new Book("To Kill a Mockingbird", "Harper Lee", 12.99);
        Book book5 = new Book("Brave New World", "Aldous Huxley", 10.99);

        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);

        library1.displayAllBooks();

        System.out.println(library1.searchBookByTitle("The Hobbit"));

        System.out.println(library1.searchBookByTitle("The Saw"));


    }
}

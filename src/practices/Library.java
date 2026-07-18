package practices;

import java.util.ArrayList;

public class Library {

    private String libraryName;
    private ArrayList<Book> books = new ArrayList<>();

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks() {
        for (Book eachBook : books) {
            System.out.println(eachBook);
        }
    }

    public Book searchBookByTitle(String title) {
        for (Book eachBook : books) {
            if (eachBook.getTitle().equals(title)) {
                return eachBook;
            }
        }
        return null;
    }


}

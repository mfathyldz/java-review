package practices;

public class Books {

    private String title;
    private String author;
    private double price;

    public Books(String title, String author, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);

        //this.title = title;
        //this.author = author;
        //this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {

            System.err.println("A negative price is given to the book price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

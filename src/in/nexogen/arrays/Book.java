package in.nexogen.arrays;

/**
 * Created by dv on 1/8/17.
 */
public class Book {
    private int id;
    private String name, author, publisher;
    private int quantity;

    Book(int id, String name, String author, String publisher, int quantity) {
        setId(id);
        setName(name);
        setAuthor(author);
        setPublisher(publisher);
        setQuantity(quantity);
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }
}

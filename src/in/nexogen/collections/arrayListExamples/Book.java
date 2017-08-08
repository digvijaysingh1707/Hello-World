package in.nexogen.collections.arrayListExamples;

/**
 * Created by dv on 2/8/17.
 */
public class Book {
    private int id;
    private String name, author, publisher;
    private int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        setId(id);
        setName(name);
        setAuthor(author);
        setPublisher(publisher);
        setQuantity(quantity);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

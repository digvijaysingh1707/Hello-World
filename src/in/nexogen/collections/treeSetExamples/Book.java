package in.nexogen.collections.treeSetExamples;

/**
 * Created by dv on 3/8/17.
 */
public class Book implements Comparable<Book> {
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

    public int compareTo(Book b) {
        if (id > b.id)
            return 1;
        else if (id < b.id)
            return -1;
        else
            return 0;
    }
}

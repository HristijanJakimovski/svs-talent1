package library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Book {
    @ManyToMany(mappedBy = "books")
    private Collection<Member> members;

    @Id
    @GeneratedValue
    private long id;

    private String isbn;
    private String title;


    public Book() {
    }
    public Book(String isbn,String title) {
        this.isbn=isbn;
        this.title=title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

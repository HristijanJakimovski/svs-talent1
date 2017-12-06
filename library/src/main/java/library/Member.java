package library;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Member {
    @ManyToMany
    @JoinTable(name="member_book",
    joinColumns = @JoinColumn(name="member_id"),
    inverseJoinColumns = @JoinColumn(name="book_id"))

    private Collection<Book> books;


    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String surname;

    public Member(){

    }
    public Member(String name,String surname){
        this.name=name;
        this.surname=surname;
    }




}

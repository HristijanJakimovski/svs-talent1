package library;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Scanner;


@SpringBootApplication
@EnableJpaRepositories
public class Library {





    public static void main(String[] args){


        ApplicationContext ctx=
                SpringApplication.run(Library.class,args);

        BookRepository book= ctx.getBean(BookRepository.class);
        MemberRepository member = ctx.getBean(MemberRepository.class);
        Scanner input=new Scanner(System.in);
        Scanner inputLine=new Scanner(System.in);
        boolean flag = true;

            while(flag){
                int num=input.nextInt();
                switch (num){
                    case 1:
                        System.out.println("Vnesi isbn");
                        String isbn=inputLine.nextLine();
                        System.out.println("Vnesi title");
                        String title=inputLine.nextLine();
                        book.save(new Book(isbn,title));
                        break;
                    case 2:
                        Iterable<Book> books=book.findAll();
                        for(Book book1:books){
                            System.out.println(book1.toString());
                        }
                        break;
                    case 3:
                        System.out.println("Vnesete go imeto");
                        String name=inputLine.nextLine();
                        System.out.println("Vnesete go prezimeto");
                        String surname=inputLine.nextLine();
                        member.save(new Member(name,surname));
                        break;
                    case 4:
                        Iterable<Member> members=member.findAll();
                        for(Member member1:members){
                            System.out.println(member1.toString());
                        }
                        break;
                    case 5:
                        flag=false;
                        break;
                 }

            }






    }

}

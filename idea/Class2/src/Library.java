import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    Scanner input = new Scanner(System.in);

    private ArrayList<Book> Books;
    private ArrayList<Author> Authors;
    public Library() {
        this.Books = new ArrayList<>();
        this.Authors = new ArrayList<>();
    }
    public void addBook() {
        System.out.print("Enter Author : ");
        String Author = input.nextLine();
        System.out.print("Enter Title: ");
        String Title = input.nextLine();
        System.out.print("Enter Published Date: ");
        String PublishedDate = input.nextLine();
        System.out.print("Enter Genre: ");
        String Genre = input.nextLine();

        Book book = new Book( Author, Title, PublishedDate, Genre);
        Books.add(book);
    }
    public void addAuthor() {
        System.out.print("Enter Author name: ");
        String AuthorName = input.nextLine();
        System.out.print("Enter Email: ");
        String Email = input.nextLine();
        System.out.print("Enter Phone number: ");
        String Phone = input.nextLine();
        Author author = new Author(AuthorName, Email, Phone);
        Authors.add(author);
    }
    public void removeBook(String BookName  ) {
        for (Book book : Books) {
            if( book.getTitle().equals(BookName) ) {
                Books.remove(book);
            }
        }
    }
    public void removeAuthor(String AuthorName) {
        for (Author author : Authors) {
            if(author.getName().equals(AuthorName)) {
                Authors.remove(author);
            }
        }
    }
    public void showBooks() {
        for (Book book : Books) {
            System.out.print("Book Name : " + book.getTitle());
            if (book.getAuthor() != null) {
                for(Author author : Authors) {
                    if (book.getAuthor().equals(author.getName())) {
                        System.out.println(", author : " + author.getName());
                    }
                }
            }
        }
    }
}

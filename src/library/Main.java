
package library;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Stephen King");
        Author author1 = new Author("Chuck Palahniuk");
        Book book = new Book("The Mist", 1980, author);
        Book book1 = new Book("Guts", 2000, author1);

        book.setAuthorName(author);
        System.out.println(book);
        book1.setAuthorName(author1);
        System.out.println(book1);
    }
}
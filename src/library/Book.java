
package library;

import java.util.Objects;

public class Book {
        private String bookName;
        private Author authorName;
        private int publicationYear;


        public void setAuthorName(Author authorName) {
            this.authorName = authorName;
        }

        @Override
        public String toString() {
            return  authorName + ", " +
                    "Book{" +
                    "bookName='" + bookName + '\'' +
                    ", publicationYear=" + publicationYear +
                    '}';
        }

        public Book(String bookName, int publicationYear) {
            this.authorName = authorName;
            this.bookName = bookName;
            this.publicationYear = publicationYear;

        }

        public String getBookName() {
            return this.bookName;
        }

        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, publicationYear);
    }
}

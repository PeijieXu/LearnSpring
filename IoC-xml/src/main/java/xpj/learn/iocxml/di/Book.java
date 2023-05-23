package xpj.learn.iocxml.di;

public class Book {
    private String name;
    private String author;

    private String isbn;

    public Book() {
        System.out.println("Book()");
    }

    public Book(String name_, String author) {
        System.out.println("Book(name, author)");
        this.name = name_;
        this.author = author;
    }

    // add setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

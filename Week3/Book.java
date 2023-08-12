package Online_Code_Samples.Week3;

public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private boolean borrowed;
    public int numberOfPages;

    public Book(String title, String a, int pub){
        this.title = title;
        author = a;
        publicationYear = pub;
        borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString(){
        return String.format("Title: %s, Author: %s, Publication Year: %d", getTitle(), getAuthor(), getPublicationYear());
    }
}







/*
Create a Shelf Class
instance variables: name, array[] books;

boolean borrowBook(Book book);

getters and setters


Create a Library Class
instance variables: name, Map<String, List<Book>> shelfMap;
boolean addBook(String shelfName, Book book)
boolean removeBook(String shelfName, Book book)
boolean addShelf(Shelf shelf): Books should be in a list and the list and shelfName
will be used to update the Map in the class.
getters and setters
boolean borrowBook( String name, Book book)

 */
























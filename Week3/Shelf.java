package Online_Code_Samples.Week3;

public class Shelf {

    private String name;
    private Book[] books;
    private int bookIndex = 0;

    public Shelf(String name){
        this.name = name;
        books = new Book[5];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public boolean addBook(Book book){
        if( bookIndex == books.length -1) {

            for( int i = 0; i < books.length; i++ ){
                if( books[i] == null ){
                    books[i] = book;
                    System.out.println("Book " + book.getTitle() + " added successfully");
                    return true;
                }
            }
            return false;
        }
        books[bookIndex++] = book;
        return true;
    }

    public boolean removeBook(Book book){

        for(int i = 0; i < books.length; i++ ){
            Book picked = books[i];

            if( picked.getTitle().equalsIgnoreCase(book.getTitle())){
                books[i] = null;
                System.out.println("Book " + book.getTitle() + " removed successfully");

                return true;
            }
        }
        return false;
    }

    public boolean borrowBook( Book book ){
        if( book.isBorrowed() ){
            System.out.println("Book " + book.getTitle() + " already borrowed");
            return false;
        }

        System.out.println("Book " + book.getTitle() + " successfully borrowed");

        book.setBorrowed(true);
        return true;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Bond", 2003);
        Book book2 = new Book("Python Programming", "Mike Bond", 2022);
        Book book3 = new Book("Spring Programming", "James Blend", 2013);
        Book book4 = new Book("HTML Programming", "Winnie More", 2023);

        Shelf bookShelf = new Shelf("Programming Books");
        System.out.println(bookShelf.addBook(book1));
        System.out.println(bookShelf.addBook(book2));
        System.out.println(bookShelf.addBook(book3));
        System.out.println(bookShelf.addBook(book4));

        System.out.println(bookShelf.removeBook(book3));

        for( Book book: bookShelf.getBooks() ){
            System.out.println(book);
        }

    }
}

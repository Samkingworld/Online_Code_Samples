package Online_Code_Samples.Week3;

import java.util.*;

public class Library {

    private String name;
    private Map<String, List<Book>> shelfMap;

    public Library(String name) {
        this.name = name;
        this.shelfMap = new HashMap<>();
    }

    public boolean addBook(String shelfName, Book book){

        for( String key: shelfMap.keySet() ){
            if( key.equalsIgnoreCase(shelfName)){
                List<Book> bookList = shelfMap.get( key );
                bookList.add(book);
                shelfMap.put(shelfName, new ArrayList<>(bookList));
                return true;
            }

        }
        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        shelfMap.put(shelfName, bookList);
        return true;
    }

    public Book removeBook(String shelfName, Book book){

        for( String key: shelfMap.keySet() ){
            if( key.equalsIgnoreCase(shelfName)){
                List<Book> bookList = shelfMap.get( key );

                for( int i = 0; i < bookList.size(); i++ ){
                    if( bookList.get(i).getTitle().toLowerCase() == book.getTitle().toLowerCase()){
                        return bookList.get(i);
                    }
                }

            }

        }
        return null;
    }

    public boolean addShelf( Shelf shelf ){

        List<Book> booksOnShelf = new ArrayList<>(Arrays.asList(shelf.getBooks()));

        for( String key: shelfMap.keySet() ){
            if( shelf.getName().equalsIgnoreCase(key)){
                List<Book> existingBooks = shelfMap.get(key);

                for( Book book : existingBooks )
                {
                    booksOnShelf.add(book);
                }

                shelfMap.put(shelf.getName(), booksOnShelf);
                return true;
            }

        }
        shelfMap.put(shelf.getName(), new ArrayList<>(Arrays.asList(shelf.getBooks())));
        return true;

    }

    public boolean borrowBook(String shelfName, Book book){

        if( shelfMap.containsKey(shelfName) ){
            List<Book> bookList = shelfMap.get(shelfName);

            if( bookList.contains( book )){
                if(!bookList.get(bookList.indexOf(book)).isBorrowed()){
                    bookList.get(bookList.indexOf(book)).setBorrowed(true);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Book>> getShelfMap() {
        return shelfMap;
    }

    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "James Bond", 2003);
        Book book2 = new Book("Python Programming", "Mike Bond", 2022);
        Book book3 = new Book("Spring Programming", "James Blend", 2013);
        Book book4 = new Book("HTML Programming", "Winnie More", 2023);

        Shelf bookShelf = new Shelf("Programming Books");
        bookShelf.addBook(book1);
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);
        bookShelf.addBook(book4);

        Book book5 = new Book("Java DSA", "James Bond", 2001);
        Book book6 = new Book("Python DSA", "Mike Bond", 2012);
        Book book7 = new Book("Spring Outlook", "James Blend", 2010);

        Library mainLibrary = new Library("Programmers Hub Library");

        mainLibrary.addShelf(bookShelf);

        for( String key : mainLibrary.getShelfMap().keySet() ){
            System.out.println("Category/Shelf Name: " + key);
            List<Book> books = new ArrayList<>(mainLibrary.getShelfMap().get(key));

            for( Book book : books ){
                System.out.println( book );
            }
        }

    }


}




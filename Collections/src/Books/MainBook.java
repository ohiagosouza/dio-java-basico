package Books;

import java.util.List;

public class MainBook {
    public static void main(String[] args) {
        BooksCatalog book1 = new BooksCatalog();
        book1.addBookToCatalog("Lord of the rings", "J.R.R Tolkien", 1954);
        book1.addBookToCatalog("O Hobbit", "J.R.R Tolkien", 1937);
        book1.addBookToCatalog("Harry Potter and the Philosopher's Stone", "J.K Rowling", 1997);

        List<Book> book1Search = book1.searchByYearInterval(1900, 2000);
        List<Book> book1SearchAuthor = book1.searchByAuthor("j.r.r tolkien");
//        System.out.println(book1Search);
        System.out.println(book1SearchAuthor);

        Book book1TitleSearch = book1.searchByTitle("Return of the King");
//        System.out.println(book1TitleSearch);
    }
}

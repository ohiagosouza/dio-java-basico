package Books;

import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {
    private List<Book> bookList;

    public BooksCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBookToCatalog(String title, String author, int publishedYear){
        bookList.add(new Book(title, author, publishedYear));
    }

    public List<Book> searchByAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<>();
        if(!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getAuthor().equalsIgnoreCase(author)){
                    booksByAuthor.add(book);
                }
            }
        }
        return booksByAuthor;
    }

    public List<Book> searchByYearInterval(int startYear, int finalYear){
        List<Book> searchByYearInterval = new ArrayList<>();
        if(!bookList.isEmpty()) {
            for(Book book : bookList) {
                if(book.getPublishYear() >= startYear && book.getPublishYear() <= finalYear){
                    searchByYearInterval.add(book);
                }
            }
        }
        return searchByYearInterval;
    }


    public Book searchByTitle(String title) {
        Book searchByTitle = null;

        if(!bookList.isEmpty()) {
            for(Book book : bookList){
                if (book.getTitle().equalsIgnoreCase(title)) {
                    searchByTitle = book;
                    break;
                }
            }
        }
        return searchByTitle;
    }

}

package soru5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("kitap1","yazar1", 89,LocalDate.now()));
        books.add(new Book("kitap2","yazar2", 112,LocalDate.now()));
        books.add(new Book("kitap3","yazar3", 421,LocalDate.now()));
        books.add(new Book("kitap4","yazar4", 75,LocalDate.now()));
        books.add(new Book("kitap5","yazar5", 323,LocalDate.now()));
        books.add(new Book("kitap6","yazar6", 50,LocalDate.now()));
        books.add(new Book("kitap7","yazar7", 234,LocalDate.now()));
        books.add(new Book("kitap8","yazar8", 154,LocalDate.now()));
        books.add(new Book("kitap9","yazar9", 421,LocalDate.now()));
        books.add(new Book("kitap10","yazar10", 90,LocalDate.now()));

        /*
        Function<Book, String> bookName = book -> book.getBookName();
        Function<Book, String> authorName = author -> author.getAuthorName();

        Map<String, String> bookMap = books.stream().collect(Collectors.toMap(bookName, authorName));
        */

        Map<String, String> bookMap = books.stream()
        								.collect(Collectors.toMap(Book::getBookName, Book::getAuthorName));
        
        bookMap.entrySet().stream().forEach(System.out::println);


        Predicate<Book> predicate = (book) -> (book.getPageCount() > 100);
        List<Book> moreThan100 =  books.stream().filter(predicate).collect(Collectors.toList());
        moreThan100.stream().forEach(System.out::println);

	}

}

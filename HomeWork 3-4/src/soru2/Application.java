package soru2;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Kitap ad�na g�re s�rala");

        Set<Book> bookSet = new TreeSet<>();

        bookSet.add(new Book("kitap1","yazar3", 234,LocalDate.now()));
        bookSet.add(new Book("kitap3","yazar1", 112,LocalDate.now()));
        bookSet.add(new Book("kitap5","yazar5", 421,LocalDate.now()));
        bookSet.add(new Book("kitap2","yazar4", 100,LocalDate.now()));
        bookSet.add(new Book("kitap4","yazar2", 323,LocalDate.now()));

        bookSet.stream().forEach(System.out::println);


        //SayfaSay�s�na g�re S�rala
        System.out.println("\nSayfa Say�s�na g�re s�rala");

        Set<Book> bookSet1 = new TreeSet<>(new Comperators());

        bookSet1.add(new Book("kitap1","yazar3", 234,LocalDate.now()));
        bookSet1.add(new Book("kitap3","yazar1", 112,LocalDate.now()));
        bookSet1.add(new Book("kitap5","yazar5", 421,LocalDate.now()));
        bookSet1.add(new Book("kitap2","yazar4", 100,LocalDate.now()));
        bookSet1.add(new Book("kitap4","yazar2", 323,LocalDate.now()));

        bookSet1.stream().forEach(System.out::println);
    }

}



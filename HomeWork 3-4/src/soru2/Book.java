package soru2;

import java.time.LocalDate;

public class Book implements Comparable<Book>{

	private String bookName;
    private String authorName;
    private int pageCount;
    private LocalDate publishDate;

    public Book(String bookName, String authorName, int pageCount, LocalDate publishDate)  {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageCount = pageCount;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book o) {



        return this.bookName.compareTo(o.bookName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", pageCount=" + pageCount +
                ", publishDate=" + publishDate +
                '}';
    }
}

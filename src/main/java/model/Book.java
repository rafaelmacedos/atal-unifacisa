package model;

public class Book implements Comparable<Book> {
    private Integer id;
    private String title;
    private String authorName;
    private Integer publicationYear;

    public Book(Integer id, String title, String authorName, Integer publicationYear) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    @Override
    public int compareTo(Book next) {
        return this.title.compareTo(next.getTitle());
    }

    @Override
    public String toString() {
        return String.format("%d | Title: %s | Author : %s | Publication Year: %d", this.id, this.title, this.authorName, this.publicationYear);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }


}

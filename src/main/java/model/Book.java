package model;

public class Book {
    private Integer id;
    private String title;
    private String authorName;
    private String publicationYear;

    public Book(Integer id, String title, String authorName, String publicationYear) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
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

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

}

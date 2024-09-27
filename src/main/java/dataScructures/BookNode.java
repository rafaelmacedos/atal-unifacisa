package dataScructures;

import model.Book;

public class BookNode {
    private Book book;
    private BookNode left;
    private BookNode right;

    public BookNode(Book book) {
        this.book = book;
        this.left = null;
        this.right = null;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookNode getLeft() {
        return left;
    }

    public void setLeft(BookNode left) {
        this.left = left;
    }

    public BookNode getRight() {
        return right;
    }

    public void setRight(BookNode right) {
        this.right = right;
    }
}

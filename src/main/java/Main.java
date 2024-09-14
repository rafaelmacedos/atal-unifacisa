import dataScructures.SequentialList;
import model.Book;

public class Main {
    public static void main(String[] args) {
        SequentialList list = new SequentialList();

        Book book1 = new Book(1, "cleito", "rafael macedo", 2023);
        Book book2 = new Book(2, "macaco", "alexgol", 2023);
        Book book3 = new Book(3, "indio", "pedro guardião da qualidade", 2023);
        Book book4 = new Book(4, "trans", "amon", 2023);
        Book book5 = new Book(5, "batman", "gb", 2023);
        Book book6 = new Book(5, "abella", "gb", 2023);
        Book book7 = new Book(5, "ricardo", "gb", 2023);
        Book book8 = new Book(5, "bruno", "gb", 2023);
        Book book9 = new Book(5, "macaco", "gb", 2023);
        Book book10 = new Book(5, "goze", "gb", 2023);
        Book book11 = new Book(5, "deficiente", "gb", 2023);
        Book book12 = new Book(5, "zix", "gb", 2023);

        list.add(book5);
        list.add(book7);
        list.add(book8);
        list.add(book6);
        list.add(book9);
        list.add(book10);
        list.add(book11);
        list.add(book1);
        list.add(book12);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book1);

        System.out.println("SEM SORT");
        list.print();
        System.out.println();
        System.out.println();

        list.sort();
        System.out.println("COM SORT");
        list.print();

    }
}

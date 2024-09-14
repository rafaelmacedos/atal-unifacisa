import dataScructures.SequentialList;
import model.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SequentialList list = new SequentialList();
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book( "Senhor dos Anéis: A Sociedade do Anel", "J.R.R Tolkien", 1954);
        Book book2 = new Book( "Diário de um banana", "Jeff Kinney", 2007);
        Book book3 = new Book("Essencialismo", "Greg McKeown", 2014);
        Book book4 = new Book("Java do Zero", "Daniel Abella", 2023);
        Book book5 = new Book( "Fundação", "Isaac Asimov", 1951);
        Book book6 = new Book("Fogo & Sangue", "George R. R. Martin", 2023);
        Book book7 = new Book("Como fazer amigos e influenciar pessoas", "Dale Carnegie", 1936);
        Book book8 = new Book("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        Book book9 = new Book("Senhor dos Anéis: As Duas Torres", "J.R.R Tolkien", 1954);
        Book book10 = new Book("Senhor dos Anéis: O Retorno do Rei", "J.R.R Tolkien", 1954);
        Book book11 = new Book("O Silmarillion", "J.R.R Tolkien", 1977);
        Book book12 = new Book("Entendendo Algoritmos", "Aditya Bhargava", 2017);

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        list.add(book7);
        list.add(book8);
        list.add(book9);
        list.add(book10);
        list.add(book11);
        list.add(book12);

        int option;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Ordenar Livros");
            System.out.println("4 - Buscar Livro por título");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addBook(list, scanner);
                    break;
                case 2:
                    listBooks(list);
                    break;
                case 3:
                    sortBooks(list);
                    break;
                case 4:
                    searchBook(list, scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (option != 0);

        scanner.close();
    }

    private static void addBook(SequentialList list, Scanner scanner) {
        System.out.println("Digite o título do livro:");
        String title = scanner.nextLine();

        System.out.println("Digite o nome do autor:");
        String authorName = scanner.nextLine();

        System.out.println("Digite o ano de publicação:");
        int publicationYear = scanner.nextInt();

        Book book = new Book(title, authorName, publicationYear);
        list.add(book);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void listBooks(SequentialList list) {
        if (list.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            list.print();
        }
    }

    private static void sortBooks(SequentialList list) {
        if (list.isEmpty()) {
            System.out.println("Nenhum livro para ordenar.");
        } else {
            list.sort();
            System.out.println("Livros ordenados com sucesso!");
            list.print();
        }
    }

    private static void searchBook(SequentialList list, Scanner scanner) {
        if (list.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        System.out.println("Digite o título do livro que deseja buscar:");
        String title = scanner.nextLine();

        for (int i = 0; i < list.size(); i++) {
            Book book = list.get(i);
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Livro encontrado: " + book);
                return;
            }
        }

        System.out.println("Livro não encontrado.");
    }
}

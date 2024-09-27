import dataScructures.BinaryTree;
import dataScructures.BookNode;
import dataScructures.SequentialList;
import model.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
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

        tree.inserir(book1);
        tree.inserir(book2);
        tree.inserir(book3);
        tree.inserir(book4);
        tree.inserir(book5);
        tree.inserir(book6);
        tree.inserir(book7);
        tree.inserir(book8);
        tree.inserir(book9);
        tree.inserir(book10);
        tree.inserir(book11);
        tree.inserir(book12);

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
                    addBook(tree, scanner);
                    break;
                case 2:
                    listBooks(tree);
                    break;
                case 3:
                    sortBooks(tree);
                    break;
                case 4:
                    searchBook(tree, scanner);
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

    private static void addBook(BinaryTree tree, Scanner scanner) {
        System.out.println("Digite o título do livro:");
        String title = scanner.nextLine();

        System.out.println("Digite o nome do autor:");
        String authorName = scanner.nextLine();

        System.out.println("Digite o ano de publicação:");
        int publicationYear = scanner.nextInt();

        Book book = new Book(title, authorName, publicationYear);
        tree.inserir(book);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void listBooks(BinaryTree tree) {
        if (tree.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            tree.imprimirArvore();
        }
    }

    private static void sortBooks(BinaryTree tree) {
        if (tree.isEmpty()) {
            System.out.println("Nenhum livro para ordenar.");
        } else {
            System.out.println("Livros ordenados com sucesso!");
            tree.imprimirArvore();
        }
    }

    private static void searchBook(BinaryTree tree, Scanner scanner) {
        if (tree.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        System.out.println("Digite o título do livro que deseja buscar:");
        String title = scanner.nextLine();

        // Inicia a busca a partir do nó raiz
        BookNode foundNode = searchBookInTree(tree.getRoot(), title);

        if (foundNode != null) {
            System.out.println("Livro encontrado: " + foundNode.getBook());
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    // Método auxiliar para busca recursiva de um livro na árvore binária
    private static BookNode searchBookInTree(BookNode node, String title) {
        if (node == null) {
            return null;  // Livro não encontrado
        }

        // Comparar o título do livro com o título do nó atual
        int comparison = node.getBook().getTitle().compareToIgnoreCase(title);

        if (comparison == 0) {
            return node;  // Livro encontrado
        } else if (comparison > 0) {
            return searchBookInTree(node.getLeft(), title);  // Buscar na subárvore à esquerda
        } else {
            return searchBookInTree(node.getRight(), title);  // Buscar na subárvore à direita
        }
    }


}

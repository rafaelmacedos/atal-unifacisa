package dataScructures;

import model.Book;

public class BinaryTree {
    private BookNode root;

    public boolean isEmpty() {
        return root == null;
    }

    public int getAltura() {
        return getAltura(this.root);
    }

    private int getAltura(BookNode root) {
        if (root == null) {
            return 0;
        }
        int altEsq = getAltura(root.getLeft());
        int altDir = getAltura(root.getRight());
        return Math.max(altEsq, altDir) + 1;
    }

    public int getQtdNode() {
        return getQtdNode(root);
    }

    private int getQtdNode(BookNode root) {
        if (root == null) {
            return 0;
        }
        return getQtdNode(root.getLeft()) + getQtdNode(root.getRight()) + 1;
    }

    public void imprimirArvore() {
        if (this.root == null) {
            System.out.println("Árvore vazia");
        } else {
            imprimirArvore(this.root);
        }
    }

    private void imprimirArvore(BookNode node) {
        if (node.getLeft() != null) {
            imprimirArvore(node.getLeft());
        }
        System.out.println(node.getBook());
        if (node.getRight() != null) {
            imprimirArvore(node.getRight());
        }
    }

    public void inserir(Book book) {
        this.root = inserir(this.root, book);
    }

    private BookNode inserir(BookNode node, Book book) {
        if (node == null) {
            return new BookNode(book);
        }
        // Comparar usando o método compareTo de Book
        if (book.compareTo(node.getBook()) < 0) {
            node.setLeft(inserir(node.getLeft(), book));
        } else if (book.compareTo(node.getBook()) > 0) {
            node.setRight(inserir(node.getRight(), book));
        }
        return node;
    }

    public BookNode remover(Book book) throws Exception {
        return remover(this.root, book);
    }

    private BookNode remover(BookNode node, Book book) throws Exception {
        if (node == null) {
            throw new Exception("Árvore vazia");
        }
        if (book.compareTo(node.getBook()) < 0) {
            node.setLeft(remover(node.getLeft(), book));
        } else if (book.compareTo(node.getBook()) > 0) {
            node.setRight(remover(node.getRight(), book));
        } else {
            // Nó com dois filhos
            if (node.getLeft() != null && node.getRight() != null) {
                BookNode minNode = encontraMinimo(node.getRight());
                node.setBook(minNode.getBook());
                node.setRight(removeMinimo(node.getRight()));
            } else {
                node = (node.getLeft() != null) ? node.getLeft() : node.getRight();
            }
        }
        return node;
    }

    private BookNode removeMinimo(BookNode node) {
        if (node.getLeft() == null) {
            return node.getRight();
        }
        node.setLeft(removeMinimo(node.getLeft()));
        return node;
    }

    private BookNode encontraMinimo(BookNode node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    public BookNode getRoot() {
        return root;
    }
}

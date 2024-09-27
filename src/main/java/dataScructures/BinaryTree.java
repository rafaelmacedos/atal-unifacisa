package dataScructures;

public class BinaryTree {
    private Node root;

    public boolean isEmpty() {
        return root == null;
    }

    public int getAltura() {
        return getAltura(this.root);
    }

    private int getAltura(Node root) {
        if (root == null) {
            return 0;
        }
        int altEsq = getAltura(root.getLeft());
        int altDir = getAltura(root.getRight());
        if (altEsq > altDir) {
            return altEsq + 1;
        } else {
            return altDir + 1;
        }
    }

    public int getQtdNode() {
        return getQtdNode(root);
    }

    private int getQtdNode(Node root) {
        if (root == null) {
            return 0;
        }
        int qtdNodeEsq = getQtdNode(root.getLeft());
        int qtdNodeDireita = getQtdNode(root.getRight());
        return qtdNodeEsq + qtdNodeDireita + 1;
    }

    public void imprimirArvore() {
        if (this.root == null)
            System.out.println("Árvore vazia");
        else
            imprimirArvore(this.root);
    }

    private void imprimirArvore(Node node) {
        if (node.getLeft() != null) {
            imprimirArvore(node.getLeft());
        }
        if (node.getRight() != null) {
            imprimirArvore(node.getRight());
        }
        System.out.println("Nó: " + node.getValue());
    }

    public void inserir(int valor) {
        inserir(this.root, valor);
    }

    public void inserir(Node node, int valor) {
        if (this.root == null) {
            this.root = new Node(valor);
        } else {
            if (valor < node.getValue()) {
                if (node.getLeft() != null) {
                    inserir(node.getLeft(), valor);
                } else {
                    // Se nodo esquerdo vazio insere o novo no aqui
                    node.setLeft(new Node(valor));
                }
                // Verifica se o valor a ser inserido é maior que o no corrente
                // da árvore, se sim vai para subarvore direita
            } else if (valor > node.getValue()) {
                // Se tiver elemento no no direito continua a busca
                if (node.getRight() != null) {
                    inserir(node.getRight(), valor);
                } else {
                    // Se nodo direito vazio insere o novo no aqui
                    node.setRight(new Node(valor));
                }
            }
        }
    }

    public Node remover(int valor) throws Exception {
        return remover(this.root, valor);
    }

    private Node remover(Node node, int valor) throws Exception {
        if (this.root == null) {
            throw new Exception("Árvore vazia");
        } else {
            if (valor < node.getValue()) {
                node.setLeft(remover(node.getLeft(), valor));
            } else if (valor > node.getValue()) {
                node.setRight(remover(node.getRight(), valor));
            } else if (node.getLeft() != null && node.getRight() != null) {
                /* 2 filhos */
                System.out.println("  Removeu No " + node.getValue());
                node.setValue(encontraMinimo(node.getRight()).getValue());
                node.setRight(removeMinimo(node.getRight()));
            } else {
                System.out.println("  Removeu No " + node.getValue());
                node = (node.getLeft() != null) ? node.getLeft() : node.getRight();
            }
            return node;
        }
    }

    private Node removeMinimo(Node node) {
        if (node == null) {
            System.out.println("  ERRO ");
        } else if (node.getLeft() != null) {
            node.setLeft(removeMinimo(node.getLeft()));
            return node;
        } else {
            return node.getRight();
        }
        return null;
    }

    private Node encontraMinimo(Node node) {
        if (node != null) {
            while (node.getLeft() != null) {
                node = node.getLeft();
            }
        }
        return node;
    }
}

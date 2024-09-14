package dataScructures;

import model.Book;

public class SequentialList {
    private static final int INITIAL_ALLOCATION = 10;
    private Book[] elements;
    private int insertedCount;

    @SuppressWarnings("unchecked")
    public SequentialList() {
        this.elements = new Book[INITIAL_ALLOCATION];
        this.insertedCount = 0;
    }

    public void add(Book element) {
        if (isEmpty()) {
            elements[0] = element;
        }

        if (insertedCount == elements.length) {
            resize();
        }

        elements[insertedCount] = element;
        insertedCount++;

    }

    public void remove(int index) {
        if (index > insertedCount || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + insertedCount);
        }

        for (int i = index; i < insertedCount - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[insertedCount - 1] = null;
        insertedCount--;
    }

    public Book get(Book element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                return element;
            }

        }
        return null;
    }

    public Book get(int index) {
        if (index > insertedCount || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + insertedCount);
        }

        return elements[index];
    }

    public int indexOf(Book element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                return i;
            }

        }
        return -1;
    }

    public boolean contains(Book element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                return true;
            }

        }
        return false;
    }

    public void set(Book element, int index) {
        if (index > insertedCount || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + insertedCount);
        }

        elements[index] = element;
    }

    public boolean isEmpty() {
        return insertedCount == 0;
    }

    public int size() {
        return insertedCount;
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public void sort() {
        var arr = this.elements;

        int n = this.size();
        boolean swapped;

        // Loop externo percorre todas as posições do array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Loop interno para comparar e trocar os elementos
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Troca os elementos se o anterior for maior que o próximo
                    Book temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Se não houve trocas, o array já está ordenado
            if (!swapped) {
                break;
            }
        }
    }

    public void print() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println(elements[i].toString());
        }
    }


    private void resize() {
        Book[] newArray = new Book[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }


}

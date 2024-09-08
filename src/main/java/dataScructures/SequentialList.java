package dataScructures;

public class SequentialList<T> {
    private static final int INITIAL_ALLOCATION = 10;
    private T[] elements;
    private int insertedCount;

    @SuppressWarnings("unchecked")
    public SequentialList() {
        this.elements = (T[]) new Object[INITIAL_ALLOCATION];
        this.insertedCount = 0;
    }

    public void add(T element) {
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

    public T get(T element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                return element;
            }

        }
        return null;
    }

    public T get(int index) {
        if (index > insertedCount || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + insertedCount);
        }

        return elements[index];
    }

    public int indexOf(T element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                return i;
            }

        }
        return -1;
    }

    public boolean contains(T element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                return true;
            }

        }
        return false;
    }

    public void set(T element, int index) {
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

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }


}

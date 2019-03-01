package ArrListLinkedList;

public class LinkedList<T> implements List<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    // создать отдельный класс с тестами
    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> previous;
        Node(Node<T> previous, T element, Node<T> next)  {
            this.item = element;
            this.next = next;
            this.previous = previous;
        }
    }

    @Override
    public T get(int indexOfElement) {
        if (indexOfElement < 0 || indexOfElement >= size) {
            throw new ArrayIndexOutOfBoundsException("index: " + indexOfElement + "size: " + size);
        }
        Node<T> start = first;
        while (indexOfElement > 0) {
            start = start.next;
            indexOfElement--;
        }
        return start.item;
    }

    @Override
    public void add(T t) {
        Node<T> newNode;
        if (size == 0) {
            // если лист пустой - добавляем элемент с двумя ссылками на нулл
           newNode = new Node<>(null, t, null);
           first = newNode;
           last = newNode;
        } else {
            // если не пустой, то добавляем элемент в конец листа и переопределяем
            // ссылку на последний элемент
            newNode = new Node<>(last, t, null);
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void remove(int indexOfElement) {
        checkingExsistanceOfCurrentIndex(indexOfElement);
        Node<T> current = first;
        for (int i = 0; i < indexOfElement; i++) {
            current = current.next;
        }
        if (0 == indexOfElement) {
            first = first.next;
            first.previous = null;
        } else if (indexOfElement == size - 1) {
            last = last.previous;
            last.next = null;
        } else {
            current.next.previous = current.previous;
            current.previous.next = current.next;
        }
        size--;
    }

    private void checkingExsistanceOfCurrentIndex(int indexOfElement) {
        if (indexOfElement < 0 || indexOfElement >= size) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int size() {
        return size;
    }
}
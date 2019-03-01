package ArrListLinkedList;

public interface List<T> {
    T get(int i) throws Exception;
    void add(T t);
    void remove(int i) throws Exception;
    int size();
}

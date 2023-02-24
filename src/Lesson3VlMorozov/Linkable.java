package Lesson3VlMorozov;

public interface Linkable<E> {
    void addElement(E e);

    int size();

    E getElementByIndex(int index);
}

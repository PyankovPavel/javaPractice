package Lesson3VlMorozov;

import java.util.Iterator;

public class AlaLinkedList<E> implements Linkable<E>, Iterable<E> {
    public static void main(String[] args) {
        AlaLinkedList<Integer> list = new AlaLinkedList<>();
        list.addElement(5);
        list.addElement(15);
        list.addElement(222);
        list.addElement(333);

        for (Integer n : list) {
            System.out.println(n);
        }

    }

    private Node<E> firstNode;
    private Node<E> lastNode;
    int size = 0;

    public AlaLinkedList() {
        firstNode = new Node<E>(null, lastNode, null);
        lastNode = new Node<E>(null, null, firstNode);
    }

    @Override
    public void addElement(E e) {
        Node<E> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node<>(null, next, null);
        next.setPreviousElement(firstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int index) {
        Node<E> result = firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            result = getNextEl(result);
        }
        return result.getCurrentElement();
    }

    private Node<E> getNextEl(Node<E> current) {
        return current.getNextElement();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public E next() {
                return getElementByIndex(count++);
            }
        };
    }


    public static class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> previousElement;

        public Node(E currentElement, Node<E> nextElement, Node<E> previousElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.previousElement = previousElement;
        }


        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPreviousElement() {
            return previousElement;
        }

        public void setPreviousElement(Node<E> previousElement) {
            this.previousElement = previousElement;
        }
    }
}

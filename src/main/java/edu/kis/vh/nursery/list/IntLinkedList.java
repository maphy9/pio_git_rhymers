package edu.kis.vh.nursery.list;

/**
 * Linked list data structure implementation for int data type
 */
public class IntLinkedList {

    private static final int IS_EMPTY = -1;
    private Node last;
    private int i;  // TODO: this variable is never used - it could be removed

    /**
     * Adds i to the back of the linked list
     * @param i
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Returns true if the linked list is empty and false otherwise
     * @return
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Returns true if the linked list is full and false otherwise
     * @return
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Returns the value of the last node in linked list
     * @return
     */
    public int top() {
        if (isEmpty())
            return IS_EMPTY;
        return last.getValue();
    }

    /**
     * Removes the last node from the linked list and returns its value
     * @return
     */
    public int pop() {
        if (isEmpty())
            return IS_EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}

class Node {

    private final int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

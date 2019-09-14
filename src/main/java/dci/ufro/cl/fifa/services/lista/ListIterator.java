package dci.ufro.cl.fifa.services.lista;

import java.util.Iterator;

public class ListIterator<T> implements Iterator<T> {

    ListNode current;

    // initialize pointer to head of the list for iteration
    public ListIterator(MyLinkedList<T> list)
    {
        current = list.getHead();
    }

    // returns false if next element does not exist
    public boolean hasNext()
    {
        return current != null;
    }

    // return current data and update pointer
    public T next()
    {
        T data = (T)current.getData();
        current = current.getNode();
        return data;
    }

}
package dci.ufro.cl.fifa.services.lista;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

    private int size = 0;
    private ListNode node; // root node
    private ListNode tail;

    /**
     * Add element at last.
     *
     * @param data
     */
    public void add(T data) {
        if (data == null) {
            return;
        }
        if (size==0) {
            node = new ListNode(data);
            tail = node;
            size++;
        } else {
            ListNode newNode = new ListNode(data);
            // To add new node, find the last node of the linked list
            // and link last node to newly created node.
            ListNode lastNode = tail;
            lastNode.setNode(newNode);
            tail = newNode;
            size++;
        }

    }

    private ListNode next(ListNode node) {
        if (node.getNode() != null) {
            return node.getNode();
        } else {
            return null;
        }
    }

    public int size() {
        return this.size;
    }

    public ListNode getHead(){
        return node;
    }

    public  T get(int i){
        if(i>=size()){
            throw new IndexOutOfBoundsException("Index out bounds, index bigger than size");
        }else{
            ListNode ld = node;
            for(int j = 0; j<i;j++){
                ld = ld.getNode();
            }
            return (T) ld.getData();
        }
    }


    @Override
    public Iterator iterator() {
        return new ListIterator<T>(this);
    }

}

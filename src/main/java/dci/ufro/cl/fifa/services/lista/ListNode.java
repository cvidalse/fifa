
package dci.ufro.cl.fifa.services.lista;

public class ListNode {

    private Object data;

    private ListNode node;

    public ListNode(Object data) {
        this.data = data;
    }

    public ListNode getNode() {
        return node;
    }

    public void setNode(ListNode node) {
        this.node = node;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data+"" ;
    }
    
}

public class Node<E> {

    private E val;
    private Node<E> prev;
    private Node<E> next;

    public Node(E thing){
        val = thing;
    }

    public void setVal(E val) {
        this.val = val;
    }

    public void setNext(Node<E> next) {
        this.next = next;
        if(this.next != next){
            next.setPrev(this);
        }
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
        if(this.prev != prev){
            prev.setNext(this);
        }
    }

    public Node<E> getNextNode() {
        return next;
    }

    public Node<E> getPrevNode() {
        return prev;
    }

    public E getVal() {
        return val;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class DoublyLinkedList implements List{

    private int big = 0;
    private Node<Object> first;

    @Override
    public void add(Object element) {
        if (first == null){
            this.first = new Node<>(element);
            this.big++;
            return;
        }
        Node<Object> next = this.first;
        for(int i = 0; i < big - 1; i++){
            next = next.getNextNode();
        }
        next.setNext(new Node<>(element));
        big ++;
    }

    @Override
    public void add(int i, Object element) throws IndexOutOfBoundsException {
        if (first == null){
            this.first = new Node<>(element);
            this.big++;
            return;
        }
        if (i == 0){
            first.setPrev(new Node<>(element));
            first = first.getPrevNode();
            return;
        }
        Node<Object> next = first;
        for(int j = 0; j < i - 1; j++){
            next = next.getNextNode();
        }
        Node<Object> md = next;
        next = md.getNextNode();
        next.setPrev(new Node<>(element));
        md.setNext(next.getPrevNode());
        big++;
    }

    @Override
    public Object remove() {
        Node<Object> next = first;
        big--;
        for(int j = 0; j < big; j++){
            next = next.getNextNode();
        }
        next.setNext(null);
        return next.getVal();
    }

    @Override
    public Object remove(int i) throws IndexOutOfBoundsException {
        Node<Object> next = first;
        big--;
        for(int j = 0; j < i; j++){
            next = next.getNextNode();
        }
        next.setPrev(null);
        next.setNext(null);
        return next.getVal();
    }

    @Override
    public Node get(int i) throws IndexOutOfBoundsException {
        Node<Object> next = first;
        for(int j = 0; j < i; j++){
            next = next.getNextNode();
        }
        return next;
    }

    @Override
    public void set(int i, Object element) throws IndexOutOfBoundsException {
        Node<Object> next = first;
        for(int j = 0; j < i; j++){
            next = next.getNextNode();
        }
        next.setVal(element);
    }

    @Override
    public int size() {
        return big;
    }

    @Override
    public boolean isEmpty() {
        return big <= 0;
    }
}

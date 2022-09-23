public class DoublyLinkedListNode<T> {
    private T data;
    private DoublyLinkedListNode next;
    private DoublyLinkedListNode prev;


    public DoublyLinkedListNode(T data){
        this.data = data;
        prev = null;
        next = null;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data= data;
    }
    public DoublyLinkedListNode<T> getNext(){
        return next;
    }
    public void setNext(DoublyLinkedListNode<T> next){
        this.next=next;
    }

    public DoublyLinkedListNode<T> getPrev(){
        return prev;
    }
    public void setPrev(DoublyLinkedListNode<T> prev){
        this.prev=prev;
    }

}

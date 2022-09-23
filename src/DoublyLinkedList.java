public class DoublyLinkedList<T>{
    private DoublyLinkedListNode<T> first;
    private DoublyLinkedListNode<T> last;
    private int size =0;
    public DoublyLinkedList(){
        first = null;
        last=null;
    }
    public void addLast(T data){
        DoublyLinkedListNode<T> temp = new DoublyLinkedListNode<>(data);
        if(first==null && last==null){
            first = temp;
            last = temp;
        }else{
            //point new node to last
            last.setNext(temp);
            temp.setPrev(last);
            last = temp;

        }
        size++;
    }
    public void addFirst(T data){
        DoublyLinkedListNode<T> temp = new DoublyLinkedListNode<>(data);

        //edge case:empty list
        if(first==null && last==null){
            first = temp;
            last = temp;
        }else{
            //point new node to first
            temp.setNext(first);
            first.setPrev(temp);
            first = temp;
        }
        size ++;
    }
    public T removeFirst(){
        if(first ==null){
            throw new NullPointerException("MyLinkedList is empty");
        }
        first = first.getNext();
        first.setPrev(null);
        return null;
    }
    public T removeIndex(int n){
        DoublyLinkedListNode<T> IndexNum= first;
        int count = 0;
        while(count != n){
            IndexNum = IndexNum.getNext();
            count++;
        }
        IndexNum.getPrev().setNext(IndexNum.getNext());
        IndexNum.getNext().setPrev(IndexNum.getPrev());
        return null;
    }
    public T addIndex(int n,T data){
        DoublyLinkedListNode<T> prevNumOnIndex = first;
        DoublyLinkedListNode<T> temp = new DoublyLinkedListNode<>(data);
        int count = 0;
        while(count != n){
            prevNumOnIndex = prevNumOnIndex.getNext();
            count++;
        }
        temp.setPrev(prevNumOnIndex);
        temp.setNext(prevNumOnIndex.getNext());
        prevNumOnIndex.getNext().setPrev(temp);
        prevNumOnIndex.setNext(temp);
        return null;
    }
    public T removeLast(){
        if(first ==null){
            throw new NullPointerException("MyLinkedList is empty");
        }
        if(first == last){
            first = null;
            last = null;
        }
        last = last.getPrev();
        last.setNext(null);
        return null;
    }
    public  int size(){
        return size;
    }

    public String toString(){
        DoublyLinkedListNode<T> current = first;
        String out = "";
        while(current != null){
            out += current.getData() + "->";
            current = current.getNext();
        }
        out += "null";
        return out;
    }

}

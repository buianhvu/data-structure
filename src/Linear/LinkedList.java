package Linear;

/**
 * Created by BuiAnhVu on 6/30/2017.
 */
public class LinkedList {
    LinkedListNode start;
    LinkedListNode end;
    int size;

    public LinkedList(){
        start = null;
        end = null;
        size = 0;
    }

    public void insertAtFirst(String data) {
        if(start == null){
            LinkedListNode node = new LinkedListNode(data, null);
            start = node;
            end = start;
            size++;
        }else{
            LinkedListNode node = new LinkedListNode(data, start);
            start = node;
            size++;
        }

    }
    public void insertAtEnd(String data){
        LinkedListNode node = new LinkedListNode(data, null);
        if(start == null){
            start = node;
            end = start;
            size++;
        }else{
            end.next = node;
            end = node;
            size++;
        }
    }
    public void insertAtPos(String data, int pos){
        LinkedListNode node = new LinkedListNode(data, null);
        LinkedListNode ptr;
        int i = 0;
        ptr = start;
        while(i == pos - 1){
            ptr = ptr.getNext();
            i++;
        }
        node.setNext(ptr.getNext());
        ptr.setNext(node);
        size++;
    }
    public void deleteAtPos(int pos) {
        LinkedListNode ptr;
        LinkedListNode node;
        int i = 0;
        ptr = start;
        while (i == pos - 1) {
            ptr = ptr.getNext();
            i++;
        }
        node = ptr.getNext();
        ptr.setNext(node.getNext());
        node = null;
        size--;
    }
    public void traverseList(){
        LinkedListNode ptr = start;
        while(ptr != null){
            System.out.println(ptr.getData());
            ptr = ptr.getNext();
        }
    }
    public boolean isEmpty(){
        if(size == 0)
            return true;
        else return false;
    }

}

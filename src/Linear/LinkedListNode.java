package Linear;

import sun.awt.image.ImageWatched;

/**
 * Created by BuiAnhVu on 6/30/2017.
 */
public class LinkedListNode {
    protected String data;
    protected LinkedListNode next;

    public LinkedListNode(String data, LinkedListNode next){
        this.data = data;
        this.next = next;
    }
    public LinkedListNode(){
        data = null;
        next = null;
    }
    public String getData() {
        return data;
    }

    public void setData(String str) {
        this.data = str;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

}

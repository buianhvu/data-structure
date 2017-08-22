package Linear;

/**
 * Created by BuiAnhVu on 6/30/2017.
 */
public class Queue <T>{
    T arr[];
    int maxSize;
    int front;
    int rear;
    public Queue(int size){
        maxSize = size;
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        if(front == -1 && rear == -1){
            return true;
        }
        else
            return false;
    }
    public boolean isFull(){
        if( (rear + 1)%maxSize == front ){
            return true;
        }
        else
            return false;
    }
    public T deQueue(){
        if(isEmpty()){
            System.out.println("Linear.Queue is empty !");
            return null;
        }
        else if(front == rear){ // only 1 element in queue
            T str = arr[front];
            front = -1;
            rear = -1;
            return str;
        }
        else{
            T temp = arr[front];
            front = (front + maxSize)%maxSize;
            return temp;
        }

    }
    public void enQueue(T str) {
        if(isFull()){
            System.out.println("Linear.Queue is full !");
        }else if (isEmpty()) {
            rear = 0;
            front = 0;
            arr[0] = str;
        }else{
            int i = (rear + 1)%maxSize;
            arr[i] = str;
            rear = i;
        }
    }
    public T getFront(){
        if(!isEmpty()){
            return arr[front];
        }
        else {
            System.out.println("Linear.Queue is empty !");
            return null;
        }
    }
}

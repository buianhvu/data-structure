package Linear;

/**
 * Created by BuiAnhVu on 6/30/2017.
 */
public class Stack {
    private int maxSize;
    private String arr[];
    private int top;
    public Stack(int size){
        maxSize = size;
        arr = new String[maxSize];
        top = 0;
    }


    public boolean isEmpty(){
        if (top == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public void push(String str){
        if(top < maxSize){
            arr[top] = str;
            top++;
        }
        else{
            System.out.println("Linear.Stack Overflow!");
        }
    }
    public String pop(){
        String temp = this.peek();
        if(isEmpty()){
            return null;
        }else {
            arr[top-1] = null;
            top = top - 1;
            return temp;
        }
    }
    public String peek(){
        if(!isEmpty()) {
            return arr[top - 1];
        }
        else{
            return null;
        }
    }
}

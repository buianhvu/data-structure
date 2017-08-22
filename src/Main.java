import Linear.LinkedList;

import java.util.Scanner;

/**
 * Created by BuiAnhVu on 6/30/2017.
 */
public class Main {
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        Scanner textscan=new Scanner(System.in);
        String s;
        int choice;
        LinkedList myList = new LinkedList();
        // testing stack

//        Linear.Stack myStack = new Linear.Stack(4);
//        myStack.push("1");
//        System.out.println(myStack.pop());
//        myStack.push("2");
//        System.out.println(myStack.peek());
//        myStack.push("3");
//        System.out.println(myStack.peek());
//        myStack.push("4");
//        System.out.println(myStack.peek());
//        myStack.push("5");
//        System.out.println(myStack.peek());

        //testing queue

//        Linear.Queue myQueue = new Linear.Queue(3);
//        myQueue.enQueue("1");
//        System.out.println(myQueue.deQueue());
//        myQueue.enQueue("2");
//        System.out.println(myQueue.deQueue());
//        myQueue.enQueue("3");
//        System.out.println(myQueue.deQueue());
//        myQueue.enQueue("4");
//        System.out.println(myQueue.deQueue());

        //testing linkedlist
        do{
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. traverse");
            choice = scan.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter string: ");
                    s = textscan.nextLine();
                    myList.insertAtFirst(s);
                    break;
                case 2:
                    System.out.println("Enter string: ");
                    s = textscan.nextLine();
                    myList.insertAtEnd(s);
                    break;
                case 3:
                    System.out.println("Enter string: ");
                    s = textscan.nextLine();
                    System.out.println("Enter Pos");
                    int pos = scan.nextInt();
                    myList.insertAtPos(s, pos);
                    break;
                case 4:
                    int pos2 = scan.nextInt();
                    myList.deleteAtPos(pos2);
                    break;
                case 5:
                    if(myList.isEmpty()){
                        System.out.println("Empty");
                    }else
                        System.out.println("Not empty");
                    break;
                case 6:
                    myList.traverseList();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Enter choice again !");

            }
        }while(choice != 7);

    }
}

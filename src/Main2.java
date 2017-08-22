import Linear.BinarySearchTree;

import java.util.Scanner;

/**
 * Created by BuiAnhVu on 7/3/2017.
 */
public class Main2 {
    public static void main(String arg[]) {

        //tree testing
        Scanner scan = new Scanner(System.in);
        Scanner textscan = new Scanner(System.in);
        BinarySearchTree bstTree = new BinarySearchTree();
        String s;
        int choice;
        bstTree.insertNode(1);
        bstTree.insertNode(2);
        bstTree.insertNode(3);
        bstTree.insertNode(4);
        bstTree.insertNode(5);
        bstTree.insertNode(6);
        bstTree.insertNode(7);
        if(bstTree.findNode(2) != null){
            System.out.println("found");
        }

        bstTree.preOrder(bstTree.root);
        System.out.println("After delete");
        bstTree.deleteNode(4);
        bstTree.preOrder(bstTree.root);
        System.out.println("Post Order");
        bstTree.postOrder(bstTree.root);
        System.out.println("In Order");
        bstTree.inOrder(bstTree.root);


    }
}


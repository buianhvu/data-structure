package Linear;

/**
 * Created by BuiAnhVu on 7/3/2017.
 */
public class BinarySearchTree {
    public bstNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public bstNode findNode(int data) {
        bstNode current = root;
        while (current != null) {
            if (current.data == data) {
                return current;
            } else if (data < current.data) {
                current = current.leftChild;
            } else
                current = current.rightChild;
        }
        return null;
    }

    public void insertNode(int data) {
        bstNode node = new bstNode(data);
        bstNode current;
        bstNode parent;
        if (root == null) {
            root = node;
            return;
        }
        current = root;
        parent = null;
        while (true) {
            parent = current;
            if (data < current.data) {
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = node;
                    return;
                }
            } else if (data > current.data) {
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = node;
                    return;
                }
            }
        }
    }

    public void displayNode(bstNode node) {
        System.out.println("data: " + node.data);
    }

    public bstNode findSuccessor(bstNode node) {
        // find the node has the smallest value of right-subtree
        bstNode successor = null;
        bstNode successorPartent = null;
        bstNode current = node.rightChild;
        while (current.leftChild != null) {
            successorPartent = successor;
            successor = current;
            current = current.leftChild;
        }
        //check if the successor has right child, make it the leftchild of successorParent
        if (successor != node.rightChild) {
            successorPartent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }
        return successor;
    }

    public boolean deleteNode(int data) {
        bstNode parent = root;
        bstNode current = root;
        boolean isLeftChild = false;
        while (current.data != data) {
            parent = current;
            if (current.data > data) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                current = current.rightChild;
                isLeftChild = false;
            }
            if (current == null) {
                return false;
            }
        }
        // if node to delete has no children
        if (current.rightChild != null && current.leftChild != null) {
            if (current == root) {
                root = null;
            }
            if (isLeftChild) {
                parent.leftChild = null;
            } else
                parent.rightChild = null;
        }
        else if (current.rightChild == null) {
            if(current == root){
                root = current.leftChild;
            }
            if(isLeftChild){
                parent.leftChild = current.leftChild;
            }
            else{
                parent.rightChild = current.leftChild;
            }
        }
        else if(current.leftChild == null){
            if (current == root){
                root = current.rightChild;
            }
            if(isLeftChild){
                parent.leftChild = current.rightChild;
            }
            else{
                parent.rightChild = current.rightChild;
            }
        }
        else if(current.leftChild != null && current.rightChild != null){
            bstNode node;
            node = findSuccessor(current);
            if(current == root){
                root = node;
            }
            else if(isLeftChild){
                parent.leftChild = node;
            }else{
                parent.rightChild = node;
            }
            node.leftChild = current.leftChild;
        }
        return true;
    }

    public void preOrder(bstNode root){
        if(root == null)
            return;
        System.out.println(root.data + " ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }
    public void inOrder(bstNode root){
        if(root == null)
            return;
        inOrder(root.leftChild);
        System.out.println(root.data + " ");
        inOrder(root.rightChild);
    }
    public void postOrder(bstNode root){
        if(root == null)
            return;
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.println(root.data + " ");
    }
}
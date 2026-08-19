
import java.util.*;
public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // INSERT
    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // INORDER
    public static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // SEARCH
    public static boolean search(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }

    // DELETE
    public static Node delete(Node root, int val) {

        if (root == null) {
            return null;
        }

        if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else if (root.data > val) {
            root.left = delete(root.left, val);
        }
        else {

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Only right child
            if (root.left == null) {
                return root.right;
            }

            // Case 2: Only left child
            else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node IS = findInorderSuccessor(root.right);

            root.data = IS.data;

            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    // INORDER SUCCESSOR
    public static Node findInorderSuccessor(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    // PRINT VALUES IN RANGE
    public static void printInRange(Node root, int k1, int k2) {

        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {

            printInRange(root.left, k1, k2);

            System.out.print(root.data + " ");

            printInRange(root.right, k1, k2);
        }

        else if (root.data < k1) {

            printInRange(root.right, k1, k2);
        }

        else {

            printInRange(root.left, k1, k2);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("N");
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
     if(root==null){
        return;
     }
  path.add(root.data);
     if(root.left==null && root.right==null){
            printPath(path);
        }
  printRoot2Leaf(root.left,path);
  printRoot2Leaf(root.right,path);
  path.remove(path.size()-1);
    }
public static boolean isValidBST(Node root,Node min,Node max){
    if(root==null){
        return true;
    }
    if(min!=null && root.data>=min.data){
        return false;
    }
    else if(max!=null && root.data>=max.data){
        return false;
    }
    return isValidBST(root.left,min,max) && isValidBST(root.right,root,max);
}
    public static void main(String args[]) {

        int values[] = {8, 5, 3, 1, 6, 10, 11, 14};

        Node root = null;

        // Create BST
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // Inorder
        inorder(root);
        System.out.println();

        // Delete
        root = delete(root, 1);

        System.out.println("After deleting 1:");
        inorder(root);
        System.out.println();

        // Print range
        System.out.println("Values between 5 and 12:");
        printInRange(root, 5, 12);

        printRoot2Leaf(root,new ArrayList<>());
        if(isValidBST(root,null,null)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
    }
}
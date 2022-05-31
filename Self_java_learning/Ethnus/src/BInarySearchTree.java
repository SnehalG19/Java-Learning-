package ethnusday4;
import java.util.*;
public class BInarySearchTree {
    class Node{
        int key;
        Node left,right;

        public Node(int item){
            key=item;
            left=right=null;
        }

    }
    Node root;

    BInarySearchTree() {


        root=null;
    }
    BInarySearchTree(int value)
    {
        root=new Node(value);
    }
    void  insert (int key){
        root=insertRec(root,key);
    }
    Node insertRec(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key)
            root.left=insertRec(root.left,key);
        else if(key>root.key)
            root.right=insertRec(root.right,key);

        return root;
    }
    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node root){
        if(root==null){
            insertRec(root,left);
            System.out.println(root, key);
            inorderRec(root,right);
        }
    }
    public static void main(String[] args){
        BInarySearchTree tree=new BInarySearchTree();
        tree.insert(50);
        tree.insert(25);
        tree.insert(60);
        tree.insert(12);
        tree.insert(36);
    }




}

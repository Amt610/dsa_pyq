package Trees;


import org.w3c.dom.Node;

public class TreeStarting001 {

    //Create node class of Root
    public static class Node{
        int val;
        Node left;
        Node right;
    }


    public static void main(String[] args) {
        //Create node and define
        Node root=new Node();
        root.val=1;
        System.out.println(root.val);

        // define another root elements
        Node a=new Node();
        a.val=2;
        System.out.println(a.val);
    }
}

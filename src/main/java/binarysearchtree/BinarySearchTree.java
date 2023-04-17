package binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public Node root;

    public class Node {

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    public ArrayList<Integer> BFS(){
        Node currentNode=root;
        Queue<Node> queue=new LinkedList<>();
        ArrayList<Integer>results=new ArrayList<>();
        queue.add(currentNode);
        while(queue.size()>0){
            currentNode=queue.remove();
            results.add(currentNode.value);
        }if(currentNode.left !=null){
            queue.add(currentNode.left);
        }if(currentNode.right!=null){
            queue.add(currentNode.right);
        }
        return results;
    }


    public boolean contain(int value) {
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;

            } else {
                return true;
            }
        }
        return false;
    }
 public ArrayList<Integer> DFSPreorder(){ //depth first search pre order
        ArrayList<Integer> result=new ArrayList<>();

        class Traverse{

            public Traverse(Node currentNode){
                 result.add(currentNode.value);
                if(currentNode.left!=null){
                    new Traverse(currentNode.left);
                }if(currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
            }

        }

 new Traverse(root);
return result;
 }
 public ArrayList<Integer> DFSPostOrder(){
        ArrayList<Integer>result=new ArrayList<>();

        class Traverse{
            Traverse(Node curretNode){
                if(curretNode.left !=null){
                    new Traverse(curretNode.left);
                }
                if(curretNode.right !=null){
                    new Traverse(curretNode.right);

                }
                result.add(curretNode.value);
            }}
            new Traverse(root);
        return result;
        }
    public ArrayList<Integer> DFSInOrder(){
        ArrayList<Integer>result=new ArrayList<>();

        class Traverse{
            Traverse(Node curretNode){
                if(curretNode.left !=null){
                    new Traverse(curretNode.left);

                }
                result.add(curretNode.value);
                if(curretNode.right !=null){
                    new Traverse(curretNode.right);

                }

            }}
        new Traverse(root);
        return result;
    }


public boolean insert(int value){

    Node newNode = new Node(value);
    if (root == null) {
        root = newNode;
        return true;
    } else {
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) {
                return false;
            }
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }}}

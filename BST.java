import java.io.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}
class BST{
    public Node root=null;
    void insert(int data){
        Node n=new Node(data);
        if(root==null){
            root=n;
        }
        else{
            Node temp=root;
            int count=0;
            while(count!=1){
                if(temp.data>n.data){
                    if(temp.left==null){
                       temp.left=n;
                       count++;
                    }
                    else{
                        temp=temp.left;
                    }
                }
                else if(temp.data<n.data){
                    if(temp.right==null){
                         temp.right=n;
                         count++;
                    }
                    else{
                        temp=temp.right;
                    }
            }
        }
    }
}
}
public class Main{
    public static void main(String args[]){
        
        BST a=new BST();
        a.insert(5);
        a.insert(3);
        a.insert(2);
        a.insert(4);
        a.insert(7);
        a.insert(8);
    }
}

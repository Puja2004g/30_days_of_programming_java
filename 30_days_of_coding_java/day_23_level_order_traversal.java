import java.util.*;
// import java.io.*;

class Node_{
    Node_ left,right;
    int data;
    Node_(int data){
        this.data=data;
        left=right=null;
    }
}
class day_23_lavel_order_traversal{

static void levelOrder(Node_ root){
      //Write your code here
      if(root==null){
          return;
      }
      
      Queue<Node_> q= new LinkedList<>();
      q.add(root);
      
      while(!q.isEmpty()){
          Node_ current=q.peek();
          System.out.print(current.data + " ");
          q.remove();
          
          if(current.left!=null){
              q.add(current.left);
          }
          if(current.right!=null){
              q.add(current.right);
          }
      }
      
    }

public static Node_ insert(Node_ root,int data){
        if(root==null){
            return new Node_(data);
        }
        else{
            Node_ cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node_ root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
            sc.close();
        }	
}
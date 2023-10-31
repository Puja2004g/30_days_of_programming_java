// import java.io.*;
import java.util.*;
class Node2{
	int data;
	Node2 next;
	Node2(int d){
        data=d;
        next=null;
    }
	
}
class day_24_more_linked_list
{

    public static Node2 removeDuplicates(Node2 head) {
      //Write your code here
      if(head==null){
                return head;
            }
            Node2 temp=head;
            while(temp.next!=null){
                if(temp.next.data==temp.data){
                    temp.next=temp.next.next;
                }
                else{
                    temp=temp.next;
                }
            }
            return head;

    }

	 public static  Node2 insert(Node2 head,int data)
     {
        Node2 p=new Node2(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node2 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node2 head)
        {
              Node2 start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node2 head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);
            sc.close();
       }
    }
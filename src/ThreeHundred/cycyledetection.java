package ThreeHundred;

import java.util.LinkedList;
class LinkedListIm{
    static Node head;
    class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){this.data=data;}
    }

    public void insert(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        // If *head equals to null
        if (head == null) {
            head = temp;
            return;
        }
        else {
            Node last_node = head;
            while (last_node.next != null)
                last_node = last_node.next;
            last_node.next = temp;
            return;
        }
    }
    public void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public Node reverse(Node n ){
        if(n==null)
            return n;
        Node prev=null;
        Node curr=n;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;                   //1-> 2-> 3  // null<-1
            prev=curr;
            curr=next;
        }
        n=prev;
        return n;
    }

}
public class cycyledetection{
    public static void main(String[] args) {
        LinkedListIm l = new LinkedListIm();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);

        l.display();
        l.head=l.reverse(l.head);
        System.out.println("After reversing the list");
        l.display();
    }

}

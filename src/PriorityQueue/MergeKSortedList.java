package PriorityQueue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class MergeKSortedList {
    public static void main(String[] args) {

    }
    public ListNode mergeKLists(ListNode[] lists)
    {
        PriorityQueue<ListNode> p = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for (int i = 0; i <lists.length ; i++) {
            if(lists[i]!=null)
                p.add(lists[i]);  //phle sari values insert krlenge har node ka first pointer jb vo null na ho
        }
        ListNode dummy = new ListNode(); // nyi dummy list bnaynge taki usme hm sort krke add kr ske
        ListNode temp=dummy;
        while (!p.isEmpty())
        {
            ListNode r =p.poll();
            dummy.next=r;
            dummy=dummy.next;
            if(r.next!=null)
                p.add(r.next);   //add krnge next node kp agr vo null nhi h to
        }
        return temp.next;
    }
}

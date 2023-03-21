package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int num[]={3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(num,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p= new PriorityQueue<>(); //by default it is min heap
        //PriorityQueue<Integer> p= new PriorityQueue<>(Collections.reverseOrder()); //for max heap

        for(int i=0;i<k;i++)
        {
            p.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if(nums[i] >p.peek())
            {
                p.poll(); //remove the value
                p.add(nums[i]);
            }
        }
        return p.peek();
    }
}

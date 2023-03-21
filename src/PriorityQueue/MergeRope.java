package PriorityQueue;

import java.util.PriorityQueue;

public class MergeRope {
    public static void main(String[] args) {
        int[]arr={2,1,3,4};
        System.out.println(cost(arr));
    }
    public static int cost(int[]arr)
    {
        int sum=0;
        PriorityQueue<Integer> p= new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            p.add(arr[i]);
        }
        while(p.size()>1)
        {
            int a=p.poll();
            int b=p.poll();
            sum+=(a+b);
            p.add(a+b);
        }
        return sum;
    }
}

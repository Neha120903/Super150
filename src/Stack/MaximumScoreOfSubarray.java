package Stack;

import java.util.Stack;

public class MaximumScoreOfSubarray {
    public static void main(String[] args) {
        int []arr={1,4,3,7,4,5};
        int k=3;
        System.out.println(are(arr,k));
    }
    public static int are(int[]arr, int k)
    {
        java.util.Stack<Integer> s= new Stack<>();
        int maxarea=0;
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && arr[i]<arr[s.peek()]) {
                int h = arr[s.pop()];
                int r = i;
                if(r-1>=k) {
                    if (s.isEmpty())
                        maxarea = Math.max(maxarea, h * r);
                    else {
                        int l = s.peek();
                        if(l+1<=k)
                            maxarea = Math.max(maxarea, h * (r - l - 1));
                    }
                }
            }
            s.push(i);
        }
        int r=arr.length;
        while(!s.isEmpty() ) {
            int h = arr[s.pop()];

            if(r-1>=k) {
                if (s.isEmpty())
                    maxarea = Math.max(maxarea, h * r);
                else {
                    int l = s.peek();
                    if(l+1<=k)
                        maxarea = Math.max(maxarea, h * (r - l - 1));
                }
            }
        }
        return maxarea;
    }
}

package Stack;

import java.util.Scanner;
import java.util.Stack;
//divide and conquer and using 2 array
public class Histogram {
    public static void main(String[] args) {
        int []arr={2,3,5,4,6,1,7};
        System.out.println(are(arr));
    }

    public static int are(int[]arr)
    {
        Stack<Integer> s= new Stack<>();
        int maxarea=0;
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && arr[i]<arr[s.peek()]) {
                int h = arr[s.pop()];
                int r = i;
                if (s.isEmpty())
                    maxarea = Math.max(maxarea, h * r);
                else {
                    int l=s.peek();
                    maxarea=Math.max(maxarea,h*(r-l-1));
                }
            }
            s.push(i);
        }
        int r=arr.length;
        while(!s.isEmpty() ) {
            int h = arr[s.pop()];

            if (s.isEmpty())
                maxarea = Math.max(maxarea, h * r);
            else {
                int l=s.peek();
                maxarea=Math.max(maxarea,h*(r-l-1));
            }
        }
        return maxarea;
    }
}

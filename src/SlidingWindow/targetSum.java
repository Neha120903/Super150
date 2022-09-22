package SlidingWindow;

import java.util.Scanner;
import java.util.Arrays;
public class targetSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++)
            arr[i] = s.nextInt();
        int target = s.nextInt();
        Arrays.sort(arr);
        target(arr,n,target);
    }
    public static void target(int[] arr, int n, int target){
        int start =0;
        int end = n-1;
        while(start <end)
        {
            int sum = arr[start]+arr[end];
            if(sum > target)
            {
                end--;
            }
            else if(sum < target)
            {
                start++;
            }
            else if (sum == target){
                System.out.println(arr[start]+" "+arr[end]);
                start++;
                end--;
            }
        }
    }
}

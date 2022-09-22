package Array;

import java.util.Scanner;

public class MaximumSumOfK {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[] arr={2,3,4,2,5,6,78,90};
        int k=3;
        System.out.println(maximumSum(arr,k));
    }

    public static int maximumSum(int[]arr, int k)
    {
        int sum=0;
        for(int i=0; i<k; i++)
            sum+=arr[i];
        int ans=0;
        for (int i = k; i < arr.length; i++) {
            sum=(sum+arr[i])-arr[i-k];
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}

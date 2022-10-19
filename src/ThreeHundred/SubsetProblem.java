package ThreeHundred;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetProblem {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int[]arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =s.nextInt();
        }
        int k=s.nextInt();
        ArrayList<Integer> ans= new ArrayList<>();
       printSubset(arr,0,0,k,ans);
        System.out.println(countSubset(arr,n,k));
    }

    public static void printSubset(int[]arr, int i, int sum,int k, ArrayList<Integer> ans)
    {
        // 1 2 3


    }
    public static int countSubset(int[]arr, int n,int sum)
    {
        if(n==0)
            return (sum==0)?1:0;
        return countSubset(arr, n-1, sum)+ countSubset(arr,n-1,sum-arr[n-1]);
    }
}

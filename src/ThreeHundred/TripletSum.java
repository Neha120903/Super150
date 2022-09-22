package ThreeHundred;

import java.util.*;
public class TripletSum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n;i++)
            arr[i] =s.nextInt();
        Arrays.sort(arr);
        int target = s.nextInt();
        tripletSum(arr,n,target);
    }
    public static void tripletSum(int []arr, int n , int target)
    {
        for(int i=0; i<n-2;i++)
        {
            int left = i+1;
            int right =n-1;
            while(left < right)
            {
                if(arr[i]+arr[left]+arr[right] == target)
                {
                    System.out.print(arr[i]+", "+arr[left]+" and "+arr[right]);
                    System.out.println();
                    left++;
                    right--;
                }
                else if(arr[i]+arr[left]+arr[right] > target)
                    right--;
                else
                    left++;
            }
        }
    }
}

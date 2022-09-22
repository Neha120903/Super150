package SlidingWindow;

import java.util.Scanner;

public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[] arr={1,2,4,3,5,2,3};
        int k=10;
        System.out.println(NoOfSubArray(arr,k));

    }

    public static int NoOfSubArray(int[]arr, int k)
    {
        int ans=0;
        int strt =0;
        int end=0;
        int p=1;
        while(end <arr.length)
        {
            //grow window
            p *= arr[end];



            //window shrink kro
            while( p >=k && strt <= end)
            {
                p = p/arr[strt];
                strt++;
            }

            //ans calculate kro
            ans = ans+ (end-strt +1);
            end++;
        }
        return ans;
    }
}

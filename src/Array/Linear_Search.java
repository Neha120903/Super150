package Array;

import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = {2,3,-1,4,7,11,9};
        //int target = sc.nextInt();
       // System.out.println(check(arr,target));
        System.out.println(minimumValue(arr));

    }
    public static int check(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    public static int minimumValue(int []arr)
    {
        int min = Integer.MAX_VALUE;
        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
                index=i;
            }
        }
       return index;
    }
}

import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,1,2,3};
        int k=3;
        rotate1(arr,k);
        for (int i = 0; i <arr.length ; i++) {                                         //4 5 6 1 2 3
            System.out.println(arr[i]+" ");
        }
    }
    //brute froce
    public static void rotate(int[] arr, int k)
    {
        int n= arr.length;
        k = k%n;
        while(k>0) {
            int temp = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = temp;
            k--;

        }
    }

    //reversal algorithm

    //2 - from first n-k element
    //3- then reverse entire array

    public static void rotate1(int []arr, int k)
    {
        int n = arr.length;
        k=k%n;
        // 1 - last s k elements ko reverse kre h
        rangereverse(arr,n-k,n-1);
        rangereverse(arr,0,n-k-1);
        rangereverse(arr,0,n-1);
    }
    public static void rangereverse(int [] arr, int i, int j)
    {
        int start = i;
        int end = j;
        while (start<end)
        {
            int temp = arr[end];
            arr[end]= arr[start];
            arr[start]= temp;
            start++;
            end--;
        }
    }

}

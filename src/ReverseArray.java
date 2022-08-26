import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] =s.nextInt();
        reverseArray(arr,n);
        for (int i=0; i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void reverseArray(int [] arr, int n)
    {
        int start = 0;
        int end = n-1;
        while (start<end)
        {
            int temp = arr[end];
            arr[end]= arr[start];
            arr[start]= temp;
            start++;
            end--;
        }
    }

    public static void Rangereverse(int [] arr, int i, int j)
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

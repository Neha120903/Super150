package DivideAndConquer;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] ={5,7,2,3,8,9,1,4};
        sort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static void sort(int[]arr, int s, int e)
    {
        if(s>e)
            return;
        int p=partition(arr,s,e);
        sort(arr,s,p-1);
        sort(arr,p+1,e);
    }

    public static int partition(int[]arr, int si, int ei)
    {
        int item=arr[ei];
        int pi=si;
        for (int i = si; i <ei ; i++) {
            if(arr[i] < item)
            {
                int t= arr[pi];
                arr[pi] = arr[i];
                arr[i] = t;
                pi++;
            }
        }
        int t= arr[pi];
        arr[pi] = arr[ei];
        arr[ei] = t;
        return pi;
    }
}

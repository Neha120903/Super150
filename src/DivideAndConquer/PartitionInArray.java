package DivideAndConquer;

public class PartitionInArray {
    public static void main(String[] args) {
        int arr[] ={5,7,2,3,8,9,1,4};
        int ans= partition(arr,0,arr.length-1);
        System.out.println(ans);
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


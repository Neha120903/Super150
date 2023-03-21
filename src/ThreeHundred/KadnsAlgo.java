package ThreeHundred;

public class KadnsAlgo {
    public static void main(String[] args) {
        int arr[] ={-10,-10,11,12,-15};
        int ans=max(arr,arr.length);
        System.out.println(ans);
    }
    public static int max(int[]arr, int n)
    {
        int maxSum=Integer.MIN_VALUE;
        int maxEnd=0;
        for(int i=0;i<n;i++)
        {
            maxSum+=arr[i];
            if(maxEnd <maxSum)
                maxEnd=maxSum;
            if(maxSum<0)
                maxSum=0;
        }
        return maxEnd;
    }

}

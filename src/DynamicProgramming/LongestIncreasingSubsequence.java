package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int []arr={10,9,2,5,3,7,101,18};
        System.out.println(lis(arr));
    }
    public static int lis(int []arr){

        int []dp= new int[arr.length];
        Arrays.fill(dp,1);
        for(int i=0;i< arr.length;i++)
        {
            for (int j = i-1; j >=0 ; j--) {
                if(arr[i] > arr[j])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            }
        }
        int max=dp[0];
        for (int i = 0; i <dp.length ; i++) {
            if(dp[i] >max)
                max=dp[i];
        }
        return max;
    }

    //nlogn

    public int lisT(int []arr)
    {
        int []dp= new int[arr.length];
        dp[0]=arr[0];
        int len=1;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] >dp[len-1]){
                dp[len]=arr[i];
                len++;
            }
            else {
                int ith=search(dp,0,len-1,arr[i]);
                dp[ith]=arr[i];
            }
        }
        return len;
    }

    public int search(int []dp, int s, int e,int ele)
    {
        int ans=0;
        while(s<=e)
        {
            int mid=(e+s)/2;
            if(dp[mid] >= ele)
            {
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}


package DynamicProgramming;
import java.util.*;
public class BurstBallons {
    class Solution {
        public int maxCoins(int[] nums) {

            int arr[]=new int[nums.length+2];
            int dp[][]=new int[arr.length][arr.length];
            for(int []a:dp)
                Arrays.fill(a,-1);
            arr[0]=1;
            arr[arr.length-1]=1;
            for(int i=1;i<arr.length-1;i++)
            {
                arr[i]=nums[i-1];
            }
            return Burst(arr,0,arr.length-1,dp);
        }
        public  int Burst(int []arr,int s,int e,int [][]dp)
        {
            if(s+1==e)
                return 0;
            if(dp[s][e]!=-1)
                return dp[s][e];
            int ans=Integer.MIN_VALUE;
            for(int k=s+1;k<e;k++)
            {
                int left=Burst(arr,s,k,dp);
                int right=Burst(arr,k,e,dp);
                int self=arr[s]*arr[k]*arr[e];
                ans=Math.max(ans,self+left+right);
            }
            return dp[s][e]=ans;
        }
    }
    public static void main(String[] args) {
        int []nums={3,1,5,8};
        int arr[]=new int[nums.length+2];
        arr[0]=1;
        arr[arr.length-1]=1;
        for(int i=1;i<arr.length-1;i++)
        {
            arr[i]=nums[i-1];
        }
       // System.out.println(Burst(arr,0,arr.length-1));
    }

//    public static int Burst(int []arr,int s,int e)
//    {
//        if(s+1==e)
//            return 0;
//
//        int ans=Integer.MIN_VALUE;
//        for(int k=s+1;k<e;k++)
//        {
//            int left=Burst(arr,s,k);
//            int right=Burst(arr,k,e);
//            int self=arr[s]*arr[k]*arr[e];
//            ans=Math.max(ans,left+self+right);
//        }
//        return ans;
//    }

    public int BUrstTD(int []arr,int s,int e)
    {
        int dp[][]=new int[arr.length][arr.length];
        for(int slide=2;slide<arr.length;slide++)
        {
            for (int j=slide;j<dp.length;j++)
            {
                int i=j-slide;
                int ans=Integer.MIN_VALUE;
                for(int k=i+1;k<j;k++)
                {
                    int left=dp[i][k];
                    int right=dp[k][j];
                    int self=arr[i]*arr[k]*arr[j];
                    ans=Math.max(ans,self+left+right);
                }
                dp[i][j]=ans;
            }
        }
        return dp[0][dp.length-1];
    }
}


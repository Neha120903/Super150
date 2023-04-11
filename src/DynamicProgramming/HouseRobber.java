package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    public static int rob(int []arr, int i)
    {
        if(i>=arr.length)
            return 0;
        int rob =arr[i]+rob(arr,i+2);
        int notrob = rob(arr,i+1);
        return Math.max(rob,notrob);

    }

    public static void main(String[] args) {
        int arr[]= {3,1,2,4};
        System.out.println(rob(arr,0));
        int dp[]= new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(robTD(arr,0,dp));
    }

    public static int robTD(int []arr, int i,int []dp)
    {
        if(i>=arr.length)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int rob =arr[i]+rob(arr,i+2);
        int notrob = rob(arr,i+1);
        return dp[i]=Math.max(rob,notrob);
    }

    public static int robBU(int []arr)
    {
        if(arr.length==1)
            return arr[0];
        int []dp= new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);

        for (int i = 2; i <dp.length ; i++) {
            int rob=arr[i]+dp[i-2];
            int notrob=dp[i-1];
            dp[i]=Math.max(rob,notrob);
        }
        return dp[dp.length-1];
    }
}

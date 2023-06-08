package DynamicProgramming;

import java.util.Arrays;

public class MaxDotProductofTwoSubsequences {
    public static void main(String[] args) {
    int []a={2,1,-2,5};
    int []b={3,0,-6};
        //System.out.println(solve(a,b,0,0,true));
        int [][]dp= new int[a.length][b.length];
        for(int i[]:dp)
            Arrays.fill(i,-10000000);
        System.out.println(solve(a,b,0,0,true,dp));
    }
    public static int solve(int[]a,int[] b, int i,int j,boolean flag,int[][]dp){
        if(i==a.length || j==b.length){
            if(flag)
                return 0;
            else
                return -10000000;
        }
        if(dp[i][j]!=-10000000)
            return dp[i][j];
        int dot=a[i]*b[j]+solve(a,b,i+1,j+1,true,dp); //dp[i-1][j-1]
        int fd=solve(a,b,i+1,j,false,dp);//dp[i-1][j]
        int sd=solve(a,b,i,j+1,false,dp);//dp[i][j-1]
        return dp[i][j]=Math.max(a[i]*b[j],Math.max(dot,Math.max(fd,sd)));
    }

    public static int pro(int []a,int[]b)
    {
        int sp=Integer.MIN_VALUE;
        int dp[][]= new int[a.length+1][b.length+1];
        for (int i = 1; i <dp.length; i++) {
            for (int j = 1; j <dp[0].length ; j++) {
                int dot=a[i-1]*b[j-1]+dp[i-1][j];
                int fd=dp[i-1][j];
                int sd=dp[i][j-1];
                dp[i][j]=Math.max(a[i]*b[j],Math.max(dot,Math.max(fd,sd)));
                sp=Math.min(sp,a[i-1]*b[j-1]);
            }
        }
        if(dp[dp.length-1][dp[0].length-1]==0)
            return -1;
        return dp[dp.length-1][dp[0].length-1];
    }
}

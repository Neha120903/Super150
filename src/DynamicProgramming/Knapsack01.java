package DynamicProgramming;

public class Knapsack01 {

        //Function to return max value that can be put in knapsack of capacity W.
        static int knapSack(int W, int wt[], int val[], int n)
        {
            // your code here
            int dp[][]=new int[n][W+1];
            for(int i=wt[0];i<=W;i++)
            {
                dp[0][i]=val[0];
            }
            for(int i=1;i<n;i++)
            {
                for(int j=0;j<=W;j++)
                {
                    int notake=dp[i-1][j];
                    int take=Integer.MIN_VALUE;
                    if(wt[i]<=j)
                        take=val[i]+dp[i-1][j-wt[i]];
                    dp[i][j]=Math.max(take,notake);
                }
            }
            return dp[n-1][W];
        }


}

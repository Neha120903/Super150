package DynamicProgramming;

public class CoinChange {
    public static void main(String[] args) {
        int amount=5;
        int cost[]={1,2,5};
        System.out.println(coinChange(cost,amount,0));
    }
    public static int coinChange(int []coin, int amount,int idx){
        if(amount==0)
            return 1;
        if(idx==coin.length)
            return 0;
        int inc=0,exc=0;
        if(coin[idx] <=amount)
        {
            inc=coinChange(coin,amount-coin[idx],idx);
        }
        exc=coinChange(coin,amount,idx+1);
        return inc+exc;
    }

    public static int CoinChange(int[]coin,int amount)
    {
        int[][]dp=new int[coin.length][amount+1];
        for (int i = 0; i <dp.length ; i++) {
            dp[i][0]=1;
        }
        for (int i = 0; i <dp.length ; i++) {
            for (int am = 0; am <dp[0].length ; am++) {
                int inc=0,exc=0;
                if(coin[i-1] <=am)
                {
                    inc=dp[i][am-coin[i-1]];
                }
                exc=dp[i-1][am];
                dp[i][am]= inc+exc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}

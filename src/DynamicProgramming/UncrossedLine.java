package DynamicProgramming;

public class UncrossedLine {
    public static void main(String[] args) {
        int []arr={1,4,2};
        int []arr2={1,2,4};
        System.out.println(Lines(arr,arr2));
    }
    public static int Lines(int []a1,int []a2)
    {
        int[][]dp=new int[a1.length+1][a2.length+1];
        for (int i = 1; i <dp.length ; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int ans = 0;
                if (a1[i - 1] == a2[j - 1])
                    ans = 1 + dp[i - 1][j - 1];
                else {
                    ans = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                dp[i][j] = ans;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}

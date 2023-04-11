package DynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int n=45;
        //System.out.println(fib(45));

        //System.out.println(fib(dp,n));
        System.out.println(fib(n));
    }
    public static int fib(int n)
    {
//        if(n==0|| n==1)
//            return n;
//        return fib(n-1)+fib(n-2);


        //TD
//        if(n==0|| n==1)
//            return n;
//        if(dp[n]!=0)
//            return dp[n]; //dp apply krna
//        int f1=fib(dp,n-1);  //dp[n-1]
//        int f2=fib(dp,n-2);
//        return dp[n]=f1+f2;//dp[n-1]+dp[n-2]


        //BU
        int []dp= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <dp.length ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

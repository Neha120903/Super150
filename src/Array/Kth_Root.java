package Array;

import java.util.Scanner;

public class Kth_Root {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t >0)
        {
            long n =s.nextLong();
            int k =s.nextInt();

            int x = kthRoot(n,k);
            System.out.println(x);
            t--;
        }
    }

    private static int kthRoot(long n, int k) {
        // TODO Auto-generated method stub
        for (int i=1; i>0; i++) 				// ye loop infinite me dalega bt kv na kv break hoga return pe
        {
            long product=1;								//// bcaz ans of product is going to be biggest
            for(int j=1;j<=k;j++)
            {
                product = product*i;
//				System.out.println(product+" =====xxx");
            }

            if(product==n)
                return i;

            if(product>n)
                return i-1;
        }

        return 1;									// ye unreachable part hai bs fn ka syntax bnaye rkhne k iye
    }


}

package ThreeHundred;

import java.util.Scanner;

public class Replace0with5 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        System.out.println(replaceZero(n));
    }

    public static int replaceZero(int n)
    {
        if(n == 0)
            return 5;
        else
            return helper(n);
    }

    public static int helper(int n)
    {
        if(n==0)
            return 0;
        int digit = n%10;
        if(digit==0)
            digit=5;
        return helper(n/10) * 10+digit; //converting the remaining digit and adding the last digit
    }
}

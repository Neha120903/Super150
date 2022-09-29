package Recursion;

import java.util.Scanner;

public class DiceProblem {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = 4;
        int dice =s.nextInt();
        throwDice(dice,0,n,"");
    }

    private static void throwDice(int dice,int curr, int end, String ans) {
        if(curr == end)
        {
            System.out.println(ans);
            return;
        }
        if(curr>end)
            return;
//        throwDice(curr+1,end,ans+1);
//        throwDice(curr+2,end,ans+2);
//        throwDice(curr+3,end,ans+3);
        for (int i = 1; i <=dice; i++) {
            throwDice(dice,curr+i,end,ans+i);
        }
    }
}

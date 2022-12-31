package ThreeHundred;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        int [][]arr= new int[n][n];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        findCelebrity(arr,n);
    }

    public static int findCelebrity(int [][]arr, int n)
    {
        Stack<Integer> s= new Stack<>();
        int c;
        for (int i = 0; i < n; i++) {
            s.push(i);
        }

        while(s.size()>1)
        {
            int a=s.pop();
            int b=s.pop();

            if(knows(a,b,arr))
                s.push(b);
            else
                s.push(a);
        }
        if(s.isEmpty())
            return -1;
        c=s.pop();
        for (int i = 0; i < n; i++) {
            if(i!=c && ((knows(c,i,arr)) ||(!knows(i,c,arr))))
                return -1;
        }
        return c;
    }

    private static boolean knows(int a, int b, int[][]arr) {
        return (arr[a][b]==1) ? true:false;
    }
}

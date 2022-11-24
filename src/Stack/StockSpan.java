package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] stock = new int[n];
        for (int i = 0; i < n; i++) {
            stock[i]=sc.nextInt();
        }
        sp(stock);
    }

    public static void sp(int[]arr)
    {
        Stack<Integer> s= new Stack<>();
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i] >=arr[s.peek()])
            {
              s.pop();
            }
            if(!s.isEmpty())
                ans[i]=i-s.peek();
            else
                ans[i]=i+1;
            s.push(i);
        }
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}

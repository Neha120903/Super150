package ThreeHundred;
/*Input: N = 7, price[] = [100 80 60 70 60 75 85]
  Output: 1 1 1 2 1 4 6 */
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[]stock= new int[n];
        for (int i=0;i<n;i++)
            stock[i]=s.nextInt();
        span(stock,n);

    }
    public static void span(int[] arr, int n)
    {
        Stack<Integer> s = new Stack<>();
        int[]ans= new int[n];
        for (int i = 0; i < n; i++) {
            //s.push(i);
            while(!s.isEmpty() && arr[s.peek()]<= arr[i])
            {
                s.pop();
            }
            if(s.isEmpty()==false)
            {
                ans[i]= i-s.peek();
            }
            if (s.isEmpty())
                ans[i]=i+1;
            s.push(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }

}

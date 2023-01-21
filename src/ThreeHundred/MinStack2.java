package ThreeHundred;
import java.util.*;
public class MinStack2 {
    public static void main (String args[]) {
       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt();
       String arr[]= new String[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.next();
        }
        Stack<Integer> s= new Stack<>();
        int minElement=Integer.MAX_VALUE;
        int c=-1;

        while (sc.hasNextInt())
        {

                int x = sc.nextInt();
                if (s.isEmpty()) {
                    s.push(x);
                    minElement = x;
                } else if (x < minElement)   // if the current value is less than the minimum value then we store the current-minvalue
                {
                    minElement = x;
                    s.push(x - minElement);
                } else
                    s.push(x);
                System.out.println("push " + x);
                c++;

        }
        System.out.println(c);
        while(c<n)
        {
            if(arr[c].equals("pop"))
            {
                int t=s.pop();
                if(t<=0)
                {
                    int res=minElement;
                    minElement = minElement -t;
                    System.out.println("pop "+res);
                }
                System.out.println("pop "+t);
                c++;
            }

        }
    }
}

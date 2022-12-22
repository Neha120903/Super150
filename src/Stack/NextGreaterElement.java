package Stack;
import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,7};
//        NGE(arr);
        long arr[] = {1,2,3,4};
        long[] ans=nextLargerElement(arr, arr.length);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static void NGE(int[]arr)
    {
        int[] ans= new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i]>arr[s.peek()])
            {
                ans[s.pop()]=arr[i];
            }
            s.push(i);
        }
        while (!s.isEmpty())
        {
            ans[s.pop()]=-1;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static long[] nextLargerElement(long[] arr, int n) {
        long []ans = new long[n];
        Stack<Integer> s= new Stack<>();
        for (int i=0;i<n;i++)
        {
            while(!s.isEmpty() && arr[i] >arr[s.peek()])
                ans[s.pop()] = arr[i];
            s.push(i);

        }
        while (!s.isEmpty())
            ans[s.pop()]=-1;
        return ans;
    }



    }

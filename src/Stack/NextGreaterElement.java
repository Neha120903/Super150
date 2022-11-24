package Stack;
import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {10,2,1,3,5,4,8,7};
        NGE(arr);
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
}

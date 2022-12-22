package ThreeHundred;

import java.util.Stack;

public class PreviousGreater {
    public static void main(String[] args) {
        int [] arr={25,20,2,5};
        prevGreater(arr,arr.length);
    }

    public static void prevGreater(int []arr, int n)
    {
        Stack<Integer> s= new Stack<>();
        s.push(arr[0]);
        System.out.print(-1+" "); // for first element it is always -1 bcz there is no greater element in left
        for(int i=1;i<n;i++)
        {
            while(s.isEmpty()==false && s.peek()<arr[i])
                s.pop();
            if(s.isEmpty()) // when stack is empty
                System.out.print(-1+" ");
            else
                System.out.print(s.peek()+" "); // when stack is not empty
            s.push(arr[i]);
        }

    }
}

package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        java.util.Stack<Integer> s= new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }

    public static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
            return;
        int x=s.pop();
        reverse(s);
        insert(s,x);
    }

    public static void insert(Stack<Integer> s, int item)
    {
        if(s.isEmpty())
            s.add(item);
        else{
            int q=s.pop();
            insert(s,item);
            s.push(q);
        }
    }
}

package Stack;
import java.util.Stack;

public class Insert_Down {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        insert(s,-3);
        System.out.println(s);
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

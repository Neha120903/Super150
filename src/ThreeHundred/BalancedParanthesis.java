package ThreeHundred;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String s="{([])}";
        System.out.println(ispar(s));
    }
    static boolean ispar(String s)
    {
        // add your code here
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{' || s.charAt(i)=='['|| s.charAt(i)=='(')
                st.push(s.charAt(i));

            else{
                if(st.isEmpty())
                    return false;
                else if(match(s.charAt(i),st.peek()) == false)
                    return false;
                else
                    st.pop();
            }
        }
        return st.isEmpty();
    }

    static boolean match(char a, char b)
    {
        return ((a==']' && b=='[')
                ||(a=='}' && b=='}')
                ||(a==')' && b=='('));
    }
}

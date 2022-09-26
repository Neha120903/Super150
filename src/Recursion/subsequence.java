package Recursion;
/* subsequence and substring both are increasing and order is maintained
* s=abc  ab is substring and ac is subsequence  =>  */
public class subsequence {

    public static void main(String[] args) {
        String s="abc";
        String ans="";

        printSubsequence(s,"");
    }
    public static void printSubsequence(String ques, String ans)
    {
        if(ques.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }
        char ch = ques.charAt(0);
        printSubsequence(ques.substring(1),ans);
        printSubsequence(ques.substring(1),ans+ch);

    }
}

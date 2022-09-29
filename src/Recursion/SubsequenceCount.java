package Recursion;

public class SubsequenceCount {
    static int count=0;
    public static void main(String[] args) {
        String s="abbgjc";
        String ans="";
//        printSubsequence(s,"");
//        System.out.println(count);
        System.out.println(countSubsequence(s,""));
    }
    public static void printSubsequence(String ques, String ans)
    {
        if(ques.length()==0)
        {
            System.out.print(ans+" ");
            count++;
            return;
        }
        char ch = ques.charAt(0);
        printSubsequence(ques.substring(1),ans);
        printSubsequence(ques.substring(1),ans+ch);

    }

    public static int countSubsequence(String ques, String ans)
    {
        if(ques.length()==0)
        {
            return 1;
        }
        char ch = ques.charAt(0);
        int ans1=countSubsequence(ques.substring(1),ans);
        int ans2=countSubsequence(ques.substring(1),ans+ch);
        return ans1+ans2;
    }
}

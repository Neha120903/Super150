package DynamicProgramming;
//variation of coin change
public class DistinctSubsequences {
    public static void main(String[] args) {
        String s="rabbbit";
        String t="rabit";
        System.out.println(numDistinct(s,t,0,0));

    }
    //i for s and j for t
    //s coin and t amount
    public static int numDistinct(String s, String t, int i, int j) {
        if(j==t.length())
            return 1;
        if(i==s.length())
            return 0;
        int inc=0,exc=0;
        if(s.charAt(i)==t.charAt(j))
            inc=numDistinct(s,t,i+1,j+1);
        exc=numDistinct(s,t,i+1,j);//coin bhdaynge
        return inc+exc;
    }

}

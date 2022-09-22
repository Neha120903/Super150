package String;

public class SubstringPrint {
    public static void main(String[] args) {
        String s = "Hello";
        int c=1;
        int n =s.length();
        while(c<=n) {
            for (int i = 0; i <= n - c; i++) {
                System.out.println(s.substring(i,i+c));
            }
            c++;
        }
    }

    public static void Substring(String s)
    {
        for(int len =1; len<=s.length();len++)
        {
            for(int j=len; j<=s.length();j++)
            {
                int i=j-len;
                System.out.println(s.substring(i,j));
            }
        }
    }

}

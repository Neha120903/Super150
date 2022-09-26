package ThreeHundred;
/*Sample Input
aaabbccds
Sample Output
a3b2c2d1s1*/
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();

        String str=compressString(s);
        System.out.println(str);
    }

    public static String compressString(String s)
    {
        String str= "";
        int c=1;
        for(int i=0; i<s.length()-1;i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                c++;
            }
            if(s.charAt(i)!=s.charAt(i+1))
            {
                str+=s.charAt(i);
                str=str+c;
                c=1;
            }
        }
        str=str+s.charAt(s.length()-1)+c;
        return str;
    }
}

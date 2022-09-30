package ThreeHundred;
import java.util.Scanner;
public class StringsCompression {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String str = compressString(s);
        System.out.println(str);
    }

    public static String compressString(String s) {
        String str = "";
        int c = 1;
        int f[]= new int[26];
        for (int i = 0; i < s.length() - 1; i++) {
            if (f[s.charAt(i)-'0'] == 0)
                f[s.charAt(i)-'0']=f[s.charAt(i)-'0']+1;
            else
                f[s.charAt(i)-'0']++;
        }
        for (int i=0;i<s.length();i++)
        {
            if(f[i]>1)
                str=str+s.charAt(i)+f[i];
            else
                str=str+s.charAt(i);
        }
        return str;
    }
}

package ThreeHundred;
import java.util.Scanner;
public class NonRepeatingCharacter {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int index=nonRepeating(s);
            if(index==-1)
                System.out.println(index);
            else{
                System.out.println(s.charAt(index));
            }
        }
    }

    public static int nonRepeating(String s)
    {
        int freq[] = new int[256];
        for(int i=0; i<256;i++)
            freq[i]=-1;
        for(int i=0; i<s.length();i++)
        {
            if(freq[s.charAt(i)] == -1)
            {
                freq[s.charAt(i)] = i;
            }
            else{
                freq[s.charAt(i)]=-2;
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0; i<256; i++)
        {
            if(freq[i]>= 0)
            {
                res=Math.min(res,freq[i]);
            }
        }
        if(res==Integer.MAX_VALUE)
            return -1;
        return res;
    }
}

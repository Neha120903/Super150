package String;

import java.util.*;
public class PLayingWithGoodString {

        public static void main(String args[]) {
            // Your Code Here
            Scanner s= new Scanner(System.in);
            String s1 = s.next();
            int c=0;
            int max=0;
            for(int i=0; i< s1.length();i++)
            {
                if(s1.charAt(i)=='a' || s1.charAt(i) =='e' || s1.charAt(i) == 'i'||s1.charAt(i) == 'o'||s1.charAt(i) == 'u')
                {
                    c++;

                }
                else{
                    c=0;
                }
                if(c>max)
                    max=c;
            }
            System.out.print(max);

        }
    }


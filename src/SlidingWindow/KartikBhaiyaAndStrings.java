package SlidingWindow;

import java.util.Scanner;

public class KartikBhaiyaAndStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "abba";
        int k=3;
        int flipa = countSubstring(str,'a',k);
        int flipb=countSubstring(str,'b',k);
        System.out.println(Math.max(flipa,flipb));
    }

    public static int countSubstring(String s,char ch, int k)
    {
        int strt=0;
        int end=0;
        int ans=0;
        int flip=0;
        while(end <s.length())
        {
            //grow window
            if(s.charAt(end) == ch){
                flip++;
            }
            //shrink window
            while(flip >k)
            {
                if (s.charAt(strt)==ch )
                {
                    flip--;

                }
                strt++;
            }
            ans=Math.max(ans,end-strt+1);
            end++;
        }
        return ans;
    }
}

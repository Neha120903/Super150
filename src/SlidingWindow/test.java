package SlidingWindow;

import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int row = 1;
        int star =1;
        int space = n/2;
        while(row<=n)
        {
            int j=1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;
            }
            if(row<=n/2)
                space--;
            else
                space++;
            int i=1;
            while(i<=star)
            {
                System.out.print(" *");
                i++;
            }
            if(row<=n/2)
                star+=2;
            else
                star-=2;
            row++;
            System.out.println();
        }
    }
}

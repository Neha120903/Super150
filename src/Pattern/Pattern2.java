package Pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        // next
       /* int row =1;
        int star = n;
        int space = 0;
        while(row<=n)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=star)
            {
                System.out.print("*");
                j++;
            }
            space += 2;
            star--;
            System.out.println();
            row++;
        }*/
   // pattern 9
    /*    int row = 1;
        int star = 1;
        int space = n-1;
        while(row<= n)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print(" ");
                i++;
            }
            space--;
            int j=1;
            while(j<=star)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            star += 2;
            row++;
        }
     */

        // Pattern 11
     /*   int row =1;
        int star = 1;
        int space = n-1;
        while(row<= n) {
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }
            space--;
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            star += 1;
            row++;
        }*/

        //Pattern 13  => mirroring is can be only done in horizontally not vertically
        int row =1;
        int star = 1;
        int space = n-1;
        while(row<= 2*n-1) {

            int j = 1;
            while (j <= star) {
                    System.out.print(" *");
                j++;
            }
            if(row<n)
                star++;
            else
                star--;
            System.out.println();
            row++;
        }
        /*
        int row =1;
        int star = n;
        int space = 0;
        while(row<=2*n-1) {
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print(" *");
                j++;
            }
            if(row >= n){
                star++;
                space -=2;
            }

            else {
                star--;
                space += 2;
            }

            System.out.println();
            row++;
        }*/
    }
}

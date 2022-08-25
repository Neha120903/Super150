import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        // next
        int row =1;
        int star = 1;
        int space = n-1;
        while(row<=n)
        {
            int i=1;
            while(i<= space)
            {
                System.out.print("  ");
                i++;
            }
            space--;
            int j=1;
            while(j<=star)
            {
                System.out.print("* ");
                j++;
            }
            star++;
            row++;
            System.out.println();
        }
    }
}

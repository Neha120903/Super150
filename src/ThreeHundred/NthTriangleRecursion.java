package ThreeHundred;

import java.util.Scanner;

public class NthTriangleRecursion {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(nthValue(n));
    }
    public static int nthValue(int n)
    {
        if(n==1)
            return 1;
        return n+nthValue(n-1);
    }
}

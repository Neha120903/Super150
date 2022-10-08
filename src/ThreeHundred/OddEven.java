package ThreeHundred;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        printOddEven(n);
    }

    public static void printOddEven(int n)
    {
        if(n==0)
        {
            return;
        }
        if(n%2==1){
            System.out.println(n);
        }
        printOddEven(n-1);
        if(n%2==0)
        {
            System.out.println(n);
        }
    }
}

package Recursion;

import java.util.Scanner;

public class Nprint {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        //int n =s.nextInt();
       // print(n);
        //Rprint(n);
       // TailFac(n,1);
        System.out.println(powOf(2,5));

    }
    public static void print(int n)
    {
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n-1);
    }
    public static void Rprint(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        Rprint(n-1);
        System.out.println(n);
    }

    public static void TailFac(int n,int ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        ans*=n;
        TailFac(n-1,ans);
    }

    public static int powOf(int a, int b)
    {
        if(b==1)
        {
            return a;
        }
        return a* powOf(a,b-1);

    }
}


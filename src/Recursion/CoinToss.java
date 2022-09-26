package Recursion;

public class CoinToss {
    public static void main(String[] args) {
        int n =3;
        String s ="HT";
        //toss(3,"",0);
        coinToss(3,"");
    }
    public static void toss(int n, String s, int i)
    {
        if(i >=n)
        {
            System.out.println(s);
            return;
        }
        toss(n,s+"H",i+1);
        toss(n,s+"T", i+1);
    }
    public static void coin(int n, String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        coin(n-1,ans+"H");
        coin(n-1,ans+"T");
    }

    //two consecutive head should not be there
    public static void coinToss(int n, String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        if(ans.length() ==0)
            coinToss(n-1,ans+"H");
        if(ans.length() !=0 && ans.charAt(ans.length()-1)!='H')
        {
            coinToss(n-1,ans+"H");

        }
        coinToss(n-1,ans+"T");
    }
}

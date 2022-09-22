package Recursion;

public class CoinToss {
    public static void main(String[] args) {
        int n =3;
        String s ="HT";
        toss(3,"",0);
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
}

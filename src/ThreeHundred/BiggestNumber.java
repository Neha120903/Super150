package ThreeHundred;
import java.util.Arrays;
import java.util.Scanner;
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n = sc.nextInt();
            int arr[]= new int[n];
            for (int i=0; i<n;i++)
                arr[i]=sc.nextInt();
            String s[] =largestNumber(arr,n);
            for (int i = n-1; i >=0; i--) {
                System.out.print(s[i]);
            }
        }
    }

    public static String[] largestNumber(int[]arr, int n)
    {
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = arr[i]+"";
        }
        Arrays.sort(s, (a,b) -> {
                    long n1 = Long.parseLong(a+b);
                    long n2 = Long.parseLong(b+a);

                    if(n1 > n2)
                        return 1;
                    else if( n1 < n2)
                        return -1;
                    else
                        return 0;
                    });
       return s;

    }

}

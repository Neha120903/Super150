import java.util.Scanner;

public class DivisibleSubarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        while (t-->0)
        {
            int n =s.nextInt();
            int arr[] = new int[n];
            for (int i=0; i<n;i++)
                arr[i] =s.nextInt();
            int freq[] = new int[n];
            freq[0] =1;
            long sum =0;
            for (int i = 0; i <n ; i++) {
                sum = sum+arr[i];
                int  indx = (int) (sum % n);
                if(indx<0)
                    indx+=n;
                freq[indx]++;
            }
            long ans=0;
            for (int i=0; i<n;i++) {
                long p = 0;
                if (freq[i] >= 2) {
                    p = freq[i];
                }
                ans = ans + (p * (p - 1) / 2);
            }
            System.out.println(ans);
        }

    }
}

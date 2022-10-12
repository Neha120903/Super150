package ThreeHundred;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
        }
        int k=sc.nextInt();
        lastIndex(arr,k,n,n-1);                             // 2 3 4
    }

    public static void lastIndex(int[]arr, int k, int n, int i)
    {
        if(i <= 0) {
            System.out.println("-1");
            return;
        }
        if(arr[i] == k){
            System.out.println(i);
            return;
        }

        lastIndex(arr,k,n,i-1);

    }
}

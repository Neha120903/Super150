package ThreeHundred;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
        }
        int k=sc.nextInt();
        firstIndex(arr,k,n,0);                             // 2 3 4
    }

    public static void firstIndex(int[]arr,int k, int n, int i)
    {
        if(i >= n) {
            System.out.println("-1");
            return;
        }
        if(arr[i] == k){
            System.out.println(i);
            return;
        }

        firstIndex(arr,k,n,i+1);

    }



}

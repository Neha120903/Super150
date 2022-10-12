package Recursion;

public class Coin_Permutation {
    public static void main(String[] args) {
        int arr[] ={2,3,5,7};

        int sum=10;
        printCoin(arr,sum,"");
    }

    public static void printCoin(int[]arr, int sum, String ans)
    {
        if(sum ==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0; i< arr.length;i++) {
            if (sum >= arr[i]) {
                printCoin(arr, sum - arr[i], ans + arr[i]);
            }
        }
    }

}

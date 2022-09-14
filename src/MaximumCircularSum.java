import java.util.Scanner;
public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n = s.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<n;i++)
                arr[i] =s.nextInt();
            System.out.println(circularSum(arr,n));
        }
    }
    public static int circularSum(int[] arr, int n)
    {
        int ls = linearSum(arr,n);
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
            arr[i]=arr[i]*(-1);  // multiplying the negative values to make them positive so that we can get the max out of them and then subtract the max sum from opposite sign from normal sum
        }
        int ms = linearSum(arr,n);
        if(sum ==0)
            return sum;
        sum+= ms;
        return Math.max(ls,sum);  //ms=middlesum
    }

    public static int linearSum(int[] arr, int n)
    {
        int ans =0;
        int sum =0;

        for(int i: arr)
        {
            sum += i;
            ans=Math.max(ans,sum);
            if(sum <0)
                sum=0;
        }
        return ans;
    }

}

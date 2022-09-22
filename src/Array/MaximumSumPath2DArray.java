package Array;

import java.util.*;
public class MaximumSumPath2DArray {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while(t -->0)
        {
            int n1= s.nextInt();
            int n2= s.nextInt();
            int arr1[]= new int[n1];
            int arr2[] = new int[n2];

            for(int i=0; i<n1; i++)
                arr1[i]=s.nextInt();
            for(int i=0; i<n2; i++)
                arr2[i]=s.nextInt();
            System.out.println(sumFind(arr1, arr2, n1, n2));

        }
    }
    public static int sumFind(int[]arr1, int[]arr2, int n1, int n2)
    {

            int ans =0;
            int sum1=0;
            int sum2=0;
            int i=0;
            int j=0;
            while(i <n1 && j<n2)
            {
                if(arr1[i] < arr2[j])
                {
                    sum1+=arr1[i];
                    i++;
                }
                else if(arr1[i] > arr2[j])
                {
                    sum2+=arr2[j];
                    j++;
                }
                else{
                    ans+= Math.max(sum1,sum2);
                    sum1=0;
                    sum2=0;
                    ans+=arr1[i];
                    i++;
                    j++;
                }
            }


        while(i<n1) sum1+=arr1[i++];
        while(j<n2) sum2+=arr2[j++];
        ans += Math.max(sum1,sum2);
        return ans;


    }

}

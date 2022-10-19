package BackTracking;

import java.time.chrono.MinguoDate;
import java.util.Arrays;

public class CombinationSum2 {
    public static void main(String[] args) {
        int [] arr={10,1,2,7,6,1,5};
        int target=8;
        Arrays.sort(arr);
        Combination(arr,target,"", 0);
    }

    public static void Combination(int[]arr, int target, String ans, int indx)
    {

        if(target ==0)
        {
            System.out.println(ans);
            return;
        }
        for (int i = indx; i < arr.length; i++) {
            if(i!=indx && arr[i]==arr[i-1]) //check if it is first call and its prevoius value is not same then only we will call
            {
                continue;
            }
            if(arr[i] <= target)
            {
                Combination(arr,target-arr[i],ans+arr[i]+" ",i+1);
            }
        }
    }
}

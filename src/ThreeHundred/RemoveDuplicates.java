package ThreeHundred;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr ={0,0,1,1,1,1,2,3,3};
        check(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void check(int[]arr)
    {
        if(arr.length==0)
                return;
        int low=0;
        int high=low+1;
        int c=0;

        while(high<arr.length)
        {
            if(arr[low]==arr[high] && c>2)
            {
                c++;
                high++;
            }
            else if(arr[low]!=arr[high])
            {
                low=high;
                high=low+1;
                c=0;
            }
            if(c>=2) {
                while (arr[low] == arr[high]) {
                    high++;
                }
                while (high < arr.length && low < arr.length && arr[low] != arr[high]) {
                    int t = arr[low];
                    arr[low] = arr[high];
                    arr[high] = t;
                    low++;
                    high++;
                }
            }
        }
    }

}

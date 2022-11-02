package DivideAndConquer;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr ={2,3,1,4,5,8,-11};
        int []ans=Sort(arr,0,arr.length-1);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static int [] Sort(int[]arr, int s, int e)
    {
        if(s==e)
        {
            int []bs = new int[1];
            bs[0] =arr[s];
            return bs;
        }
        int mid =(s+e)/2;
        int [] fs= Sort(arr,s,mid);
        int [] ss=Sort(arr,mid+1,e);
        return MergeTwoArray(fs,ss);

    }

    public static int[] MergeTwoArray(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                ans[k] = arr2[j];
                j++;
                k++;
            } else {
                ans[k] = arr1[i];
                i++;
                k++;
            }
        }

        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;

    }
}
